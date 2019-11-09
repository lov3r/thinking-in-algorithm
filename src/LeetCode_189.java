import java.util.Arrays;

/**
 * @author jingbo
 * @date 2019年11月09日 17:41:00
 */
public class LeetCode_189 {
  public static void rotate(int[] nums, int k) {
    int n=nums.length;
    k %= n;
    for (int i = 0; i < k; i++) {
      int temp = nums[n - 1];
      for (int j = n - 1; j > 0; j--) {
        nums[j] = nums[j - 1];
      }
      nums[0] = temp;
    }

  }

  public static void main(String[] args) {
    int[] nums={1,2,3,4,5,6,7};
    int k=3;
    rotate(nums,k);
    System.out.println(Arrays.toString(nums));
  }
}
