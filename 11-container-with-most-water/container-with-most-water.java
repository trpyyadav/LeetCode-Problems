class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = Integer.MIN_VALUE;
        int trappedWater = 0;

        while(left<right){
            trappedWater = (right-left)* Math.min(height[right],height[left]);
            maxWater = Math.max(trappedWater,maxWater);
            if(height[left]<height[right]){
                left++;
            }else if(height[left]>height[right]){
                right--;
                
            }else{
                left++;
                right--;
            }
        }
        return maxWater;
        /* int maxWater = Integer.MIN_VALUE;
        int trappedWater = 0;
        int n = height.length-1; 

        for(int i=0;i<=n;i++){
            trappedWater = 0;
            for(int j=n;j>=0;j--){
                int breadth = Math.min(height[i],height[j]);
                trappedWater = (j-i)* breadth;
                if(trappedWater > maxWater){
                    maxWater = trappedWater;
                }
            }
        }
        return maxWater; */


        
    }
}