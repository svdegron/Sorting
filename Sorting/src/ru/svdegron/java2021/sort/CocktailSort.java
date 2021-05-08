package ru.svdegron.java2021.sort;

public class CocktailSort extends Sorter {

	@Override
	public int[] AscendingFromBegin(int[] input) {
		
		int[] output = input;
		// remember array borders, for change check order 
		int leftBorder = 0;
		int rightBorder = output.length - 1;
		
		while (leftBorder < rightBorder) {
			
			int i = leftBorder;
			
			while(i < rightBorder) {
				
				i++; // at first line to not forget increment index at the end
				
				if(output[i - 1] > output[i]) {
					
					int temp = output[i - 1];
					output[i - 1] = output[i];
					output[i] = temp;
					
				}
				
			}
			
			rightBorder--; // pushed max element into end, cut border from right
			i = rightBorder;
			
			while(i > leftBorder) {
				
				i--;
				
				if(output[i + 1] < output[i]) {
					
					int temp = output[i + 1];
					output[i + 1] = output[i];
					output[i] = temp;
					
				}
				
			}
			
			leftBorder++;
						
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
