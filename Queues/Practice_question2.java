import java.util.ArrayDeque;
import java.util.Queue;

class StackUsingQueue {

    Queue <Integer> q1 = new ArrayDeque<>();
    Queue <Integer> q2 = new ArrayDeque<>();

    void push (int item){
        if(q1.isEmpty()){
            q1.offer(item);
            System.out.println(q1.peek()+" is added to stack.");
            return;
        }
        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(item);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        System.out.println(q1.peek()+" is added to the stack.");
    }

    int pop (){
        if(q1.isEmpty()){
            System.out.println("Underflow,can't remove any element.");
            return Integer.MIN_VALUE;
        }
        return q1.poll();
    }

    int top(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        }
        return q1.peek();
    }

    boolean isEmpty(){
        return q1.isEmpty();
    }
}

class Practice_question2 {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}