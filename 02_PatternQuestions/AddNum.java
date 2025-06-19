import java.lang.*;
import java.util.*;



public class AddNum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter First Number : ");
          float num1 = ob.nextFloat();
        System.out.print("Enter Second Number : ");
          float num2 = ob.nextFloat();

        float res = num1+num2;
        
        System.out.println("Sum : " + res);
    } 
}
