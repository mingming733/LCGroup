
public class ContainerWithMostWater {
	public static void main (String []args){
		int []height = {2,8,10,14,7,9};
		System.out.println (maxArea(height));
	}
	public static int maxArea (int []height){
		if (height == null || height.length == 0 ){
			return 0;
		}
		int high = height.length -1;
		int low = 0;
		int max = 0;
		while (low < high){
			int area = (high - low) * Math.min(height[low], height[high]);
			max = Math.max(max, area);
			if (height[low] > height[high]){
				high --;
			}
			else {
				low ++;
			}
		}
		return max;
	
	}
}
