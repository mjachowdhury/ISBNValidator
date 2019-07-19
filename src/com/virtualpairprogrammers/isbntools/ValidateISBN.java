/**
 * 
 */
package com.virtualpairprogrammers.isbntools;

/**
 * @author malom
 *
 */
public class ValidateISBN {

	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	public boolean checkISBN(String isbn) {
		if (isbn.length() != 10) throw new NumberFormatException("ISBN number must be 10 digit");
			
		
		int total = 0;
		for (int i = 0; i < 10; i++) {
			if (!Character.isDigit(isbn.charAt(i))) throw new NumberFormatException("ISBN number can only contain numeric digit"); 
			total += isbn.charAt(i) *(10 - i);
		}
		
		if (total % 11 == 0 ){
			return true;
		}
		return false;
		
		 
	}

}
