/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

public class LeetCode_26 {
  private static int removeDuplicates(int[] nums) {
    if(nums.length==0){
      return 0;
    }
    //记录不重复的值
    int j=nums[0];
    //记录重复值的总数
    int k=0;
    for (int i = 1; i < nums.length; i++) {
      if(nums[i]==j){
        k++;
      }else{
        //移动替换
        nums[i-k]=nums[i];
        j=nums[i];
      }
    }
    return nums.length-k;
  }

  public static void main(String[] args) {
    int[] nums={1,1,2};
    int i=removeDuplicates(nums);
    System.out.println(i);
  }

}
