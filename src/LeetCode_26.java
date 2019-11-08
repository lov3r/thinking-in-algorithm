/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

public class LeetCode_26 {

  /**
   * 双指针法
   * @param nums
   * @return
   */
  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }
//  private static int removeDuplicates(int[] nums) {
//    if(nums.length==0){
//      return 0;
//    }
//    //记录不重复的值
//    int j=nums[0];
//    //记录重复值的总数
//    int k=0;
//    for (int i = 1; i < nums.length; i++) {
//      if(nums[i]==j){
//        k++;
//      }else{
//        //移动替换
//        nums[i-k]=nums[i];
//        j=nums[i];
//      }
//    }
//    return nums.length-k;
//  }

  public static void main(String[] args) {
    int[] nums={0,0,1,1,1,2,2,3,3,4};
    int i=removeDuplicates(nums);
    System.out.println(i);
  }

}
