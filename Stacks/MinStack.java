import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List <Integer> s = new ArrayList<>();
    List <Integer> min = new ArrayList<>();

    public void push(int x){
       s.add(x);
       if(min.isEmpty())
       {
        min.add(x);
       }
       else {
        int temp = min.get(min.size()-1);
        if(x<=temp){
            min.add(x);
        }
        else {
            min.remove(min.size()-1);
            min.add(x);
            min.add(temp);
        }
       }
    }

    public int pop(){
       if(s.isEmpty()) {
        System.out.println("Stack underflow.");
        return Integer.MIN_VALUE;
       }
       else {
        int temp = s.get(s.size()-1);
        s.remove(s.size()-1);
        min.remove(Integer.valueOf(temp));
        return temp;
       }

    }

    public int top() {
        if(s.isEmpty()) {
        System.out.println("Stack underflow.");
        return Integer.MIN_VALUE;
       }
       else {
        int temp = s.get(s.size()-1);
        return temp;
       }
    }

    public int getMin(){
        return min.get(min.size()-1);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        minStack.top();    // return 0  
        System.out.println(minStack.getMin()); // return -2
    }

}
