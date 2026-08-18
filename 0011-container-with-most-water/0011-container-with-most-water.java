class Solution {
    public int maxArea(int[] height) {
        int water = 0, leftWall = 0 , rightWall = height.length-1 ;
        while(leftWall < rightWall)
        {
            water = Math.max(water , Math.min(height[leftWall],height[rightWall])*(rightWall-leftWall));
            if(height[leftWall] > height[rightWall]) rightWall-- ;
            else
            leftWall++;
        }
        return water;
    }
}