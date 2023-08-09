import java.util.ArrayDeque;
import java.util.Queue;

public class queue_imp3 {
    public static void main(String[] args) {

        //we can use any of these methods to create a queue.The functions for all of these methods are same.

        //Queue <Integer > q = new LinkedList<>();
        //LinkedList <Integer> q = new LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        //ArrayDeque <Integer> q = new ArrayDeque<>() ;

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println(q.contains(10));
        System.out.println(q.contains(30));
        
        //ideally this while loop should be used because we should not be able to know what is behind the front element.
        while(!q.isEmpty()){
            System.out.println(q.poll()+" ");
        }

        /*This another version of the above while loop 
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.poll();
        }

        */
        
        /*this is used to know all the elements in the queue but it should not be used. 

        for(Integer x : q){
            System.out.println(x+" ");
        }

        */

        /*add method is same as offer but it will throw an error if we have an upperbounded queue and we are not able to enqueue
        any element in the queue while offer will not throw any error
        */
        q.add(60);
        
        //element returns front element of the queue but will throw an error if the queue is empty but peek will return null
        System.out.println(q.element());
        //remove dequeue and returns the front element of the queue but will throw an error if the queue is empty but poll will return null
        System.out.println(q.remove());
    }
}
