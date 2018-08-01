/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWordsUsingMethod {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// complete the code to print text value of 8, 9 and 10
			printMyWord(1);
			printMyWord(2);
			printMyWord(5);
			printMyWord("hdjhfjd);
		}

		private static void printMyWord(String s) {
			final String numText; //numtext=0
			switch(s) {
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
				numText = "SIX";break;
			case 7:
				numText = "SEVEN";break;
			case 8:
				numText = "EIGHT";break;
			case 9:
				numText = "NINE";break;
			case 10:
				numText = "TEN";break;
			default:
				numText = "NUMBER " + i;
			}
			System.out.println(numText);
			
		}


		

	}
