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

public class BinarySearchTreeTiming {

	public static void main(String[] args) {
		
		BinarySearchTreeTest test = new BinarySearchTreeTest();
		test.run();
	}
}