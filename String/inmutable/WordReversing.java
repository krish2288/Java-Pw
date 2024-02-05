public class WordReversing {
    public static void main(String[] args) {
        String s1="Hello World";
        String rev="";
        String Sarr[]=s1.split(" ");
        for(int i=Sarr.length-1;i>=0;i--){
            rev=rev+Sarr[i]+" ";
        }
        System.out.println(rev);
    }
}
