/* Implementation of a linked list using Generics in Java.
 *
 * by Joseph Redfern (26/01/2015)
 *
 */

public class JoesLinkedList<T>{
    private int count;
    private Node<T> head;

    public JoesLinkedList(){
        //Initially, we have 0 nodes.
        this.count = 0;
    }

    public int size(){
        return this.count;
    }
    
    public void add(T data){
        count++;

        //Create the head node when data first gets added.
        if(head == null){
            this.head = new Node<T>(data);
            return;
        }

        Node<T> unlinkedNode = new Node<T>(data);
        Node<T> tempNode = this.head;

        while(tempNode.getNext()!=null){
            tempNode = tempNode.getNext();
        }

        //At this point, tempNode has no next node
        //Set the nextNode to our newly created node.
        tempNode.setNext(unlinkedNode);
    }

    public T get(int index){
        return this.getNode(index).getData();
    }

    public void remove(int index){
        Node<T> previousNode = this.getNode(index-1);
        Node<T> deadNode = previousNode.getNext();

        previousNode.setNext(deadNode.getNext());
        this.count--;
        //GC should take care of disposing of deadNode, no other references to it
    }


    private Node<T> getNode(int index){
        //In this case it sort-of makes more sense having a null-data head
        Node<T> currentNode = this.head;

        if(index == 0)
            return currentNode;

        for(int i = 1; i <= index; i++){
            currentNode = currentNode.getNext();
        }

        return currentNode;

    }
        

    private class Node<T>{
        T data;
        Node<T> nextNode;

        public Node(T data){
            this.data = data;
        }

        public void setNext(Node<T> nextNode){
            this.nextNode = nextNode;
        }

        public Node<T> getNext(){
            return this.nextNode;
        }

        public T getData(){
            return this.data;
        }
    }
}


