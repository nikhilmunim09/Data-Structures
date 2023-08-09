import java.util.Stack;

public class prev_greater_element2 {

    public static void main(String[] args) {
        int[] arr = {12,10,20,22,15,14,18,32,20,22,19};
        prevGreaterElem(arr);
    }

    //this is the optimized approach.


    public static void prevGreaterElem(int[] arr) {
        printArray(arr);
        System.out.println();
        Stack <Integer> s = new Stack<>();
        s.push(arr[0]);
        System.out.print("--"+"   ");
        for(int i = 1 ; i < arr.length ; i++ ) {
            while(s.isEmpty()==false && s.peek()<=arr[i]) {
                s.pop();
            }
            System.out.print(s.isEmpty()?"--"+"   ":s.peek()+"   ");
            s.push(arr[i]);
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"   ");
        }
    }
}
