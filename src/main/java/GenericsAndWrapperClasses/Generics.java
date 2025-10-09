package GenericsAndWrapperClasses;

public class Generics {
    public static void main(String[] args) {
        Dog dg = new Dog("123abc");
        Cat<String> cat=new Cat<>("AB07");
        Cat<Integer> cat1=new Cat<>(12334);
        Mouse<Integer,String> mouse= new Mouse<>(12342,"9869125787");
        donkey<String>dk = new donkey<>("String");

    }
}
class Dog{
    String id;

    public Dog(String id){
        this.id=id;
    }
}
class donkey<C>{
    C id;
 public donkey(C id){
     this.id=id;
 }
}
class Cat<A> {
    A id;
    public Cat(A id){
        this.id =id;
    }
    public A getId(){
        return id;
    }
}
class Mouse<A,B>{
    A id;
    B contact;
    public Mouse(A id,B contact){
        this.id=id;
        this.contact=contact;
    }
}