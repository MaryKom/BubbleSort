public class ArrayBub {
    private long[] a;
    private int nElements;

    public ArrayBub(int max) {
        a = new long[max];
        nElements = 0;
    }

    public void insert(long value) {
        a[nElements++] = value;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.println(a[i]);
        }
        System.out.println("");
    }

    public void bubbleSort() {
        for (int out = nElements - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in+1]) {
                    swap(in, in+1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
