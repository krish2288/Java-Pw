public class Reversing {
    public static void main(String[] args) {
        String s1="Hello World";
        String rev=" ";
        for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        System.out.println(rev);
    }
}
