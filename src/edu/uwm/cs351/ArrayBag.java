package edu.uwm.cs351;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Modified and stripped version of ArrayBag
 * from <a href="http://www.cs.colorado.edu/~main/docs/">
 * http://www.cs.colorado.edu/~main/docs/</a>
 * 
 * It is important to note that we did not implement the following methods.
 * <ul>
 *   <li>clone</li>
 *   <li>getCapacity</li>
 *   <li>grab</li>
 *   <li>remove</li>
 *   <li>trimToSize</li>
 *   <li>union</li>
 * </ul>
 * We also have not made ArrayBag implement Iterable
 * 
 * @author xiong239
 */
// TODO Make the class generic
public class ArrayBag {
	private final static int INITIAL_CAPACTIY = 2;
	// TODO change the data array to the generic type
	private String[] data;
	private int manyItems;
	
	/**
	 * Initializes a bag of INITIAL_CAPACITY
	 */
	public ArrayBag() {
		this(INITIAL_CAPACTIY);
	}
	
	/**
	 * Initializes a bag of the given initial capacity
	 * @param initialCapacity, initial capacity of the bag
	 */
	@SuppressWarnings("unchecked")
	public ArrayBag(int initialCapacity) {
		if (initialCapacity < 0 ) throw new IllegalArgumentException("initialCapacity is negative: " + initialCapacity);
		this.manyItems = 0;
		// TODO change the constructor to create a generic array
		// Note that we have to "fake" casting an Object array to a generic array
		this.data = new String[initialCapacity];
	}
	
	/**
	 * Add the element to end of the bag
	 * @param element, element to add
	 * @throws IllegalArgumentException, if element is null
	 */
	// TODO change this method to add the generic type
	public void add(String element) {
		if (element == null) throw new IllegalArgumentException("element cannot be null");
		ensureCapacity(this.manyItems+1);
		this.data[manyItems++] = element;
	}	
	/**
	 * Add many elements to the end of the bag in the order they are passed
	 * @param elements, elements to add to the end of the bag
	 * @throws IllegalArgumentException, if any element of the elements is null
	 */
	@SuppressWarnings("unchecked")
	// TODO change this method to add the generic type
	public void addMany(String... elements) {
		for (String element : elements) {
			if (element == null) throw new IllegalArgumentException("there cannot be a null element");
		}
		ensureCapacity(this.manyItems+elements.length);
		for (String element : elements)
			data[manyItems++] = element;
	}
	
	/**
	 * Counts the occurrences of the target in the bag
	 * @param target, the element to count the occurrences of
	 * @return number of times the target appears in the bag
	 * @throws IllegalArgumentException, if the target is null
	 */
	// TODO change this method to add the generic type
	public int countOccurrences(String target) {
		if (target == null) throw new IllegalArgumentException("target cannot be null");
		
		int answer = 0;
		for (int index = 0; index < this.manyItems; index++) {
			if (target.equals(this.data[index])) answer++;
		}
		return answer;
	}
	
	/**
	 * Ensures the bag can hold the minimum capacity given, and
	 * resizes if needed to the minimum capacity.
	 * @param minimumCapacity
	 */
	@SuppressWarnings("unchecked")
	// TODO change this method to use the generic type
	// The array should be handled in the same way as in the constructor
	public void ensureCapacity(int minimumCapacity) {
		
		if (this.data.length < minimumCapacity)
		{
			if(this.data.length * 2 + 1 >= minimumCapacity)
				minimumCapacity = this.data.length * 2 + 1;
			String[] biggerArray = new String[minimumCapacity];
			for (int i=0; i < this.manyItems; i++)
				biggerArray[i] = this.data[i];
			this.data = biggerArray;
		}
	}
	
	/**
	 * Returns the size of the bag, or number of elements in the bag
	 * @return size of the bag
	 */
	public int size() {
		return manyItems;
	}
	
	/**
	 * Prints the contents of the bag, along with its occurrences to console
	 * in the following format:
	 * element: occurrences
	 */
	// TODO change this method to use the generic type
	public void printOccurrences() {
		String result = "";
		ArrayList<String> printed = new ArrayList<String>();
		for (int i=0; i<manyItems; i++) {
			String element = data[i];
			if (!printed.contains(element)) {
				String addend = element.toString() + ": " + this.countOccurrences(element) + "\n";
				result += addend;
				printed.add(element);
			}
		}
		System.out.println(result);
	}
	
	// TODO change this method to use the generic type
	public String get(String t) {
		for(int i=0; i<manyItems; i++)
			if(t.equals(data[i]))
				return data[i];
		return null;
	}	
	
	
	
	// TODO change this (encapsulation-violating) method to use the generic type
	public String[] getData() {
		return data;
	}
	
	// TODO change this method to use the generic type
	public List<String> toList() {
		List<String> result = new ArrayList<String>();
		for (int i=0; i<manyItems; i++)
			result.add(data[i]);
		return result;
	}	
	
	
	
	// TODO change and implement this method to use the generic type
	// Sort the elements based on the comparator passed to this method
	// You must use Selection Sort algorithm 
	public void sort(Comparator comp) {		
		// TODO: selectionsort:  For each array index,
		// find the element that is smallest (according to the comparator)
		// from the remaining array elements.
		// Then swap it with whatever element was there already.
	}

}

