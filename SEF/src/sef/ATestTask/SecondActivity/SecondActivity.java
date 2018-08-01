package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		System.out.println(calculator.sum(5.4, 2.5));
		System.out.println(calculator.sum(1, 4));
		System.out.println(calculator.mul(5, 6));
		System.out.println(calculator.mul(0, 6));
		/*calculator.divide(0, 5);
		calculator.divide(10, 5);
		calculator.divide(8, 3);*/
		//calculator.divide(3, 0);
		System.out.println(calculator.sub(5, 8));
		System.out.println(calculator.sub(15, 10));


	}

	//TODO create the Calculator (here or in additional class)


		public double sum(double a, double b)
		{
			return a+b;
		}

		public int mul(int a, int b)
		{
			return a*b;
		}

		/*public int divide(int a, int b)
		{
			int res = (b!=0)&&(a!=0)? a/b : 0;
			//if (b != 0){res = a/b;}
			 //{res = a/b;}
			return res;
		}*/


		public int sub(int a, int b)
		{
			return (a > b) ? a-b : b-a;
		}

}
