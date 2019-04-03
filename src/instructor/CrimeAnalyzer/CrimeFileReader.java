import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
* This class reads the crime data and provides search functionality.
*
* <p>Bugs: This program has no known bugs.
*
* @author Janyl Jumadinova
*/
public class CrimeFileReader {

	private static final String FILENAME = "input/SacramentocrimeJanuary2006.csv";
	private ArrayList<String> list;

	/** Constructor to initialize the list.
	*/
	public CrimeFileReader() {
		list= new ArrayList<String>();
	}

	/** Method to read the file
	* and save it into a list.
	*/
	public void readFile() throws IOException {

		Scanner fileScanner = new Scanner(new File(FILENAME));

		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			list.add(line);
		}
		//System.out.println(list.get(1));
	}

	/** Method to find the all words
	* that match a keyword and return a list.
	*/
	public ArrayList<String> find (String word) {
		// TODO: implement the functionality
		Iterator<String> listIterator = list.iterator();
		ArrayList<String> searchList = new ArrayList<String>();

		while(listIterator.hasNext()) {
			String row = listIterator.next();
			if(row.contains(word)) {
				searchList.add(row);
			}
		}

		return searchList;
	}

	/** Method to return a list that matches search word.
	*/
	public ArrayList<String> getSearchList() {
		return list;
	}
}
