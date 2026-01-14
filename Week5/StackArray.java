//StackArray
class StackArray {
    private int[] stack;
    private int top;

    // constructor
    public StackArray(int size) {
        stack = new int[size];
        top = -1;
    }

    // push
    public void push(int value) {
        if (top == stack.length - 1) {
            resize();
        }
        top++;
        stack[top] = value;

        System.out.println(value + " pushed to stack");                             
    }

    // pop
    public int pop(){

        if(isEmpty()){
           return -1;
        }
        int removed= stack[top];
        top--;
        return removed;
    }


    // peek
    public int peek() {
        if (isEmpty()) {
         return -1;
        }
        return stack[top];
    }

    // resize function
    private void resize() {
        int newSize = stack.length * 2;
        int[] newStack = new int[newSize];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        System.out.println("Stack size doubled to " + newSize);
    }

    // check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // print stack
    public void printStack() {
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

//StackLinkedList
class StackLinkedList {
    private Node top;

    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    // push
    public void push(int value) {
        
        Node newNode = new Node(value);
        
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    // pop
     public int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node temp = top;
            top = top.next;

            return temp.data;
        }

    // peek
    public int peek(){
            if (isEmpty()) {
                return -1;
                }

            return top.data;
    }

    // check empty
    public boolean isEmpty() {
        return top == null;
    }

    // print stack
    public void printStack() {
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //another print function 
    public void printStack2(){
        while(!isEmpty()) {

            System.out.println(peek());

            pop();
        }
    }

}
