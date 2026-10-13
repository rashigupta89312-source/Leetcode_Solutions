class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        int start = 1;
        int end = num-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            System.out.println("mid="+mid);
            long sq = (long)mid*mid;
            if(sq == num){
                return true;
            }
            else if(sq < num){
                System.out.println("sq<num");
                start=mid+1;
                System.out.println("start="+start);
            }
            else if(sq > num){
                System.out.println("sq>num");
                end=mid-1;
                System.out.println("end="+end);
            }
        }
        return false;
    }
}