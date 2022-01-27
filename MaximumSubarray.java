import java.util.*;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int maxSum = 0;
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            int tab = nums[i];
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < nums.length; j++) {
                tab += nums[j];
                list.add(nums[j-1]);
                map.put(tab, list);
            }
        }

        int maxValueInMap=(Collections.max(map.keySet()));
        for (Map.Entry<Integer, List<Integer>> entry: map.entrySet()) {
            if (entry.getKey() == maxValueInMap){
                maxSum = entry.getKey();
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-1,2,8}));
    }
}
