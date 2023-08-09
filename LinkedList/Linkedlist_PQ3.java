import java.util.LinkedList;

public class Linkedlist_PQ3 {

    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll = reverse(ll);
        print(ll);
    }

    

    static LinkedList <Integer> reverse (LinkedList <Integer> ll)
    {
        int length = ll.size();
        for(int i = 0,j = length -1 ; i < length/2 ; i++ , j--)
        {
            int temp = ll.remove(j);
            ll.add(j,ll.get(i));
            ll.remove(i);
            ll.add(i, temp);

        }
        return ll;
    }

    static void print(LinkedList <Integer> ll)
    {
        for(Integer x : ll)
        {
            System.out.print(x+" ");
        }
    }
}
