package DSA_Assignment;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    //push() function
    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }

    //pop() function
    public int pop() {
        if (top != null) {
            int data = top.data;
            top = top.next;
            return data;
        } else {
            System.out.println("Stack Underflow");
            return -1; 
        }
    }

    //peek() function
    public int peek() {
        if (top != null) {
            return top.data;
        } else {
            System.out.println("Stack is Empty");
            return -1; 
        }
    }

    //function for checking if the stack is empty
    public boolean isEmpty() {
        return (top == null);
    }

    //function for getting the size of the stack
    public int size() {
        int count = 0;
        Node currentNode = top;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    //function for clearing all elements of the stack
    public void clear() {
        top = null;
    }

    // Main Function
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(12);//pushin an element to the stack
       
        System.out.println("Top element of stack: " + stack.peek());//viewing the top element of the stack

        System.out.println("Popped element of stack: " + stack.pop());//removing the top element of the stack

        System.out.println("Is the stack empty? " + stack.isEmpty());//checking if the stack is empty or not

        stack.clear();//clearing all element of the stack

        System.out.println("Is the stack empty after clearing? " + stack.isEmpty());//checking again

    }
}