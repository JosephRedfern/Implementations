public class TestJoesLinkedList{

    public static void main(String args[]){
        JoesLinkedList<String> list = new JoesLinkedList<String>();

        for(int i = 0; i<10; i++){
            list.add(String.format("Element %d", i));
        }

        list.remove(5);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
