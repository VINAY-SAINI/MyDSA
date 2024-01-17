import java.util.Arrays;

class VinayDynamicArray {
    private Object arr[];
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    VinayDynamicArray() {
        size = 0;
        arr = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public void insert(Object element) {
        if (size == arr.length) {
            increaseSize();
        }
        arr[size++] = element;
    }

    private void increaseSize() {
        int newLength = size * 2;
        arr = Arrays.copyOf(arr, newLength);
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    public static void main(String[] args) {
        VinayDynamicArray arraylist = new VinayDynamicArray();
        System.out.println("Size of arraylist before: " + arraylist.size());
        arraylist.insert(1);
        arraylist.insert(2);
        arraylist.insert(3);
        arraylist.insert(4);
        arraylist.insert(5);
        arraylist.insert(6);
        System.out.println("Size of arraylist after adding: " + arraylist.size());
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println("Element at index " + i + " is: " + arraylist.get(i));
        }

        // Accessing an invalid index will now throw an exception
        try {
            System.out.println("Element at index 6 is: " + arraylist.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
