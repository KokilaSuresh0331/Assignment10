package assignment10;



public class ArithmaticOperation {
	 public void calculate(int a,int b) {
			System.out.println("Add:"+(a+b));

		}
		 public void calculate( int a,float b) {
			System.out.println("Subraction:"+(a-b));

		}
		 public void calculate(double a,int b,double c) {
			System.out.println("Mutiplication:"+(a*b*c));

		}
		public  void calculate(int a,double c) {
			if(c!=0) {
		System.out.println("Division:"+(a/c));}

		}

	public static void main(String[] args) {
	ArithmaticOperation a=new ArithmaticOperation();
	a.calculate(10, 20);
	a.calculate(30, 20.5f);
	a.calculate(2.5, 20, 3);
	a.calculate(12, 2.0);
}}
