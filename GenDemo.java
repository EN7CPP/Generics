class GenClass <T> {
    private T t;
    
    public GenClass (T o){
        this.t=o;
        
    }
    
    public void showType(){
        System.out.println(t.getClass().getName());
    }
    
    
    
}




public class GenDemo {
    
    public static void main(String args[]) {
    GenClass <Integer> gc=new GenClass<>(98);
    gc.showType();
    }
}
