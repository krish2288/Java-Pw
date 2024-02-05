public class EnhancedForLoop {
    public static void main(String[] args) {
        int num [][]={
                {5,4,3,2},
                {3,4,5,6},
                {2,4,6,8},
                {3,5,4,1}
        };
        for(int a[]:num){
            for (int b:a){
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}
