import java.util.Arrays;
class GenClass <T extends Number> {
    private T t;
    
    public GenClass (T o){
        this.t=o;
        
    }
    
    public void printSquare(){
        
        System.out.println("The square is: " + t.doubleValue()*t.doubleValue());
    }
    
    
    
}




public class GenWithBounds {
    
    public static void main(String args[]) {
    GenClass <Integer> gc=new GenClass<>(25);
    gc.printSquare();
    }
}
