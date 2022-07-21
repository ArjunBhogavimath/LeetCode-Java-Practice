class Solution {
    public int maxArea(int[] height) {
        int left  = 0;
        int right = height.length-1;
        int final_ans = 0;
        
        while(left<=right){
            final_ans = Math.max(Math.min(height[left],height[right]) * (right-left),final_ans);
            if(height[left]>=height[right]){
                right--; 
            }else{
                left++;
            }
        }
        return final_ans;
    }
}


//by using 2 pointer approach