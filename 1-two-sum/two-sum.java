class Solution {
    public int[] twoSum(int[] nums, int target) {
         int l = nums.length;
        boolean found = false;
        int[] a = new int[2];
        for(int i=0; i<l; i++){
            a[0]=i;
            for(int j=i+1; j<l; j++){
                if(i!=j){
                    int s = nums[i]+nums[j];
                    if(target == s){
                        a[1]=j;
                        found = true;
                        break;
                    }
                }
            }
            if(found==true){
                break;
            }
        }
        return a;
        
    }
}