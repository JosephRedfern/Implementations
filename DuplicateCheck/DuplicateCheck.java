import java.util.BitSet;
public class DuplicateCheck{

    public static void main(String args[]){
        if(args.length > 0){
            System.out.printf("String %s does%s contain dupicate characters.%n", args[0], containsDuplicates(args[0]) ? "" : " not");
        }else{
            System.err.printf("Usage: java DuplicateCheck inputstring%n");
        }
    }

    public static boolean containsDuplicates(String s){
        BitSet chars = new BitSet();

        for(int i = 0; i < s.length(); i++){
            int charCode = s.charAt(i);
            if(chars.get(charCode) == true){
                return true;
            }else{
                chars.set(charCode);
            }
        }
        return false;
    }
}
