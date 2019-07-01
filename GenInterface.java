import java.util.Arrays;
interface MinMax <T extends Number> {
    public T min();
    public T max();
    
}


class GenClass<T extends Number> implements MinMax<T> {
   
    T[] arr;
    
    
    public GenClass(T [] nums){
        this.arr=nums;
    }
    
    public T min(){
        T m =arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].doubleValue()<m.doubleValue())m=arr[i];
        }
        
        return m;
    }
    
    public T max(){
        T m =arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].doubleValue()>m.doubleValue())m=arr[i];
        }
        
        return m;
    }
    
}




public class GenInterface {
    
    public static void main(String args[]) {
        Integer [] iArr={1,2,3,4,5};
        Double [] dArr={1.3,2.4,0.3,4.1};
        GenClass <Integer> gInt=new GenClass<>(iArr);
        GenClass <Double> gDou=new GenClass<>(dArr);
        
        System.out.println("The minimum of integers: "+gInt.min());
        System.out.println("The maximum of integers: "+gInt.max());
        System.out.println("The minimum of doubles: "+gDou.min());
        System.out.println("The maximum of doubles: "+ gDou.max());
        
        
        
    }
}
