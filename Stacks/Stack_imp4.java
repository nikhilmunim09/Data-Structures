import java.util.ArrayDeque;

public class Stack_imp4 {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println("Top element : "+stack.peek());
        System.out.println(stack.pop()+" is popped.");
        System.out.println("Is stack empty : "+stack.isEmpty());
        System.out.println("size of stack : "+stack.size());

        System.out.print("Printing all the elements of the stack using for loop : ");
        for(Integer integer : stack){
            System.out.print(integer + " "); 
        }
        //it prints all the elements in the stack without popping them out although its breaks the implementation rules of stack.
        System.out.println();
        System.out.println(stack.contains(5));
        System.out.println(stack.contains(12));
        //it tells us whether the given element is present in the stack or not.
        //this also breaks the implementation rules of the stack.
        
        System.out.println(stack.pop()+" is popped.");
        System.out.println(stack.pop()+" is popped.");
        System.out.println(stack.pop()+" is popped.");
        System.out.println("is stack empty : "+stack.isEmpty());

        //System.out.println(stack.pop()+" is popped.");
        //popping element from a empty stack will throw an error.
        //we have to take care of how these methods are implemented so that it should not throw an error.
        
    }
}
