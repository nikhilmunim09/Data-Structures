class findCycle {
    public static void main(String[] args) {

        Linkedlist2 ll = new Linkedlist2();
        ll.insertStart(10);
        ll.insertLast(5);
        ll.insertLast(15);
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(10);
    }

    public static void findcycle(Linkedlist2 ll)
    {
        Node1 current=ll.head.next;
        Node1 temp=ll.head;

        if(ll.head.next==null)
        {
            System.out.println("No cycle found in the given linkedlist.");
            return;
        }
        if(ll.head.next==ll.head)
        {
            System.out.println("Cycle found in the linkedlist.");
            return;
        }
        while(current!=null)
        {
            while(temp!=current)
            {
                if(current.next==temp)
                {
                    System.out.println("Cycle found in the linkedlist.");
                    return;
                }
                else
                {
                    temp = temp.next;
                }
            }
            temp=ll.head;
            current = current.next;
        }
        System.out.println("No cycle found in the given linkedlist.");
    }
}