import java.util.Random;

public class ThingList{
    private Node head;
    protected int count;

    public ThingList() {
        head = null;
        count = 0;
    }

    public void addThing(Thing n) {
       Node newNode = new Node(n);

        if(head == null) {
            head = newNode;
            this.count=1;
            return;
        }
        Node it = head;
        while(it.getNext() != null) {
            it = it.getNext();
        }
        it.setNext(newNode);
        this.count++;
    }

    public void printAll() {
        for( Node T = head; T != null; T = T.next )
        System.out.println(T.getData().getRow() + " " + T.getData().getCol() + " " + T.getData().getLab());

        System.out.println("done");
        System.out.flush();

    }

    public void moveAll(Random rand) {
        for( Node T = head; T != null; T = T.next) {
            T.getData().maybeTurn(rand);
            T.getData().step();
      }
    }

    private class Node {
        protected Thing data;
        protected Node next;

        public Node(Thing n) {
            data = n;
            next = null;
        }

        public Thing getData() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node n) {
            this.next = n;
        }
    }
}

