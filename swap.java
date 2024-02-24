public class swap
{
public static void main(String args[])
{
int n1=20, n2=40;
int temp;
System.out.println("Before Swap");
System.out.println("First num : " + n1);
System.out.println("Second num : " + n2);

temp=n1;
n1=n2;
n2=temp;

System.out.println("After Swap");
System.out.println("First num : " + n1);
System.out.println("Second num : " + n2);
}
}