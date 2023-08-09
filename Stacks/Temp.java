import java.util.Stack;

class Temp {

    public static int largestHistRow(int[] arr, int n)
    {
        Stack <Integer> s = new Stack<>();
        int res = 0;
        int top_index;
        int curr;
        // The stack will contain the previous smaller element
        // Popping will happen from the stack because we encountered a next smaller element
        for (int i = 0; i < n; i++)
        {
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
                top_index = s.peek();
                s.pop();
                curr = arr[top_index] * (s.isEmpty() ? i : i - s.peek() - 1);
                res = Math.max(res, curr);
            }
            s.add(i);
        }
        // for the rest of the elements for which next smaller doesnt exist in the array
        while (s.isEmpty() == false) {
            top_index = s.peek();
            s.pop();
            curr = arr[top_index] * (s.isEmpty() ? n : n - s.peek() - 1);
            res = Math.max(res, curr);
        }

        return res;

    }
    static int maxArea(int R, int C, int mat[][])
    {
        int res = largestHistRow(mat[0], C);

        for (int i = 1; i < R; i++) {

            for (int j = 0; j < C; j++)

                if (mat[i][j] == 1)
                    mat[i][j] += mat[i - 1][j];

            res = Math.max(res, largestHistRow(mat[i], C));
        }

        return res;
    }


    // Driver code
    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;

        int[][] arr = {
            { 0, 1, 1, 0 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 0, 0 },
        };
        System.out.print("Maximum rectangle is: " + maxArea(R, C, arr));
    }
}
