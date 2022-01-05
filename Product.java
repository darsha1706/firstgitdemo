/*13. Create class Product (pid, price, quantity) with parameterized
constructor.
Create a main function in different class (say XYZ) and perform following task:
a. Accept five product information from user and store in an array
b. Find Pid of product with highest price.
c. Create method (with array of product’s object as argument) in XYZ class
to calculate and return total amount spent on all products. (amount spent on
single product=price of product * quantity of product)
*/

package java_assignment;
import java.util.*;

class Productt
{
	int pid;
	int price;
	int quantity;
	Productt(int pid,int price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
}

public class Product {
static int tot=0;
	static void totalcount(Productt[] s)
	{
		for(int i=0;i<5;i++)
		{
			tot+=s[i].quantity*s[i].price;
			
		}
		System.out.println("tot");
	}
	
	
	public static void main(String[] args) {
		Productt p[]=new Productt();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the id for product "+i+" :");
			p[i].pid=sc.nextInt();
			
			System.out.println("Enter the price for product "+i+" :");
			p[i].price=sc.nextInt();
			
			System.out.println("Enter the price for product "+i+" :");
			p[i].quantity=sc.nextInt();
		}
		sc.close();
		Product.totalcount(p);
		}
	
	}


