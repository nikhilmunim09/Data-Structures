package Hashing;

public class CountDistinctElements {
    
    public static void main(String[] args) {
        
        int[] arr = {8,9,5,8,9,7,12};

        int count = 0; 
        for(int i = 0 ; i < arr.length ; i++)
        {
            boolean flag = true;
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[j]==arr[i])
                {
                    flag = false;
                }
            }

            if(flag)
            {
                count++;
            }
        }

        System.out.println("Number of distinct elements : "+count);



    }

}
