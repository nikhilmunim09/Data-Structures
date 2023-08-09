import java.util.LinkedList;

class LinkedList_PQ1 {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.add(80);
        middle(ll);
    }

    public static void middle(LinkedList <Integer> ll)
    {
        int middle = ll.size()/2 ;
        for(int i = middle ; i<ll.size();i++)
        {
            System.out.print(ll.get(i)+" ");
        }
    }
}
