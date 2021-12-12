package package01;

import java.util.*;

public class Demo01 {
    protected int num1;
    protected int num2;
    protected Demo01()
    {
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        num2 = sc.nextInt();

    }
 public void display()
 {
     System.out.printf(num1 +" "+num2);
 }
}
