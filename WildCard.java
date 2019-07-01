import java.util.Arrays;
class GenClass <T extends Number> {
    private T t;
    
    public GenClass (T o){
        this.t=o;
        
    }
    
    public void showProduct(GenClass<?> ob){
        
        System.out.println("The Product is : " +t.doubleValue()*ob.t.doubleValue());
        
    }
    
    
    
    
}




public class WildCard {
    
    public static void main(String args[]) {
    GenClass <Integer> gc=new GenClass<>(25);
    GenClass <Double> gc_2=new GenClass<>(10.0);
    gc.showProduct(gc_2);
    }
}
