import java.util.Stack;

public class next_greater_element2 {

    public static void main(String[] args) {
        int[] arr = {12,10,20,22,15,14,18,32,20,22,19};
        nextGreater(arr);
    }

    //this is the optimized approach.

    public static void nextGreater(int[] arr){
        printArray(arr);
        System.out.println();
        Stack <Integer> s = new Stack<>();
        s.push(arr[arr.length-1]);
        String[] result = new String[arr.length];
        result[arr.length-1]="--";
        for(int i = arr.length-2 ; i >= 0 ; i--){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()) {
                result[i]="--";
            }
            else {
                result[i]=Integer.toString(s.peek());
            }
            s.push(arr[i]);
        }
        printArray(result);
    }

    public static void printArray(String[] arr){
        for(String x : arr){
            System.out.print(x+"   ");
        }
    }

    public static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x+"   ");
        }
    }
}
