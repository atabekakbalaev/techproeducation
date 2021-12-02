package day39practice;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args){
    
                LinkedList<String> input = new LinkedList<String>();
                input.add("Java");
                input.add("C++");
                input.add("C");
                input.add(".Net");
                input.add("Oracle");
                System.out.println("Sublist is: " + getSubList(input, 5, 3));
            }
     public static List getSubList(List<String> input, int start, int end) {
         if( input.isEmpty() || start > end || start < 0 || end < 0 )
             return null;
         return input.subList(start, end);
     }
}
