/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class FindInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create an integer array
		int[] nums = {100, 1, 4, 15};
		
		int result = nums[0];
		
		// Find smallest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < result) {
				result = nums[i];
			}
		}
		System.out.println("Smallest in array is "+result);
		
		result = nums[0];
		
		// Find largest in an array
		/*int[] num = {10,12,3,56};
		int res = num[0]; */
		for (int i = 1; i < nums.length; i++) {
			// complete the code
			if(nums[i] > result){
				result= nums[i];
			}
		}
		System.out.println("Largest in array is "+ result);


	}

}
