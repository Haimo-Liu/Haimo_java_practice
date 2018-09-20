import java.util.ArrayList;
import java.util.Random;

public class dynamicArray {

    public static void main(String args[]){
        ArrayList<Integer> a0 = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i<10; i++){
            a0.add(random.nextInt(10));
        }

        for(int i: a0){
            System.out.print(a0.get(i));
        }
    }
}
