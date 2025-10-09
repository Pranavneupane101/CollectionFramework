package ExceptionHandeling;

public class ThrowAndThrows {

    public static void main(String[] args) {
        int a[]=new int[5];
        try {
            getArray(a);
        } catch (Exception e){
            System.out.println("catched the exception"+e.getMessage());
        }
    }

    // static because main method is static and belongs to class not object.

    public static int getArray  (int a[]) throws ArrayIndexOutOfBoundsException{
        return a[8];
    }

}
