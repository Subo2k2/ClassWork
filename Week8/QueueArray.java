//Queue
class QueueArray {
    private int[] arr;
    private int size;
    private int rear;
    private int front;

    public QueueArray(int capacity) {
        arr = new int[capacity];
        size = 0;
        front = 0;     
        rear = -1;     // nothing inside yet
    }

    // enqueue
    public void enqueue(int value) {
        if (size == arr.length) {
            resize();
        }
        rear++;
        arr[rear] = value;
        size++;

        System.out.println(value + " enqueued");
    }

    // dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = arr[front];   // arr[0]

        // shifting
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;
        size--;

        return removed;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    // check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // resize
    private void resize() {
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        System.out.println("Queue resized to " + newSize);
    }

    // print
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//Queue with linked list
class QueueLinkedList {
    private Node front;
    private Node rear;

    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // enqueue
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued");
    }

    // dequeue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = front.data;
        front = front.next;

        if (front == null) rear = null;

        return removed;
    }

    // peek
    public int peek() {
        if (front == null) return -1;
        return front.data;
    }

    // print queue
    public void printQueue() {
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


