public class Skiprec {

    public static void main(String[] args) {
        // String p = "baccad";
      skip("", "abc");
    }

    public static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        // if (ch == 'a') {
        //     return skip(processed, unprocessed.substring(1));
        // } else {
        //     return skip(processed + ch, unprocessed.substring(1));
        // }

         skip(processed, unprocessed.substring(1));
         skip(processed + ch, unprocessed.substring(1));
    }
}
