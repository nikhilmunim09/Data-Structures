import java.util.Stack;

public class Stack_imp5 {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        //here push method is not void, it will return the element that we pushed in the stack.

        System.out.println("Top element : "+stack.peek());
        System.out.println("Popped : " +stack.pop());
        System.out.println("size of the stack : "+stack.size());
        System.out.println(stack.contains(5));
        System.out.println(stack.contains(20));
        System.out.println(stack.search(5));
        System.out.println(stack.search(20));
    }
}

//The Stack class represents a last-in-first-out (LIFO) stack of objects.
// It extends class Vector with five operations that allow a vector to be treated as a stack.
// The usual push and pop operations are provided, as well as a method to peek at the top item on the stack,
// a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.

