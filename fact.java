package fact;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the value");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int fact=1;
for(int i=1;i<=a;i++)
{
	fact=fact*i;
}
System.out.println("factorial"+fact);
	}

}
