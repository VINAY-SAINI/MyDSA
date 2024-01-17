class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Element not found in the list");
        }
    }

    public void display() {
        Node current = head;
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
        LinkedList linkedList = new LinkedList();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        System.out.println("Linked List after appending elements:");
        linkedList.display();

        linkedList.prepend(0);
        System.out.println("Linked List after prepending an element:");
        linkedList.display();

        linkedList.delete(2);
        System.out.println("Linked List after deleting an element:");
        linkedList.display();
    }
}
