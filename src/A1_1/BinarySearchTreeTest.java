/***
 * author: Jake S. Pitkin
 * last edit: January 18th, 2016
 * Assignment 1-1 for CS4540
 * 
 * Timing the lookup time of a binary search tree using TreeSets.
 * Eleven sets of size 2^10 - 2^20 are tested.
 * Performance is already known, built to practice best practices for timing code.
 */

package A1_1;

import java.util.ArrayList;
import java.util.TreeSet;

public class BinarySearchTreeTest {
		
	// 11 TreeSets, ranging in size from 2^10 to 2^20
	private TreeSet<Integer> set10;
	private TreeSet<Integer> set11;
	private TreeSet<Integer> set12;
	private TreeSet<Integer> set13;
	private TreeSet<Integer> set14;
	private TreeSet<Integer> set15;
	private TreeSet<Integer> set16;
	private TreeSet<Integer> set17;
	private TreeSet<Integer> set18;
	private TreeSet<Integer> set19;
	private TreeSet<Integer> set20;
	
	// ArrayLists of the valid keys for each TreeSet
	private ArrayList<Integer> set10Keys; // 1024
	private ArrayList<Integer> set11Keys; // 2048
	private ArrayList<Integer> set12Keys; // 4096
	private ArrayList<Integer> set13Keys; // 8192
	private ArrayList<Integer> set14Keys; // 16384
	private ArrayList<Integer> set15Keys; // 32768
	private ArrayList<Integer> set16Keys; // 65536
	private ArrayList<Integer> set17Keys; // 131072
	private ArrayList<Integer> set18Keys; // 262144
	private ArrayList<Integer> set19Keys; // 524288
	private ArrayList<Integer> set20Keys; // 1048576
	
	public BinarySearchTreeTest() {
		set10 = new TreeSet<Integer>();
		set11 = new TreeSet<Integer>();
		set12 = new TreeSet<Integer>();
		set13 = new TreeSet<Integer>();
		set14 = new TreeSet<Integer>();
		set15 = new TreeSet<Integer>();
		set16 = new TreeSet<Integer>();
		set17 = new TreeSet<Integer>();
		set18 = new TreeSet<Integer>();
		set19 = new TreeSet<Integer>();
		set20 = new TreeSet<Integer>();
				
		set10Keys = new ArrayList<Integer>();
		set11Keys = new ArrayList<Integer>(); 
		set12Keys = new ArrayList<Integer>();
		set13Keys = new ArrayList<Integer>();
		set14Keys = new ArrayList<Integer>();
		set15Keys = new ArrayList<Integer>();
		set16Keys = new ArrayList<Integer>();
		set17Keys = new ArrayList<Integer>();
		set18Keys = new ArrayList<Integer>();
		set19Keys = new ArrayList<Integer>();
		set20Keys = new ArrayList<Integer>();
		
		populateTrees();
	}
	
