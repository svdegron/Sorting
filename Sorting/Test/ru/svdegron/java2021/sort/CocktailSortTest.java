package ru.svdegron.java2021.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CocktailSortTest {

	private CocktailSort cocktailSort;

	@Before
	public void setUp() {
		cocktailSort = new CocktailSort();
	}

	@Test
	public void CheckSortFromBegin() {

		int[] unsorted = { 5, 4, 3, 2, 1 };
		int[] sorted = { 1, 2, 3, 4, 5 };

		assertArrayEquals(sorted, cocktailSort.AscendingFromBegin(unsorted));

	}

	@Test
	public void CheckSortFromEnd() {

		int[] unsorted = { -2, 7, -6, 5, 0 };
		int[] sorted = { 7, 5, 0, -2, -6 };

		assertArrayEquals(sorted, cocktailSort.DescendingFromEnd(unsorted));

	}

}
