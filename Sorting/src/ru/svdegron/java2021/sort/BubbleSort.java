package ru.svdegron.java2021.sort;

public class BubbleSort {
	
	/* notes
	 * Ascending - in Russian (по возрастанию) ↑ I'm training use Alt-code, for not forget code numbers
	 * Descending - in Russian (по убыванию)   ↓
	 * use class instances - in Russian (использовать экземпляры класса)
	 * 1 add field in class
	 * - final input
	 * - last sorted
	 * 2 add getters in class
	 * 3 rewrite main method which use class instances
	 * 4 add override method
	 * 5 use Set collection for result simple read
	 * 6 tests, tests, tests over and over again
	 * Interface with
	 * - AscendingFromBegin (standard)
	 * - DescendingFromEnd, because «descending» is change comparison symbol and more interesting …
	 * … begin from end because you need change cycle parameters
	 */
	
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
	
	// Support method
	
	public String PrintArray(int[] input) {
		
		String str = "";
		
		for (int element : input) {
			str += element + "|";
		}
		
		str = str.substring(0, str.length() - 1);
		
		return str;
		
	}
	
	public int[] CleanArray(int length) {
		
		int[] output = new int[length];
		
		for (int i = 0; i < length; i++) {
			output[i] = 0;
		}
		
		return output;
		
	}

}
