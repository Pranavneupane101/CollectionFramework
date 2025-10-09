package GenericsAndWrapperClasses;

public class GenericMethods {
    public static void main(String[] args) {
        printData("hello");
        GenericMethods gm = new GenericMethods();
        //gm.doubleData("112"); does not work because it is bounded to numbers.
        gm.doubleData(12);
    }
    static <E> void printData(E Data){
        System.out.println(Data);
    }
    <E extends Number> void doubleData(E Data){
        System.out.println(Data);
    }
}
