import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Practice_question3 {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        int[] ans = new int[n];
        Queue<Integer> index = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            index.add(i);
        }
        for (int card : deck) {
            ans[index.poll()] = card;
            if (!index.isEmpty()) {
                index.add(index.poll());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] deck = { 17, 13, 11, 2, 3, 5, 7 };
        int[] ans = deckRevealedIncreasing(deck);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
