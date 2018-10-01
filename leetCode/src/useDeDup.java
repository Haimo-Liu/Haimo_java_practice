import java.lang.reflect.Array;
import java.util.Arrays;

public class useDeDup {

    public static void main(String args[]){
        removeDuplicatesUnsortedArray remove_dup = new removeDuplicatesUnsortedArray();
        int[] test_array = {1,4,7,8,12,13,7,7,7,7,7,7,8,2,3};

        remove_dup.removeDup(test_array);
    }
}
