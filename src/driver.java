
public class driver {
    public static void main(String args[]){
        QueueFRomStakcs Q1 = new QueueFRomStakcs();
        System.out.println("isempty: ");
        System.out.println(Q1.isEmpty());
        Q1.enqueue("wassup");
        Q1.enqueue("asdasldijsaldjaslkdjsal");
        Q1.enqueue("WOWOWOWOWOWOWOWOW");
        System.out.println("I just added 3 items");
        System.out.println(Q1.dequeue());
        System.out.println("isempty: ");
        System.out.println(Q1.isEmpty());
        System.out.println(Q1.dequeue());
        System.out.println("I'm gonna peek and then deque, so they should be the same");
        System.out.println(Q1.peek());
        System.out.println(Q1.dequeue());
        System.out.println("isempty: ");
        System.out.println(Q1.isEmpty());
        Q1.enqueue("my name jeff");
        System.out.println("I just added something, and not i'm gonna dequeue it");
        System.out.println(Q1.dequeue());

    }
}
