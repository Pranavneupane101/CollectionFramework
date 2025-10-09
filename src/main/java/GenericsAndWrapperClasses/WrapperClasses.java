package GenericsAndWrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {

        //Integer obj= new Integer(1); old methods which cant be used now.

        Integer obj1= Integer.valueOf(1);
        Integer obj2= Integer.valueOf("2");
        String myName= String.valueOf("Pranav");
        Boolean myBool= Boolean.valueOf(true);//or
        Boolean yourBool=Boolean.valueOf("false");

        //Auto Boxing
        Integer obj3= 12;

        //Unboxing
        int num=obj3;
    }



}
