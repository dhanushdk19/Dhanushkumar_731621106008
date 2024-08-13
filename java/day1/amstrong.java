
import java.util.*;
class amstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = s.nextInt();
        int org = num;
        int inp = num;
        
        int count = 0;
        while(num!=0){
            count++;
            num=num/10;
        }
        int sum = 0;
        int rem;
        
        while(org > 0){
            rem = org%10;
            sum = sum + (int)Math.pow(rem, count);
            org = org/10;
        }
         if(sum == inp)
        System.out.println(inp + " is Amstrong Number");
        else
        System.out.println(inp + " is Not a Amstrong Number");
        
    }
}