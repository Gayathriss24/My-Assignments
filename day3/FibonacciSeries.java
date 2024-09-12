package week1.day3;

public class FibonacciSeries {
	public void fibonacci(int range) {
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<range-1;i++) {
			c=a+b;
			System.out.println(+c);
			a=b;
			b=c;
			
		}
		
	}
	

	public static void main(String[] args) {
		int range=8;
		FibonacciSeries value=new FibonacciSeries();
		System.out.println("The series of fibonacci for range 8");
		System.out.println("0,1");
		value.fibonacci(range);

	}

}
