package ExceptionHandeling;

public class RunTimeException {

    public static void main(String[] args) {

        int arr[]=new int[5];

        try {
            int result=5/0;
            System.out.println( arr[8]);
        }  catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Tred to access the out oof bound element.");
        }

        try {
            int result=5/0;
            System.out.println( arr[8]);
        }  catch(Exception e) {
            System.out.println("Tred to access the out oof bound element.");
        }
        System.out.println("End of code");

    }


}
