package ArrayConcepts;

public class ArrayDemo {

	public static void main(String[] args) {

		/*
		 * //Declaration char [] myArray;
		 * 
		 * //allocate memory for fixed number of integer myArray = new char [5];
		 * 
		 * //Initialization myArray[0] = 'H'; myArray[1] = 'E'; myArray[2] = 'L';
		 * myArray[3] = 'L'; myArray[5] = 'O';
		 * 
		 * //Print System.out.println(myArray[1]); System.out.println(myArray);
		 * System.out.println(myArray.length);
		 */
		double[] myList = { 1.9, 2.4, 3.9, 4.5 };

		// print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}

		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {

			total += myList[i];
		}
		System.out.println("Total is " + total);

		// Finding the largest element
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
			System.out.println("Max is " + max);

		}

	}

}
