/* Basic tree data-structure.
 *
 * By Joseph Redfern */

import java.util.Iterator;
import java.util.ArrayList;

public class Node<T> implements Iterable<Node<T>>{
    private Node<T> parent;
    private T data;
    private ArrayList<Node<T>> children = new ArrayList<Node<T>>();

    public Node(){

    }

    public Node(T data){
        this.data = data;
    }

    public Node(Node<T> parent, T data){
        this.parent = parent;
        this.data = data;
    }

    public int childCount(){
        return this.children.size();
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void setParent(Node<T> parent){
        this.parent = parent;
    }
    
    public Node<T> getParent(){
        return this.parent;
    }

    public void addChild(Node<T> node){
        node.setParent(this);
        this.children.add(node);
    }

    public Iterator<Node<T>> iterator(){
        return this.children.iterator();
    }

}
