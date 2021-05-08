package ru.svdegron.java2021.sort;

import java.util.Arrays;

public class SortingManager {

	public static void main(String[] args) {

		// Classes for save data and use sort methods and supporting methods
		// example: printing array elements
		Sorter sorterBubble = new BubbleSort();
		Sorter sorterCocktail = new CocktailSort();

		int[] unsortedForBegin = { 5, -3, 2, 6, 9, -8, 4, 1, -9, 8, 3, 7 };
		// this is for beauty, may be easiest for read / understand
		int[] sortedForBegin = new int[unsortedForBegin.length];

		int[] unsortedForEnd = { 5, 2, 6, 9, 4, 1, 8, 3, 7, -5 }; // unsortedForBegin; //
		int[] sortedForEnd = new int[unsortedForEnd.length];

		// I want to see what values at start
		System.out.println("Unsorted arrays");

		// so as not to repeat the output to the console
		boolean isEquals = Arrays.equals(unsortedForBegin, unsortedForEnd);

		if (isEquals) {
			System.out.println("for sort from begin and from end: " + sorterBubble.PrintArray(unsortedForBegin));
		} else {

			System.out.println("for sort from begin: " + sorterBubble.PrintArray(unsortedForBegin));
			System.out.println("for sort from end  : " + sorterBubble.PrintArray(unsortedForEnd));

		}

		sortedForBegin = sorterBubble.AscendingFromBegin(unsortedForBegin);

		// I need see result
		System.out.println("Sorted array from begin:");
		System.out.println(sorterBubble.PrintArray(sortedForBegin));

		sortedForEnd = ((BubbleSort) sorterBubble).AscendingFromEnd(unsortedForEnd);

		// I need see result
		System.out.println("Sorted array from end:");
		System.out.println(sorterBubble.PrintArray(sortedForEnd));

		/*
		 * I'm interesting, which is easier to read? (1) or (2) ? I think, in this case
		 * (1) need know language basics An this case (2) have to hope for «enemy»
		 * method realization That's why I doubt
		 */
		// sortedForBegin = new int[sortedForBegin.length]; // (1)
		sortedForBegin = sorterBubble.CleanArray(sortedForBegin.length); // (2)

		sortedForBegin = ((BubbleSort) sorterBubble).DescendingFromBegin(unsortedForBegin);

		System.out.println("Array is sorted from begin by descending:");
		System.out.println(sorterBubble.PrintArray(sortedForBegin));

		sortedForEnd = sorterBubble.CleanArray(sortedForEnd.length); // (2)

		sortedForEnd = sorterBubble.DescendingFromEnd(unsortedForEnd);

		System.out.println("Array is sorted from end by descending:");
		System.out.println(sorterBubble.PrintArray(sortedForEnd));

		sortedForBegin = sorterCocktail.AscendingFromBegin(unsortedForBegin);
		System.out.println("Cocktail sort ↑: " + sorterCocktail.PrintArray(sortedForBegin));

		sortedForEnd = sorterCocktail.DescendingFromEnd(unsortedForEnd);
		System.out.println("Cocktail sort ↓: " + sorterCocktail.PrintArray(sortedForEnd));

	}

}
