import java.util.Stack;

public class LargestAreaUnderHistogram2 {
    public static void main(String[] args) {
        int[] arr = {11,3,4,4,1,5,7};
       largestArea(arr);
    }
    public static void largestArea(int[] arr){
        int[] prev_smaller = new int[arr.length];
        int[] next_smaller = new int[arr.length];
        next_prev_Smaller(arr, prev_smaller, next_smaller);
        int largest = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            int area = arr[i];
            int count = 0;
            if(prev_smaller[i]==-1){
                count+=i;
            }
            else {
                count+=(i-prev_smaller[i]-1);
            }
            if(next_smaller[i]==-1){
                count+=arr.length-1-i;
            }
            else {
                count+=(next_smaller[i]-1-i);
            }
            area+=count*arr[i];
            if(area>largest){
                largest=area;
            }
        }
        System.out.println("Largest rectangular area under this histogram is : "+largest);
    }

    public static void next_prev_Smaller(int[] arr,int[] prev_smaller,int[] next_smaller){
        Stack <Integer> s = new Stack<>();
        s.push(0);
        prev_smaller[0]=-1;
        for(int i = 1 ; i < arr.length ; i++){
            while(s.isEmpty() == false && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            prev_smaller[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }

        while(s.isEmpty()==false){
            s.pop();
        }

        next_smaller[arr.length-1]=-1;
        s.push(arr.length-1);
        for(int i = arr.length - 2 ; i >= 0 ; i--){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            next_smaller[i]=s.empty()?-1:s.peek();
            s.push(i);
        }
        

    }
    
    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
}
