/**
 * Name: MAx Lewis
 * Lab Name: Queue
 * Lab Purpose: make a queue class using the node class I/we made previously
 * queue is a first in first out system
 * Date: 9/14/18
 * Collaborators: None
 */
public class Queue {
    Node back;
    Node front;
    int size;

    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return size == 0 || front.getData() == null;
    }
    public void enqueue(Object o){
        if(isEmpty()){
            front = new Node(o);
            front.pointMe(null);
            back = front;

            size++;
        }
        else{
            Node oldBack = back;
            back = new Node(o);
            oldBack.unPointMe(0);
            oldBack.pointMe(back);
            back.pointMe(null);
            size++;
        }

    }
    public Object peek(){
        return front.getData();
    }

    public Object dequeue(){
        if(isEmpty()){
            return null;
        }
        else{
            Node old = front;
            front = old.getPointer(0);
            old.unPointMe(0);
            size--;
            return old.getData();
        }
    }
}
