class Stack2 {
    int MAX;
    int top;
    int[] arr;

    Stack2(int size){
        MAX = size;
        top = -1;
        arr = new int[MAX];
    }

    public boolean isEmpty() {
        return top<0;
    }

    public boolean isFull() {
        return top >= MAX-1;
    }
    
    public void push (int x) {
        if(isFull()){
            System.out.println("Stack overflow.");
        }
        else {
            arr[++top]=x;
        }
    }

    public int pop () {
        if(isEmpty()){
            System.out.println("Stack underflow.");
            return Integer.MIN_VALUE;
        }
        else {
            return arr[top--];
        }
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("Stack underflow.");
            return Integer.MIN_VALUE;
        }
        else {
            return arr[top];
        }
    }

    public int top() {
        return top;
    }

    public int size() {
        return top+1;
    }
}

public class Stack_imp2
{
	public static void main(String[] args) {
		Stack1 s = new Stack1();
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
	    for(int i =0 ;i<10;i++)
	    {
	        System.out.println(s.pop()+" is popped from the stack.");
	    }
	    s.pop();
        System.out.println("Size of the stack is : "+s.size());
	    
	    
	    
	}
}

