class VinayQueue {
    private int[] array;
    private int size;
    private int front;
    private int end;
    private final int defaultSize = 6;

    VinayQueue() {
        array = new int[defaultSize];
        size = 0;
        front = -1;
        end = -1;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[front];
    }

    public int pop() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = array[front];
        size--;
        if (front == defaultSize - 1) {
            front = 0;
        } else {
            front++;
        }
        if (size == 0) {
            front = -1;
            end = -1;
        }
        return element;
    }

    public void push(int element) {
        if (size == defaultSize) {
            throw new IllegalStateException("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        if (end == defaultSize - 1) {
            end = 0;
        } else {
            end++;
        }
        array[end] = element;
        size++;
    }

    public static void main(String[] args) {
        VinayQueue queue = new VinayQueue();
        System.out.println("size of queue now:- " + queue.size());
        for (int i = 0; i < 8; i++) {
            System.out.println(" kuch add krne ki try kr rhe hai " + i);
            try {
                queue.push(i);
            } catch (Exception e) {
                System.out.println(" bhai ye wale L lg gye :- " + e.getMessage());
            }
        }
        System.out.println("size of queue now:- " + queue.size());
        for (int i = 0; i < 2; i++) {
            System.out.println(" kuch dekhne ki try kr rhe hai " + i);
            try {
                queue.peek();
            } catch (Exception e) {
                System.out.println(" bhai ye wale L lg gye :- " + e.getMessage());
            }
        }
        System.out.println("size of queue now:- " + queue.size());
        for (int i = 0; i < 3; i++) {
            System.out.println(" kuch nikalne ki try kr rhe hai " + i);
            try {
                queue.pop();
            } catch (Exception e) {
                System.out.println(" bhai ye wale L lg gye :- " + e.getMessage());
            }
        }
        System.out.println("size of queue now:- " + queue.size());
        for (int i = 0; i < 2; i++) {
            System.out.println(" kuch dekhne ki try kr rhe hai " + i);
            try {
                queue.peek();
            } catch (Exception e) {
                System.out.println(" bhai ye wale L lg gye :- " + e.getMessage());
            }
        }
        System.out.println("size of queue now:- " + queue.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(" kuch nikalne ki try kr rhe hai " + i);
            try {
                queue.pop();
            } catch (Exception e) {
                System.out.println(" bhai ye wale L lg gye :- " + e.getMessage());
            }
        }
        System.out.println("size of queue now:- " + queue.size());
        for (int i = 0; i < 10; i++) {
            System.out.println(" kuch add krne ki try kr rhe hai " + i);
            try {
                queue.push(i);
            } catch (Exception e) {
                System.out.println(" bhai ye wale L lg gye :- " + e.getMessage());
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(" kuch nikalne ki try kr rhe hai " + i);
            try {
                queue.pop();
            } catch (Exception e) {
                System.out.println(" bhai ye wale L lg gye :- " + e.getMessage());
            }
        }
    }
}
