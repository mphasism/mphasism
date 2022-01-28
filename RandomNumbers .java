package Submit;

public class RandomNumbers {
	public static void main(String[] args) {
		RandomNumbers log = new RandomNumbers();
		int[] arr = { 32, 42, 66, 77, 94, 13 };
		int[] test1 = { 831, 768, 799, 563, 610 };
		log.subsequence(arr);
		System.out.println();
		log.subsequence(test1);
	}

	void subsequence(int[] arr) {
		int[] res = new int[arr.length];
		int pos, finalLength = 1, comp, length;
		for (int i = 0; i < arr.length; i++) {
			int[] loop = new int[arr.length];
			loop[0] = arr[i];
			comp = arr[i];
			pos = 1;
			length = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > comp) {
					loop[pos] = arr[j];
					pos += 1;
					length += 1;
					comp = arr[j];
				}
			}
			if (length > finalLength) {
				finalLength = length;
				res = loop;
			}
		}
		System.out.println("The longest straight subsquence is of length " + finalLength);
		System.out.print("The longest subsequence is ");
		for (int i = 0; i < finalLength; i++)
			System.out.print(res[i] + " ");
		System.out.println();
	}
}
