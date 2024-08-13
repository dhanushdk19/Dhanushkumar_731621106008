import java.util.*;

public class Array{
public static void main(String args[]){

System.out.println("Enter Length");
Scanner s = new Scanner(System.in);

int len = s.nextInt();
int arr[] = new int [len];

for(int i=0;i<len;i++){
arr[i] = s.nextInt();
}

int total = 0;
for(int j=0;j<arr.length;j++){
total = total + arr[j];
}
System.out.println("Total : "+ total);
}
}