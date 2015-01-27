import java.util.Arrays;

public class JoesArrayList<T>{

    private int count = 0; 
    private int size = 5; //Initial size
    private double resizeFactor = 1.2; //Multiply size by this value during resizing.

    private Object[] elements;

    public JoesArrayList(){
        this.elements = new Object[this.size];
    }

    public void add(T element){
        if(this.count == this.size){
            this.resize();
        }

        this.elements[this.count] = element;
        this.count++;
    }

    public T get(int index){
        @SuppressWarnings("unchecked") //I think doing this is OK. Add only accepts type T, so elements[] can only contain type-T elements
        return (T)this.elements[index];
    }

    public int size(){
        return this.count;
    }

    private void resize(){
        int newSize = (int)Math.round(this.size*this.resizeFactor);
        this.elements = Arrays.copyOf(this.elements, newSize);
        this.size = newSize;
    }
}
