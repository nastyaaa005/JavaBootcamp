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
		test test = new test();
		test.caseTest(5);
		test.caseTest(8);
		test.caseTest(11);
	}
}

 class test{
	 public  void caseTest(int i){
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
			 case 8:
				 numText = "EIGHT";break;
			 // complete the code.
			 default:
				 numText = "NUMBER " + i;
		 }
		 System.out.println(numText);
	 }

}
