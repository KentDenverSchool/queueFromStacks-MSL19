public class QueueFRomStakcs {
    Stack inSt = new Stack();
    Stack outSt = new Stack();
    int size;
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return size == 0 || inSt.peek() == null;
    }
    public void enqueue(Object Ob) {
        inSt.push(Ob);
        size++;
    }
    public Object peek(){

        if(size>0){
            for(int i = 0; i<size; i++){
                outSt.push(inSt.pop());
            }
            Object temp = outSt.peek();
            for(int j = 0; j<size; j++){
                inSt.push(outSt.pop());
            }

            return temp;

        }
        else{
            return null;
        }

    }

    public Object dequeue(){
        if(size>0){
            for(int i = 0; i<size; i++){
                outSt.push(inSt.pop());
            }
            Object temp = outSt.pop();
            for(int j = 0; j<size-1; j++){
                inSt.push(outSt.pop());
            }
            size--;
            return temp;

        }
        else{
            return null;
        }

    }


}
