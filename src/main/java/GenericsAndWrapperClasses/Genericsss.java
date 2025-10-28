package GenericsAndWrapperClasses;

public class Genericsss<T,D> {
    private T id;
    private D data;

    public Genericsss(T id, D data){
        this.id=id;
        this.data=data;

    }
    public T getId(){
        return this.id;
    }
    public D getData(){
        return this.data;
    }

    public static void main(String[] args) {

        Genericsss<String,Integer> gn=new  Genericsss("Pranav",57);
        String id=gn.getId();
        int data=gn.getData();
        System.out.println("id:"+id+" data:"+data);
    }
}
