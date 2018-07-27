/**
 * 
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class FindLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Find Largest of two numbers

		int num1 = 1, num2 = 2;

		if (num1 > num2) {
			System.out.println(num1 + " is largest of two numbers");
		} else {
			System.out.println(num2 + " is largest of two numbers");
		}

		// Find Largest of three numbers

		int i = 10, j = 2, k = 10;

		if (i >= j && i >= k)
			// complete code
			System.out.println(i + " is Largest of three numbers");
		else if (j > i && j > k)
			System.out.println(j + " is Largest of three numbers");

		else // complete code
			System.out.println(k + " is Largest of three numbers");

		//Find largest of three numbers with one condition
		int ii=4, jj= 5, kk=8;

		if (ii >= jj) {
			if (ii >= kk)
				System.out.println(ii + " is Largest ");
		} else
			{
			if (jj >= kk)
			{
				System.out.println(jj + " is Largest ");
			}
			else {
				System.out.println(kk + " is Largest ");
			}

		}


	}

}
