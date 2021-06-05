package ExceptionsHandling;

public class TypesofExceptions {
	
		public static void main(String[] args) {
	
			
			
			//1.Arithmetic Exception
			try {
				int a = 30, b =0;
				int c = a/b;
				System.out.println("Result =" +c);
			}catch (ArithmeticException e)
			{
				System.out.println("Can't divide a number by zero");
			} finally 
			{
				System.out.println("Finally is always executed");
			}
			//2.Number Format Exception
			try {
				int num = Integer.parseInt("Sarav");
				System.out.println(num);
			}catch (NumberFormatException e)
			{
				System.out.println("Number format Exception");
			}finally 
			{
				System.out.println("Finally is always executed");
			}
			//3.Array Index Out of Bounds Exception
			try {
				int a[] = new int [5];
				a[7] = 9;
				System.out.println("Out of Bounds Exeption");
			}catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of bounds");
			}finally 
			{
				System.out.println("Finally is always executed");
			}
			
		}
		

}
