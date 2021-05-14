package ru.svdegron.java2021.sort;

public class CombSort extends Sorter {

	// Optimal value basis on tests and practices (wiki)
	private final double reductionFactor = 1.247330950103979;

	@Override
	public int[] AscendingFromBegin(int[] input) {

		int[] output = input;

		int i = 0;
		int lastIndex = output.length - 1;
		int offsetIndex = lastIndex;

		int n = 0;

		while (i < i + offsetIndex - 1) { // (… - 1) delete i equals j. If "<=" → infinity cycle

			i = 0;
			offsetIndex = (int) (offsetIndex / reductionFactor);

			while (i + offsetIndex <= lastIndex) {

				int j = offsetIndex + i;
				
				System.out.print(i + " " + j + " | " + output[i] + " " + output[j]);

				if (output[i] > output[j]) {
					
					int temp = output[i];
					output[i] = output[j];
					output[j] = temp;
					
					System.out.println(" → " + output[i] + " " + output[j]);
					
				} else {
					System.out.print("\n");
				}

				i++;
				n++;

			}

		}

		System.out.println(
				"Кол-во проходов: " + n + " " + (105 - 60) + " " + (105 - 71) + " " + (105 - 85) + " " + (105 - 77));

		return output;

	}

// example for Pascal
//    Завожу цикл с условием «i < i + j», которое буквально означает «i отличается от i + j».
//        Обнуляю i для того, чтобы при новом пробеге по массиву индекс не вышел за его границы.
//        Завожу внутренний цикл с условием «i + j <= n», которое буквально значит
//                  «сумма индекса i и расстояния j между a[i] и другим сравниваемым элементом не больше,
//                  чем самый большой индекс массива».
//            Если a[i] > a[i + j], то меняю их местами.
//            Увеличиваю i.
//        Уменьшаю j.

	@Override
	public int[] DescendingFromEnd(int[] input) {

		int[] output = new int[input.length];

		return output;

	}

}
