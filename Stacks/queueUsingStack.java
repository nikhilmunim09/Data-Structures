import java.util.Stack;

class QueueByStack {

    Stack <Integer> main = new Stack<>();
    Stack <Integer> temp = new Stack<>();

    void enqueue(int data)
    {
        //if no element is present in stack.
        if(main.isEmpty())
        {
            main.push(data);
            return;
        }

        //if elements are present in stack.
        while(!main.isEmpty())
        {
            temp.push(main.pop());
        }

        main.push(data);

        while(!temp.isEmpty())
        {
            main.push(temp.pop());
        }
    }

    int dequeue()
    {
        if(main.isEmpty())
        {
            System.out.println("Queue is empty, can't remove any element.");
            return Integer.MIN_VALUE;
        }

        return main.pop();
    }

    int size()
    {
        return main.size();
    }

}

class queueUsingStack {
    public static void main(String[] args) {
        QueueByStack q = new QueueByStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        for(int i=0;i<7;i++)
        {
            System.out.print(q.dequeue()+" ");
        }
    }
}