package ExceptionHandeling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);System.out.println("Enter the value of a number");
        try{
        int age=sc.nextInt();
        if(age>100){
            throw new MyException("This is my own exception");
        }
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
class MyException extends Exception{

    public MyException(String message ){
        super(message);// to call the constructor of the parent class.
    }

}

