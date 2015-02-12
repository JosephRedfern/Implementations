public class RLE{
    public static void main(String[] args){
        System.out.println("TTtthisssssssssssssssssssssssssssssssssssssssssssssIisAaaaaaTest");
        System.out.println(encodeString("TtthisssssssssssssssssssssssssssssssssssssssssssssIisAaaaaaTest"));
    }

    public static String encodeString(String input){
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();

        char curChar = charArray[0];
        int charCount = 1;

        for(int i = 0; i < charArray.length; i++){
            if(i == 0){
                curChar = charArray[0];
                charCount = 1;
            }else if(charArray[i] == curChar){
                charCount++;
            }else{
                sb.append(String.format("%c%d", curChar, charCount));

                curChar = charArray[i];
                charCount = 1;
            }
        }

        sb.append(String.format("%c%d", curChar, charCount));

        if(sb.length() < input.length()){
            return sb.toString();
        }else{
            return input.toString();
        }

    }
}
