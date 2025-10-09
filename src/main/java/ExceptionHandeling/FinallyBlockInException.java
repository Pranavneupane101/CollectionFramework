package ExceptionHandeling;

public class FinallyBlockInException {
    public static void main(String[] args) {
        int a[]=new int[5];

        try{
            System.out.println(a[8]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }finally{
            System.out.println("I will run wheather the exception comes or not ");
        }
        /*There are come case when finally block doenot execute
            -> Use System.exit() method
            ->An exception occurs in the finally blocks
        */
    }
}
