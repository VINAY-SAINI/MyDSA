class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    //new random comment for just fun 
    private Node front;
    private Node rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // You can choose a different value to indicate an error or throw an exception
        }

        int dequeuedData = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return dequeuedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // You can choose a different value to indicate an error or throw an exception
        }

        return front.data;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue after enqueueing elements:");
        queue.display();

    
        queue.display();
    }
}
