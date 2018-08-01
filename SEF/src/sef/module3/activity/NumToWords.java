/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int i = 8;
		String numText = "";

		switch (i) {

			case 1:
				numText = "ONE";
				break;
			case 2:
				numText = "TWO";
				break;
			case 3:
				numText = "THREE";
				break;
			case 4:
				numText = "FOUR";
				break;
			case 5:
				numText = "FIVE";
				break;
			// complete the code.
			default:
				numText = "NUMBER " + i;

		}


		if (i == 1) ;
		{
			numText = "ONE";
			System.out.println();
		}
		if (i == 2) {
			numText = "TWO";
			System.out.println();
		}
		if (i == 2) {
			numText = "THREE";
			System.out.println();
		}
		if (i == 2) {
			numText = "FOUR";
			System.out.println();
		}
		if (i == 4) {
			numText = "FIVE";
			System.out.println();
		} else
			numText = "NUMBER " + i;
	}
	}

}

