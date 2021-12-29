import java.util.Arrays;

public class Solution_1920 {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,2,1,5,3,4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
