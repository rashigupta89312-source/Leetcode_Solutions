import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        else{
            int k = 0;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] != nums[i+1]){
                    nums[k] = nums[i];
                    k++;
                }
            }
            nums[k] = nums[nums.length - 1];
            return k + 1;
        }
    }
}