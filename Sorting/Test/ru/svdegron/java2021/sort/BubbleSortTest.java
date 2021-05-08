package ru.svdegron.java2021.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	private BubbleSort bubbleSort;

	@Before
	public void setUp() {
		bubbleSort = new BubbleSort();
	}

	@Test
	public void CheckSortFromBegin() {

		int[] unsorted = { 4, 3, 2, 1 };
		int[] sorted = { 1, 2, 3, 4 };

		assertArrayEquals(sorted, bubbleSort.AscendingFromBegin(unsorted));

	}

	@Test
	public void CheckSortFromEnd() {

		int[] unsorted = { 8, 7, 6, 5 };
		int[] sorted = { 5, 6, 7, 8 };

		assertArrayEquals(sorted, bubbleSort.AscendingFromEnd(unsorted));

	}

}
