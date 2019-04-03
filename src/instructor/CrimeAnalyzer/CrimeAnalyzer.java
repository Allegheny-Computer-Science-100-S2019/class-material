// Janyl Jumadinova
// 4 April, 2018

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
* This class analyzes the crime data by districts.
*
* <p>Bugs: This program has no known bugs.
*
* @author Janyl Jumadinova
*/
public class CrimeAnalyzer {
	private ArrayList<String> districtList;
	private int count;

	/** Constructor to initialize the variables.
	*/
	public CrimeAnalyzer() {
		districtList = new ArrayList<String>();
		count = 0;
	}

	/** Method to analyze the data by
	* finding relevant items based on districts.
	*/
	public void findDistricts(ArrayList<String> list) {
		//TODO: implement functionality
	}

	/** Method to return the number of analyzed items.
	*/
	public int getCount() {
		return count;
	}

	/** Method to return the list of districts.
	*/
	public ArrayList<String> getDistricts() {
		return districtList;
	}
}
