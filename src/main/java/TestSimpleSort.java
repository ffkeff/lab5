public class TestSimpleSort {
    public static void main(String[] args){
        Integer[] arr = {5,2,5,6,54,234,56};
        var test = new SimpleSort<Integer>(arr);

        test.insertionSort();
        int[] x = test.getarr();
        for(int i = 0; i < x.length; i++)
            System.out.println(x[i]);
    }
}
