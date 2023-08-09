public class prev_greater_element1 {
    public static void main(String[] args) {

        int[] arr = {12,10,20,22,15,14,18,32,20,22,19};
        prevGreaterElem(arr);
        
    }

    //this is the naive approach.

    public static void prevGreaterElem (int[] arr){
        
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+"   ");
        }

        System.out.println();

        System.out.print("--"+"   ");

        for(int i = 1 ; i < arr.length ; i++ ) {

            boolean searched = false;
            for(int j = i - 1 ; j >= 0 ; j--){
                if( arr[j] > arr[i]) {
                    System.out.print(arr[j]+"   ");
                    searched = true;
                    break;
                }         
            }
            if(!searched) {
                System.out.print("--"+"   ");
            }  
        }
           
    }
}
