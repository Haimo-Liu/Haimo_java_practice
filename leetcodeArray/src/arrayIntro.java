import java.util.Arrays;
import java.util.Random;

public class arrayIntro {

    public static void main(String args[]){
        int[] a_array = new int[6];
        Random random = new Random();

        for(int i=0; i<6; i++){
            a_array[i] = random.nextInt(10);
        }

        for(int i=0; i<6; i++){
            System.out.println(a_array[i]);
        }

        Arrays.sort(a_array);

        for(int i=0; i<6; i++){
            System.out.println(a_array[i]);
        }

    }
}
