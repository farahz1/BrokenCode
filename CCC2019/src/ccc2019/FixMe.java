//This should be able to solve J3 as seen in Instructions.pdf.
package ccc2019;

import java.util.Scanner;

public class FixMe {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//Read in a number
		int lines = in.nextInt();
		in.nextLine();
		String output = "";
		// Loop through the lines
		for (int i = 0; i < lines; i++) {
			// Read in a string
			String input = in.nextLine();
			// Loop through the characters

			char currentChar = 'a';
			char currentCount = '0';
			char previousChar;
			for (int j = 0; j < input.length(); j++) {
				// if this is the first pass through the loop

				if (j == 0) {
					// current char is the char at j
					currentChar = input.charAt(j);
				} else {
					// set previousChar to currentChar
					previousChar = currentChar;
					// current character = charAt(i)
					currentChar = input.charAt(j);
					// if the current and previous char are the same
					if (currentChar == previousChar) {
						// increase the count
						currentCount++;
					}
					// else
					else {
						// print current count + " " + previousChar
						output += currentCount + " " + previousChar + " ";
						// currentCount = 1
						currentCount = 1;
					}
					// If we're on the last character
					if (j == input.length() - 1) {
						// add the count to the output
						output += currentCount + " " + currentChar + " ";
					}
				}
			}
			// Print newline
			output += "\n";
		}
// Print the result
		System.out.println();
		in.close();
	}
}
