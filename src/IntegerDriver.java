import edu.uwm.cs351.ArrayBag;

/**
 * The IntegerDriver will create a bag of Integers
 * and then compute the sum of the bag's contents
 * @author xiong239
 *
 */
public class IntegerDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayBag<Integer> bag = new ArrayBag<Integer>();
		bag.addMany(new Integer[]{5, 4, 4, 2, 6, 5, 4});
		bag.printOccurrences();

		
		// TODO This doesn't work because the List returned is not really of type Integer
		// Figure out what this code is trying to do
		// Try to find another way to do this. Look at the public methods of ArrayBag
		int sum = 0;
		for (Integer element : bag.getData())
			sum += element;
		System.out.println("Sum = " + sum);
	}
}

