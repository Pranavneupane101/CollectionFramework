package ExceptionHandeling;

import java.util.Scanner;

public class CustomException2 {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner( System.in);
        a=sc.nextInt();
        try{
        if(a ==0)
            throw new PranavException("Zero is not accepted");

        }catch(PranavException e){
            System.out.println(e.getMessage());
        }
    }

}
class PranavException extends Exception{
    public PranavException(String message){
        super(message);

    }
}
