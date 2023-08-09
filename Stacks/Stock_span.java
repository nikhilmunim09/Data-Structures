public class Stock_span {
    public static void main(String[] args) {
        int [] arr = {100,20,30,60,40,55,80,50,120};
        stockSpan(arr);
    }

    //this is the naive approach.

    public static void stockSpan(int[] arr){
        
        for(int i = 0 ; i < arr.length ; i++ ){
            int curr_span=1;
            for(int j = i - 1 ; j>=0 && arr[j]<=arr[i] ; j--){
                curr_span++;
            }
            System.out.print(curr_span + " ");
        }
    }
}
