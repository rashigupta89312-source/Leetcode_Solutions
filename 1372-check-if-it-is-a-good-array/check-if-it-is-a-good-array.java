class Solution {
    public boolean isGoodArray(int[] nums){
            int hcf = nums[0];
            for(int i = 1; i < nums.length; i++){
                hcf = gcd(hcf, nums[i]);
            }
            if(hcf == 1){
                return true;
            }
            return false;
        }
    
    public int gcd(int divisor, int dividend){
        while(divisor > 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return dividend;
    }
}