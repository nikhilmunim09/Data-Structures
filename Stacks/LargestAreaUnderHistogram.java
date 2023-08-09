public class LargestAreaUnderHistogram {
    
    public static void main(String[] args) {
        int[] arr = {11,3,4,4,1,5,7};
        largestArea(arr);
    }

    //this is the  naive approach.

    
    public static void largestArea(int[] arr){

        int largest=0;
        for(int i = 0 ; i < arr.length ; i++){
            int area;
            area = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>=arr[i]) {
                area+=arr[i];
                j--;
            }
            j=i+1;
            while(j<arr.length && arr[j]>=arr[i]){
                area += arr[i];
                j++;
            }
            if(area>largest){
                largest=area;
            }
        }
        System.out.println("Largest rectangular area under this histogram is : "+largest);
    }
}
