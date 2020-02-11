package app;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


// class number{
//     int rollNo;
//     String name;
//     number(int roll, String name){
//         this.rollNo = roll;
//         this.name = name;
//     }
//     public String toString(){
//         return "Name = " + name + " RollNo = " + rollNo + " ...";
//     }

// }

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> set = new TreeSet<>();
        set.add("khan");
        set.add("AbdurRehman");
        set.add(("Zarwar shah"));
    
        for(String s: set){
            System.out.println("name: " + s);
        }
 
        // Set<number> values = new HashSet<>();
        // values.add(new number(111,"Haris khan"));
        //  values.add(new number(222, "Abdurrehman"));
        //  values.add(new number(44, "ARshid alid"));

    // System.out.println(values.add(12));
    // System.out.println(values.add(14));
    // System.out.println(values.add(62));
    // System.out.println(values.add(14));
    // System.out.println(values.add(12));
    // System.out.println(values.add(44));
 

        // values.add(90);
        // values.add(23);
        // values.add(12);
        // values.add(23);
        // values.add(77);
    //     for(number i : values) {
    //         System.out.println("valeus = " + i);
    //   }
    }

}