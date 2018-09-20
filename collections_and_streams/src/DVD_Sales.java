import java.util.ArrayList;
import java.lang.System;

public class DVD_Sales {
    public static void main(String args[]){
        ArrayList<sale> sales_list = new ArrayList<sale>();

        fillList(sales_list);

        double total_DVD_sales = 0;

        for(sale pointer : sales_list){
            if(pointer.sale_item.equals("DVD")){
                total_DVD_sales += pointer.sale_price;
            }
        }

        System.out.println("total DVD sales in the last month is " + total_DVD_sales);
    }


    private static void fillList(ArrayList<sale> list){

        list.add(new sale("DVD", 15.00));
        list.add(new sale("book",20.00));
        list.add(new sale("bike", 100.00));
        list.add(new sale("DVD", 23.00));
    }
}
