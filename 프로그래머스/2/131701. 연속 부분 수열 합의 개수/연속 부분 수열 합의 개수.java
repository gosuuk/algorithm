import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		int[] ele = Arrays.copyOf(elements, elements.length * 2);
		System.arraycopy(elements, 0, ele, elements.length, elements.length);

		for (int size = 1; size <= elements.length; size++) {
			for (int i = 0; i < elements.length; i++) {
				set.add(getSum(i, 0, ele, size));
			}
		}
		return set.size();
	}

	private int getSum(int i, int num, int[] elements, int size) {
		if (size == 0) return num;
		return getSum(i + 1, num + elements[i], elements, size - 1);
	}
}