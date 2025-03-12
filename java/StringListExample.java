import java.util.ArrayList;
import java.util.List;

public class StringListExample {

        public static void main(String[] args) {

 
            List<String> list = new ArrayList<String>();
            list.add("aryan");
            list.add("sahil");
            list.add("tarun");
            list.add("karan");

            System.out.print("names in List : " + list);
            
            int index = list.indexOf("tarun");
            System.out.println();
            System.out.println(index);
            //print by index
             String name=list.get(2);
            System.out.println(name) ;
            }



}

