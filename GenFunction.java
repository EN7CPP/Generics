import java.util.Arrays;
class GenClass {
   
    
    public static <T extends Number> void  showProduct(T a,T b){
        
        System.out.println("The sum is: "+ (a.doubleValue()+b.doubleValue()));
        
    }
    
    
    
    
}




public class GenFunction {
    
    public static void main(String args[]) {
        Integer a=5;
        Double k=8.5;
        //Double b=7.5;
        GenClass.showProduct(a,k);
    }
}
