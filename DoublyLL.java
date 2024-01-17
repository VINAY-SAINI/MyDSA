class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
        } else {
            System.out.println("Element not found in the list");
        }
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);

        System.out.println("Doubly Linked List forward:");
        doublyLinkedList.displayForward();

        doublyLinkedList.prepend(0);
        System.out.println("Doubly Linked List forward after prepending:");
        doublyLinkedList.displayForward();

        doublyLinkedList.delete(2);
        System.out.println("Doubly Linked List forward after deleting an element:");
        doublyLinkedList.displayForward();

        System.out.println("Doubly Linked List backward:");
        doublyLinkedList.displayBackward();
    }
}