	/***
	 * Populates the member variable TreeSets and ArrayLists with random
	 * values in the range [0, 10,000,000)
	 */
	private void populateTrees() {
		// Generate random numbers - add them to the sets until they are all "full"
		while (true) {
				
			// Break out once all the sets are full
			if (set10Keys.size() == 1024  && set11Keys.size() == 2048   && set12Keys.size() == 4096   && 
				set13Keys.size() == 8192  && set14Keys.size() == 16384  && set15Keys.size() == 32768  &&
				set16Keys.size() == 65536 && set17Keys.size() == 131072 && set19Keys.size() == 524288 &&
				set20Keys.size() == 1048576) {
					break;
			}
				
			// Generate a random number in the range [0, 10,000,000)
			int currentKey = (int) (Math.random() * 10000000);
				
			// Add the current random number to the 2^10 sized TreeSet if it doesn't already contain it
			if (set10Keys.size() < 1024 && !set10.contains(currentKey)) {
				set10.add(currentKey);
				set10Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^11 sized TreeSet if it doesn't already contain it
			if (set11Keys.size() < 2048 && !set11.contains(currentKey)) {
				set11.add(currentKey);
				set11Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^12 sized TreeSet if it doesn't already contain it
			if (set12Keys.size() < 4096 && !set12.contains(currentKey)) {
				set12.add(currentKey);
				set12Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^13 sized TreeSet if it doesn't already contain it
			if (set13Keys.size() < 8192 && !set13.contains(currentKey)) {
				set13.add(currentKey);
				set13Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^14 sized TreeSet if it doesn't already contain it
			if (set14Keys.size() < 16384 && !set14.contains(currentKey)) {
				set14.add(currentKey);
				set14Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^15 sized TreeSet if it doesn't already contain it
			if (set15Keys.size() < 32768 && !set15.contains(currentKey)) {
				set15.add(currentKey);
				set15Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^16 sized TreeSet if it doesn't already contain it
			if (set16Keys.size() < 65536 && !set16.contains(currentKey)) {
				set16.add(currentKey);
				set16Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^17 sized TreeSet if it doesn't already contain it
			if (set17Keys.size() < 131072 && !set17.contains(currentKey)) {
				set17.add(currentKey);
				set17Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^18 sized TreeSet if it doesn't already contain it
			if (set18Keys.size() < 262144 && !set18.contains(currentKey)) {
				set18.add(currentKey);
				set18Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^19 sized TreeSet if it doesn't already contain it
			if (set19Keys.size() < 524288 && !set19.contains(currentKey)) {
				set19.add(currentKey);
				set19Keys.add(currentKey);
			}
				
			// Add the current random number to the 2^20 sized TreeSet if it doesn't already contain it
			if (set20Keys.size() < 1048576 && !set20.contains(currentKey)) {
				set20.add(currentKey);
				set20Keys.add(currentKey);
			}	
		}
	}
	
	/***
	 * Launch point for the experiment.
	 */
	public void run() {
		runTest(set10, set10Keys, 10000);
		runTest(set11, set11Keys, 5000);
		runTest(set12, set12Keys, 2500);
		runTest(set13, set13Keys, 1250);
		runTest(set14, set14Keys, 625);
		runTest(set15, set15Keys, 312);
		runTest(set16, set16Keys, 156);
		runTest(set17, set17Keys, 78);
		runTest(set18, set18Keys, 39);
		runTest(set19, set19Keys, 25);
		runTest(set20, set20Keys, 10);
	}
	
	/***
	 * Runs a test on a TreeSet, printing the results out to the console.
	 * @param tree - the TreeSet to search
	 * @param keys - the list of valid keys for 'tree'
	 * @param iterations - the number of times to go through all the elements in the TreeSet
	 */
	private void runTest(TreeSet<Integer> tree, ArrayList<Integer> keys, int iterations) {   
		long startTime;
		long endTime;
		long totalTime;
		long overheadTime;
		double lookupTime;
		
		startTime = System.currentTimeMillis();
		// repeat 'iterations' times
		for (int i = 0; i < iterations; i++) {
			// iterate through each key and look it up in the TreeSet
			for (int j = 0; j < keys.size(); j++) {
				int currentKey = keys.get(j);
				tree.contains(currentKey);
			}
		}
		endTime = System.currentTimeMillis();
		// total time for 'iterations * keys.size' lookups with overhead
		totalTime = endTime - startTime;
		
		startTime = System.currentTimeMillis();
		// repeat 'iterations' times without the lookup to calculate overhead
		for (int i = 0; i < iterations; i++) {
			// iterate through each key and look it up in the TreeSet
			for (int j = 0; j < keys.size(); j++) {
				int currentKey = keys.get(j);
			}
		}
		endTime = System.currentTimeMillis();
		// time for the overhead for 'iterations * keys.size'
		overheadTime = endTime - startTime;
		
		// subtract the overhead time from the total time
		lookupTime = totalTime - overheadTime;
		// divide the total lookup time by how many lookups were performed
		System.out.println("Keys: " + tree.size() + 
				"\tContains calls: "+ iterations * keys.size() +  "\tMilliseconds: " + lookupTime);
		lookupTime = (double) lookupTime / (iterations * keys.size());
		//System.out.printf(keys.size() + "\t%f%n", lookupTime);
	}
}
