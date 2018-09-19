public class Stack {
    Node front;
    int size;

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
       return size == 0 || front.getData() == null;

    }

    public void push(Object o){
        Node oldFront = front;
        Node n = new Node(o);
        front = n;
        n.pointMe(oldFront);
        size++;
    }

    public Object peek(){
        return front.getData();
    }

    public Object pop(){
        if(isEmpty()){
            return null;
        }
        Node old = front;
        front = old.getPointer(0);
        old.unPointMe(0);
        size--;
        return old.getData();
    }
}
