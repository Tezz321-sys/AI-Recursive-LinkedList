

/**
 * LL_Rec: Recursive Linked List Implementation
 *
 * This class implements a singly linked list with standard operations,
 * including recursive insertion via addRec(). It was used to test
 * Claude AI’s reasoning about recursion and tail pointer updates.
 */
public class LL_Rec {

    private int size;
    private Node head;
    private Node tail;

    /** Add a new node at the end */
    public void add(int a) {
        Node temp = new Node(a);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    /** Add a node at the end (alias) */
    public void addLast(int a) {
        add(a);
    }

    /** Add a node at the beginning */
    public void addFirst(int a) {
        Node temp = new Node(a);
        temp.next = head;
        head = temp;
        if (tail == null) tail = head; // handle empty list
        size++;
    }

    /** Insert at a specific index */
    public void add(int a, int index) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addFirst(a);
            return;
        } else if (index == size) {
            addLast(a);
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(a);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    /** Recursive insertion */
    public void addRec(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node temp = rec(index, head);
        if (temp != null) {
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
            size++;
        } else {
            System.out.println("Invalid index");
        }
    }

    /** Recursive helper: returns node at index-1 */
    private Node rec(int index, Node temp) {
        if (temp == null) return null;
        if (index == 1) return temp;
        return rec(index - 1, temp.next);
    }

    /** Delete first node */
    public void delFirst() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            head = temp.next;
            temp.next = null;
        }
        size--;
    }

    /** Delete last node */
    public void delLast() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            for (int i = 1; i < size - 1; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
        size--;
    }

    /** Delete node at index */
    public void delIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            delFirst();
            return;
        }
        if (index == size - 1) {
            delLast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    /** Get index of a value, -1 if not found */
    public int getIndex(int val) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == val) return i;
            temp = temp.next;
        }
        return -1;
    }

    /** Display the list */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    /** Clear the list */
    public void empty() {
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = null; // help GC
            curr = next;
        }
        head = tail = null;
        size = 0;
    }

    /** Node class */
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}