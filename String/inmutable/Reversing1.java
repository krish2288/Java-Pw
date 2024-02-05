public class Reversing1 {
    public static void main(String[] args) {
        String s1="Hello World";
        String rev="";
        String sarr[]=s1.split(" ");
        for(String elem:sarr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                rev = rev + elem.charAt(i);
            }
            rev=rev+" ";
        }
        System.out.println(rev);
    }
}
