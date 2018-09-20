import java.util.ArrayList;
import java.lang.System;

public class streamSales {

    public static void main(String args[]){
        ArrayList<sale> sales_list = new ArrayList<>();

        fillList(sales_list);

        double total_DVD_price = 0.0;

        total_DVD_price += sales_list.parallelStream()
                .filter((sale) -> sale.sale_item.equals("DVD"))
                .map( (sale) -> sale.sale_price)
                .reduce(0.0, (priceA, priceB) -> priceA + priceB);

        System.out.println("Total DVD sales equals to " + total_DVD_price);
    }


    private static void fillList(ArrayList<sale> list){
        list.add(new sale("DVD", 15.00));
        list.add(new sale("book",20.00));
        list.add(new sale("bike", 100.00));
        list.add(new sale("DVD", 23.00));
    }
}
