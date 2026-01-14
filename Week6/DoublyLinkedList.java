//DoublyLinkedList
class DoublyLinkedList {

    Node head, tail;

    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇆ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ⇆ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }
}

//delete after value
public void deleteAfterValue(int value) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    // find the node with given value
    while (temp != null && temp.data != value) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Value not found");
        return;
    }

    // no next node to delete
    if (temp.next == null) {
        System.out.println("No next node exists");
        return;
    }

    System.out.println(temp.next.data + " deleted.");

    // CASE 1: deleting tail
    if (temp.next.next == null) {
        temp.next = null;
        tail = temp;
        return;
    }

    // CASE 2: deleting a middle node
    temp.next = temp.next.next;
    temp.next.prev = temp;
}

//delete before value
public void deleteBeforeValue(int value) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    // find the node with given value
    while (temp != null && temp.data != value) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Value not found");
        return;
    }

    // no previous node to delete
    if (temp.prev == null) {
        System.out.println("No previous node exists");
        return;
    }

    System.out.println(temp.prev.data + " deleted.");

    // CASE 1: deleting head (previous node is head)
    if (temp.prev.prev == null) {
        head = temp;
        temp.prev = null;
        return;
    }

    // CASE 2: deleting a middle node
    temp.prev = temp.prev.prev;
    temp.prev.next = temp;
}