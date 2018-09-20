public class leetPivotIndex {
    int sum = 0; int left = 0;

    public int pivotIndex(int[] nums){

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        System.out.println("sum = " + sum);

        for(int i=0; i < nums.length; i++){
            if(i>0) {left += nums[i-1];}

            if(left == (sum - left - nums[i])){
                return i;
            }
        }

        return -1;
    }
}
