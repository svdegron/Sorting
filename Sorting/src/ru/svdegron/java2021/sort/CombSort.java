package ru.svdegron.java2021.sort;

public class CombSort extends Sorter {

	// Optimal value basis on tests and practices (wiki)
	private final double reductionFactor = 1.247330950103979;

	@Override
	public int[] AscendingFromBegin(int[] input) {

		int n = 0;
		
		int[] output = input;

		int i = 0;
		int lastIndex = output.length - 1;
		int offsetIndex = lastIndex;

		while (i < i + offsetIndex - 1) { // (… - 1) delete i equals j. If "<=" → infinity cycle

			i = 0;
			offsetIndex = (int) (offsetIndex / reductionFactor);

			while (i + offsetIndex <= lastIndex) {

				int j = offsetIndex + i;

				if (output[i] > output[j]) {

					int temp = output[i];
					output[i] = output[j];
					output[j] = temp;

				}

				n++;
				i++;

			}

		}

		// on array 1|2|3|4|5|6|7|8|9|10|11|12|13|14|15
		// 70 iteration, last lap delete. Because, in my realization indexes equals
		//System.out.println("Количество проходов: " + n);
		
		return output;

	}

	@Override
	public int[] DescendingFromEnd(int[] input) {

		int[] output = new int[input.length];

		return output;

	}

	//@formatter:off
	/* https://wikiorg.ru/wiki/Сортировка_расчёской
		public static <E extends Comparable<? super E>> void sort(E[] input) {
			int gap = input.length;
			boolean swapped = true;
			while (gap > 1 || swapped) {
				if (gap > 1) 
					gap = (int) (gap / 1.247330950103979);
				int i = 0;
				swapped = false;
				while (i + gap < input.length) {
					if (input[i].compareTo(input[i + gap]) > 0) {
						E t = input[i];
						input[i] = input[i + gap];
						input[i + gap] = t;
						swapped = true;
					}
					i++;
				}
			}
		}
	*/
	//@formatter:on

	public int[] SortingFromInternet(int[] input) {
		
		int n = 0;

		int[] output = input;

		int gap = output.length;
		boolean swapped = true;

		while (gap > 1 || swapped) {

			if (gap > 1) {
				gap = (int) (gap / reductionFactor);
			}

			int i = 0;
			swapped = false;

			while (i + gap < output.length) {

				n++;
				System.out.print(n + " | " + i + " " + (i + gap) + " | " + output[i] + " " + output[i + gap]);
				
				if (output[i] > output[i + gap]) {

					int temp = output[i];

					output[i] = output[i + gap];
					output[i + gap] = temp;

					swapped = true;
					
					System.out.println(" → " + output[i] + " " + output[i + gap]);
					
				} else {
					System.out.print("\n");
				}

				i++;

			}

		}
		
		// on array 1|2|3|4|5|6|7|8|9|10|11|12|13|14|15
		// 91 iteration, last lap for check… I think that so
		System.out.println("Количество проходов: " + n);
		
		return output;
	}

}
