package ru.svdegron.java2021.sort;

public abstract class Sorter implements Sortable {

	@Override
	public abstract int[] AscendingFromBegin(int[] input);

	@Override
	public abstract int[] DescendingFromEnd(int[] input);
	
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
