import java.util.Stack;

public class LargestAreaUnderHistogram3 {

    public static void main(String[] args) {
        int[] arr ={2,3,3,2};
        System.out.println("Largest under this histogram is : "+largestArea(arr));
    }

    public static int largestArea(int[] arr) {
        Stack <Integer> s = new Stack<>();
        int top_index;
        int curr=0;
        int largest=0;
        for(int i = 0 ; i < arr.length ; i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                top_index=s.peek();
                s.pop();
                curr = arr[top_index]*(s.isEmpty()?i:i-s.peek()-1);
                largest=Math.max(largest, curr);
            }
            s.push(i);
        }
        while(s.isEmpty()==false ){
                top_index=s.peek();
                s.pop();
                curr = arr[top_index]*(s.isEmpty()?arr.length:arr.length-s.peek()-1);
                largest = Math.max(largest, curr);
        }
        return largest;

    }
}
