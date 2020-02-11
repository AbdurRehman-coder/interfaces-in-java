package app;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// class consimpl implements Consumer<Integer>{
//     public void accept(Integer t){
//         System.out.println("values = " + t);

//     }
// }
public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> val = Arrays.asList(2,3,4,5,6,6);
         // val.forEach(i -> System.out.println("the values of list: " + i));

         //this is internal for loop..
         // we use this loop with the help of Consumer interface
         // which is the @FuntionalInterface(mean it has only abstract method).
    val.forEach(t -> System.out.println("the values of list = " + t));
    }
}