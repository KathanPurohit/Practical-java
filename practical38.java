import java.util.ArrayList;

public class practical38 {
    // ArrayList to store elements in the stack
    private ArrayList<Object> list = new ArrayList<>();

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Return the number of elements in the stack
    public int getSize() {
        return list.size();
    }

    // Return the top element without removing it
    public Object peek() {
        if (!isEmpty()) {
            return list.get(getSize() - 1);
        }
        return null; // Return null if the stack is empty
    }

    // Return and remove the top element from the stack
    public Object pop() {
        if (!isEmpty()) {
            return list.remove(getSize() - 1);
        }
        return null; // Return null if the stack is empty
    }

    // Add a new element to the top of the stack
    public void push(Object o) {
        list.add(o);
    }

    // Method to print all elements in the stack
    public void printStack() {
        System.out.println("Stack elements: " + list);
    }

    public static void main(String[] args) {
        // Create a stack
        MyStack stack = new MyStack();

        // Push elements onto the stack
        stack.push("Element 1");
        stack.push(100);
        stack.push(45.6);

        // Print stack contents
        stack.printStack();

        // Peek the top element
        System.out.println("Peek top element: " + stack.peek());

        // Pop the top element
        System.out.println("Pop top element: " + stack.pop());

        // Print stack after pop
        stack.printStack();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Stack size: " + stack.getSize());
    }
}
