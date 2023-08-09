import java.util.Stack;
import java.lang.Math;
public class LargestRectwith1 {

    static int R = 4;
    static int C = 4;
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,0},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,0,0}}; 

        System.out.println("Largest area : "+largestArea(arr));
    }
    public static int largestAreaInHist(int[] arr) {
        Stack <Integer> s = new Stack<>();
        int top_index;
        int curr=0;
        int largest=0;
        for(int i = 0 ; i < arr.length ; i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                top_index=s.peek();
                s.pop();
                curr = arr[top_index]*(s.isEmpty()?i:i-s.peek()-1);
                if(curr>largest){
                    largest=curr;
                }
            }
            s.push(i);
        }
        while(s.isEmpty()==false ){
                top_index=s.peek();
                s.pop();
                curr = arr[top_index]*(s.isEmpty()?arr.length:arr.length-s.peek()-1);
                if(curr>largest){
                    largest=curr;
                }
        }
        return largest;

    }

    public static int largestArea(int[][] arr){
        
        int largest = largestAreaInHist(arr[0]);
        for(int i = 1 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                if(arr[i][j]==1){
                    arr[i][j]+=arr[i-1][j];
                }
            }
            largest = Math.max(largest, largestAreaInHist(arr[i]));
        }
        
        return largest;
    }
}
