public class NodeTest{

    public static void main(String args[]){
        Node<String> stringNode = new Node<String>("Hello");
        stringNode.addChild(new Node<String>("World"));
        stringNode.addChild(new Node<String>("!"));
        printRecursive(stringNode, 0);
    }

    public static void printRecursive(Node<String> val, int depth){
        System.out.printf("%sDepth: %d, Value: %s%n", new String(new char[depth]).replace("\0", " "), depth++, val.getData());
        for(Node<String> child : val){
            printRecursive(child, depth);
        }
    }

}
