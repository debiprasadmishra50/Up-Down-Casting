package casting;

public class Main 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		Parent p = new Parent();

		Parent p_ref = new Child(); // Upcasting
//		Child c_ref = (Child) new Parent(); //Downcasting //Show ClassCastException
		Child cc = (Child) p_ref; //Downcasting //Exception is checked // No Error

		c.display();
		c.show();
		c.view();
		System.out.println();

		p.display();
//		p.show();
//		p.view();
		System.out.println();

		p_ref.display();
//		p_ref.show();
//		p_ref.view();
		System.out.println();

		cc.display();
		cc.show();
		cc.view();
	}
}
