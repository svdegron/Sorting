package ru.svdegron.java2021.sort;

public class CocktailSort extends Sorter {

	@Override
	public int[] AscendingFromBegin(int[] input) {
		
		int[] output = new int[input.length];
		
		System.out.println("Cocktail sort!");
		
		int leftBorder = 0;
		int rightBorder = output.length - 1;

		System.out.println("Cocktail sort! " + leftBorder + ", " + rightBorder);
		
		while (leftBorder < rightBorder) {
			
			int i = leftBorder;
			
			while(i < rightBorder) {
				
				i++; // at first line to not forget increment index at the end
				System.out.print((i - 1) + "," + i + "|");
				
			}
			
			rightBorder--; // pushed max element into end, cut border from right
				
			System.out.println("|L " + leftBorder + ";");
			
			i = rightBorder;
			
			System.out.println("|i " + i + "|");
			
			while(i > leftBorder) {
				
				i--;
				System.out.print((i + 1) + "," + i + "|");
				
			}
			
			leftBorder++;
			
			System.out.println("|R " + rightBorder + ";");
			
		}
		
		return output;
		
	}

	@Override
	public int[] DescendingFromEnd(int[] input) {
		
		int[] output = new int[input.length];
		
		/* example for change elements places
		 * a = 2; b = 3;
		 * a = a + b | 2 + 3 = 5
		 * b = a - b | 5 - 3 = 2
		 * a = a - b | 5 - 2 = 3
		 * a = 3; b = 2
		 */

		return output;
		
	}

}
