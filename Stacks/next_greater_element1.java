public class next_greater_element1 {

    public static void main(String[] args) {
        int[] arr = {12,10,20,22,15,14,18,32,20,22,19};
        nextGreater(arr);
    }
    
    //this is the naive approach.
    public static void nextGreater(int[] arr){
        printArray(arr);
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++ ) {
            boolean searched = false ;
            for(int j = i+1 ; j < arr.length ; j++ ) {
                if(arr[j]>arr[i]) {
                    System.out.print(arr[j]+"   ");
                    searched = true;
                    break;
                }
            }
            if(searched==false) {
                    System.out.print("--"+"   ");
                }
        }
    }

    public static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x+"   ");
        }
    }
}
