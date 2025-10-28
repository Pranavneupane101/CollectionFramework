package ExceptionHandeling;

public class TryingExceptions {
    public static void main(String[] args) {

        int[] a = new int[5];
        try {
            float result = 18 /20;
            if(result ==0){
                throw new ArithmeticException();
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("The result is not accurate ");
        }
    }

}
