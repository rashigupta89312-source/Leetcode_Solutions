class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[] = new int[2051];
        for(int r = 0; r < logs.length; r++){
            arr[logs[r][0]]++;
            arr[logs[r][1]]--;
        }
        int max = arr[1950];
        int maxYear = 1950;
        for(int i = 1951; i < arr.length; i++){
            arr[i] += arr[i - 1];
            if(arr[i] > max){
                max = arr[i];
                maxYear = i;
            }
        }
        return maxYear;
    }
}