package ru.svdegron.java2021.sort;

public class CombSort extends Sorter {

	@Override
	public int[] AscendingFromBegin(int[] input) {

		int[] output = input;
		
		int i = 0;
		int j = output.length - 1;
		
		while(i < j) {
			
			System.out.print(i + " " + j + " | " + output[i] + " " + output[j]);
			
			if(output[i] > output[j]) {
				
				int temp = output[i];
				output[i] = output[j];
				output[j] = temp;
				System.out.print(" → " + output[i] + " " + output[j] + "\n");
				
			} else {
				System.out.print("\n");
			}
			
			i++;
			j++;
			
			if(j == output.length) {
				
				j = j - i - 1;
				i = 0;
				
			}
			
		}

		return output;

	}

	@Override
	public int[] DescendingFromEnd(int[] input) {

		int[] output = new int[input.length];

		return output;

	}

}
