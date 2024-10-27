public class AlphabatPrinting {
    public static void main(String[] args) {

//        for(int i = 0 ; i < 26 ; i++) {
//            char ch = (char)('a' + i) ;
//            System.out.println(ch);
//        }

        String alphabets = "";
        for(int i = 0 ; i < 26 ; i++) {
            char letter = (char)('a'+i);
            alphabets += letter ;
        }
        System.out.println(alphabets);
    }
}
