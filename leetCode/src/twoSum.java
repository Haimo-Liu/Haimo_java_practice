import java.util.HashMap;

public class twoSum {

    public int[] findTwoSum(int[] nums, int target) {

        int[] results = new int[2];

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(target - nums[i]) && hmap.get(target - nums[i]) != i) {

                results[0] = i;
                results[1] = hmap.get(target - nums[i]);
                break;
            }
        }

        return results;
    }
}
