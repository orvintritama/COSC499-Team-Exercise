import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

class SortingTest {

	@Test
	void test() {
		int[] arr = {62,48,10,25,19};
		assertArrayEquals(new int[] {10,19,25,48,62}, SelectionSort.selectionSort(arr));
                assertArrayEquals(new int[] {10,19,25,48,62}, InsertionSort.insertionSort(arr));
	}

}
