
public class two {
    public static void main(String[] args) {
        int [] height = {1,8,16,2,15,4,8,3,7};
        int left = 0 ;
        int right = height.length -1;
        int maxArea = 0;

        while(left<right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
    }    
}
