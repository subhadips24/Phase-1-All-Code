package airthmeticalculator;

public class ArithmeticCal {
	

	
		int a=30;
		int b=20;

		void add()
		{
			int add=a+b;
			System.out.println("Addition :"+add);
		}

		void sub()
		{
			int sub=a-b;
			System.out.println("Substrction :"+sub);
		}

		void multi()
		{
			int multi=a*b;
			System.out.println("Multiplication :"+multi);
		}

		void div()
		{
			int div=a/b;
			System.out.println("Division :"+div);
		}


		public static void main(String[] args) {
			ArithmeticCal Ac = new ArithmeticCal();
			Ac.add();
			Ac.sub();
			Ac.multi();
			Ac.div();


		}

	}

