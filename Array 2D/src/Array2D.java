package src;

public class Array2D {
    public static void main(String[] args) {
        //int a [][]= new int[3][2];
        int a[][]={
                {1,2},
                {3,4},
                {5,6}
        };

        for(int i=0;i<3;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}