import org.junit.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortTest() {
        int[] arr = new int[]{5,8,2,4,0,1,7,9,3,6};
        int[] arrCheck = new int[]{0,1,2,3,4,5,6,7,8,9};
        BubbleSort.bubbleSort(arr);
        Assert.assertArrayEquals(arrCheck,arr);
    }
}
