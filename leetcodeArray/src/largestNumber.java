public class largestNumber {
    public int findLargest (int[] nums){
        int max = Integer.MIN_VALUE + 1;
        int next_max = Integer.MIN_VALUE;
        int index = 0;

        if(nums == null || nums.length == 0){
            return -1;
        }

        else if (nums.length == 1){
            return 0;
        }

        else {

            for(int i = 0; i< nums.length; i++){
                if(nums[i] > max) {
                    next_max = max;
                    max = nums[i];
                    index = i;

                } else if(nums[i] < max && nums[i] > next_max) {
                    next_max = nums[i];
                }
            }
        }

        if(max >= next_max * 2){
            return index;
        } else{ return -1;
        }
    }
}
