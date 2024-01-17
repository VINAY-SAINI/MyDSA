class VinayStack {
    private int[] arr;
    private int top;
    private int size;

    VinayStack(int length) {
        arr = new int[length];
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public int top() {
        if (size == 0) {
            throw new IndexOutOfBoundsException(" Stack is empty");
        }
        return arr[top];
    }

    public int pop() {
        if (size == 0) {
            throw new IndexOutOfBoundsException(" Stack is empty");
        }
        size--;
        top = (size > 0) ? size - 1 : -1;
        return arr[size];
    }

    public void push(int element) {
        if (size == arr.length) {
            throw new IndexOutOfBoundsException(" Stack is full");
        }
        arr[size] = element;
        top = size;
        System.out.println("Stack me " + element + " add kiya");
        size++;
    }

    public static void main(String[] args) {
        VinayStack stack = new VinayStack(5);
        System.out.println("Size of stack before: " + stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        try {
            stack.push(6); // This should throw an exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Size of stack after: " + stack.size());

        for (int i = 0; i < 6; i++) {
            System.out.println("Size of stack now: " + stack.size());

            try {
                System.out.println("Top element: " + stack.top());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }

            try {
                System.out.println("Removed element: " + stack.pop());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
