import java.util.Stack;

public class Stock_span2 {
    public static void main(String[] args) {
        int [] arr = {100,20,30,60,40,55,80,50,120};
        stockSpan(arr);
    }

    //this is the optimized approach.


    public static void stockSpan(int[] arr){
        Stack <Integer> s = new Stack<>();
        s.push(0);
        System.out.print("1 ");
        for(int i = 1 ; i < arr.length ; i++ ) {
            while( !s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            System.out.print(s.isEmpty()?i+1:i-s.peek()+ " ");
            s.push(i);
        }
    }
}
