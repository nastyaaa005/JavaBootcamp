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
		
		
				
		int i = 43;
		String numText = "";

		switch(i) {
		
		case 1:
			numText = "ONE";break;
		case 2:
			numText = "TWO";break;
		case 3:
			numText = "THREE";break;
		case 4:
			numText = "FOUR";break;
		case 5:
			numText = "FIVE";break;
		case 6:
				numText="six";break;
		case 7:
				numText="seven";break;
		case 8:
				numText="eight";break;

		// complete the code.
		default:
			numText = "NUMBER " + i;
		}
		
		System.out.println( numText);
		
	if (i==1){
		numText="one";
		System.out.println();

	if (i==2){
		numText="two";

	if (i==3) {
		numText = "three";


		if (i == 4) {
			numText = "four";

			if (i == 5) {
				numText = "five";

				if (i == 6) {
					numText = "six";
				}
			}


		}
	}}}}}
