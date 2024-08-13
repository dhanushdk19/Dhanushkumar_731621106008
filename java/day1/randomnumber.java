
import java.util.*;
class randomnumber {
    public static void main(String[] args) {
        int max=1,min=50;
          System.out.println("Generated numbers are within "+min+" to "+max);
           System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
          System.out.println(min + (int)(Math.random() * ((max - min) - 1)));
          System.out.println(min + (Math.random() * ((max - min) )));
          System.out.println((int)Math.random());
          System.out.println(Math.random());
        
    }
}