import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import edu.uwm.cs351.ArrayBag;

/**
 * The StringDriver will read a document
 * and for each word that exists in the document
 * will count the occurrences of that word
 * 
 * Note: assume the document is on a single line
 * @author xiong239
 *
 */
public class StringDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filename = (args.length == 0) ? "document.txt" : args[0];
		// TODO Change this to use the generic class
		ArrayBag bag = new ArrayBag();
		try {
			String[] words;
			BufferedReader br = new BufferedReader(new FileReader(filename));
			words = br.readLine().split(" ");
			bag.addMany(words);
			String concat = "";
			for(int i=0; i<words.length; i++) {
				String word = bag.get(words[i]);
				if (word != null)
					concat = concat.concat(word + " ");
			}
			System.out.println(concat);
			bag.printOccurrences();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}

}
