class Stack1 {
    static final int MAX = 10;
    int top ;
    int[] arr = new int[MAX];
    
    Stack1() {
        top=-1;
    }
    
    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow.");
        }
        else {
            arr[++top]=x;
            System.out.println(x+" is pushed into stack.");
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow.");
            return Integer.MIN_VALUE;
        }
        else {
            return arr[top--];
        }
    }
    
    public int peek (){
        if(isEmpty()) {
            System.out.println("Stack underflow.");
            return -1;
        }
        else {
            return arr[top];
        }
    }
    
    public int top() {
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        else {
            return top;
        }
    }
    
    public boolean isFull() {
        return top == MAX-1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public int size() {
        return top+1;
    }
    
}

public class Stack_imp1
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
