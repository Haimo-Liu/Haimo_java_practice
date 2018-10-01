import java.util.Arrays;

public class removeDuplicatesUnsortedArray {

    public int[] removeDup (int[] nums) {
        Arrays.sort(nums);

        int i=0;
        int total_n=0;

        for(int j=1; j<nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                total_n++;
                nums[i] = nums[j];
            }
        }

        total_n = total_n + 1;

        int[] de_dup = new int[total_n];
        for (int k=0; k<total_n; k++){
            de_dup[k] = nums[k];
            System.out.print(de_dup[k]);
        }


        return de_dup;

    }
}
