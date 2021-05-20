package leecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i =0 ; i < nums.length ; i++){
            Integer num = nums[i];
            Integer j = map.get(target-num);
            if(j != null){
                return new int[]{j, i};
            }
            map.put(num,i);
        }
        return null;
    }

    public static void main(String[] args){
        No1 no1 = new No1();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println("example 1 :"+Arrays.toString(no1.twoSum(nums, target)));
        nums = new int[]{3,2,4};
        target = 6;
        System.out.println("example 2 :"+Arrays.toString(no1.twoSum(nums, target)));
        nums = new int[]{3,3};
        target = 6;
        System.out.println("example 3 :"+Arrays.toString(no1.twoSum(nums, target)));
        nums = new int[]{-1,-2,-3,-4,-5};
        target = -8;
        System.out.println("example 3 :"+Arrays.toString(no1.twoSum(nums, target)));
    }
}
