public class JoesArrayListTest{

    public static void main(String args[]){
        JoesArrayList<String> list = new JoesArrayList<String>();

        for(int i= 0; i<100; i++){
            list.add(String.format("Element %d", i));
        }


        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
