package LeetCode.Array;

class maxConsecutiveOnes {
    // This function finds the max concesutive Ones 
    private static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int sum = 0; 
        for(int i : nums){
            sum *=i;
            sum += i;
            ans = Math.max(ans, sum);
        }
        
        return ans;
        
    }
    // // This function finds Numbers with even number of digits
    public static int findNumbers(int[] nums) {
            
            int count = 0;
            for (int i = 0; i< nums.length; i++){
               if((int)((Math.log10(nums[i]) +1)) %2 ==0){
                   count ++;
               }
            }
            return count;
        }
    

    public static void main(String[] args) {
        int[] nums =  new int []{1,1,0,0,1,1,1};
        
        int[] digits =  new int []{1,12,345,2,6,7896};

        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findNumbers(digits));

    }


}
