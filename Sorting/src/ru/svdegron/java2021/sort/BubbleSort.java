package ru.svdegron.java2021.sort;

public class BubbleSort extends Sorter {
	
	@Override
	public int[] AscendingFromBegin(int[] input) {

		int[] output = input;

		for (int i = 1; i < output.length; i++) {
			for (int j = 0; j < output.length - i; j++) {

				if (output[j] > output[j + 1]) {

					int temp = output[j + 1];
					output[j + 1] = output[j];
					output[j] = temp;

				}

			}			
		}

		return output;

	}
	
	
	@Override
	public int[] DescendingFromEnd(int[] input) {
		
		int[] output = input;
		
		for (int i = 0; i < output.length - 1; i++) {
			for (int j = output.length - 1; j > i; j--) {
				
				if (output[j] > output[j - 1]) {
										
					int temp = output[j - 1];
					output[j - 1] = output[j];
					output[j] = temp;
					
				}
				
			}
		}
		
		return output;
		
	}
	
	// not interesting methods
	// it just a copies from upper methods with smallest difference in «if condition»
	
	public int[] AscendingFromEnd(int[] input) {
		
		int[] output = input;
		
		for (int i = 0; i < output.length - 1; i++) {
			for (int j = output.length - 1; j > i; j--) { // in this line was a special problems
				
				if (output[j] < output[j - 1]) {
										
					int temp = output[j - 1];
					output[j - 1] = output[j];
					output[j] = temp;
					
				}
				
			}
		}
		
		return output;
		
	}
	
	// it's not interesting, because for sort descending need change condition in ascending sort
	public int[] DescendingFromBegin(int[] input) {

		int[] output = input;

		for (int i = 1; i < output.length; i++) {
			for (int j = 0; j < output.length - i; j++) {
 
				if (output[j] < output[j + 1]) {

					int temp = output[j + 1];
					output[j + 1] = output[j];
					output[j] = temp;

				}

			}			
		}

		return output;

	}

}
