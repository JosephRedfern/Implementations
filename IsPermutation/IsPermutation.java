import java.util.Arrays;

public class IsPermutation{

    public static void main(String args[]){

        String s1, s2;

        if(args.length < 2){
            s1 = "Hello World";
            s2 = "eloWH llrod";
        }else{
            s1 = args[0];
            s2 = args[1];
        }

        System.out.printf("%s is%s a permutation of %s%n", s1, isPermutation(s1, s2) ? "" : " not", s2);
    }

    public static boolean isPermutation(String s1, String s2){

        //No point bothering with sorting etc if this is the case!
        if(s1.length() != s2.length()){
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        for(int i = 0; i< s1Array.length; i++){
            if(s1Array[i] != s2Array[i]){
                return false;
            }
        }
        
        return true;
    }
}
