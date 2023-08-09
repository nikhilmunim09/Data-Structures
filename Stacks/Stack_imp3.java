import java.util.ArrayList;

class Stack3 {
    ArrayList <Integer> list = new ArrayList<>();

    boolean isEmpty() {
        return list.isEmpty();
    }

    //isempty function is for list but here we are creating a isEmpty function for the stack and same for the size function.

    void push(int x){
        System.out.println(x+" is pushed into the stack.");
        list.add(x);
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow.");
            return Integer.MIN_VALUE;
        }
        else {
            int result = list.get(list.size()-1);
            list.remove(list.size()-1);
            return result;
        }
    }

    int peek() {
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        }
        else {
            return list.get(list.size()-1);
        }
    }

    int size () {
        return list.size();
    }

    int top() {
        if(isEmpty()){
            return -1;
        }
        else {
            return list.size()-1;
        }
    }
}

public class Stack_imp3 {

    public static void main(String[] args) {
		Stack3 s = new Stack3();
		for(int i = 1;i<6;i++){
		    s.push(i);
		}
		System.out.println("Top element is present at index : "+s.top());
		System.out.println("Top element present in the stack is : " +s.peek());
	    System.out.println(s.pop()+" is popped from the stack.");
	    System.out.println(s.pop()+" is popped from the stack.");
        System.out.println("Size of the stack is : "+s.size());
	    for(int i = 4;i<11;i++){
	        s.push(i);
	    }
	    s.push(12);
	    for(int i = 0 ;i<11;i++)
	    {
	        System.out.println(s.pop()+" is popped from the stack.");
	    }
	    s.pop();
        s.pop();
        System.out.println("Size of the stack is : "+s.size());
	    
	    
	    
	}
}
