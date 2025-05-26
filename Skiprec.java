public class Skiprec {

    public static void main(String[] args) {
        String p = "baccad";
        String result = skip("", p);
        System.out.println(result); 
    }

    public static String skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return processed;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            return skip(processed, unprocessed.substring(1));
        } else {
            return skip(processed + ch, unprocessed.substring(1));
        }
    }
}
