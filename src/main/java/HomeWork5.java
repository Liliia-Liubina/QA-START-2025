public class HomeWork5 {
    public static void main (String[] args) {

        String reversed = "this string will be reversed";
        char [] symbols = reversed.toCharArray();

        for (int i = symbols.length-1; i>=0 ; i--) {
            System.out.println(symbols[i]);
        }


    }

}
