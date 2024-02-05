class multipleCatchBlock {

        public static void main(String[] args) {
            int a=6;
            int b=0;
            int result=0;
           int arr []={1,2,3,4,5};
            try
            {
                result=a/b;
                System.out.println(arr[6]);
            }
            catch (ArithmeticException obj){
                System.out.println("not divide by 0 ");
            }

            catch (ArrayIndexOutOfBoundsException obj){
                System.out.println("give correct lenth of array");
            }



            System.out.println(result);
            System.out.println("All thing is right");

        }


}