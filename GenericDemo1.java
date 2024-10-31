
public class GenericDemo1 <k>
{
k d1;
	public static void main(String[] args) 
	{
		GenericDemo1 d1=new GenericDemo1();
		d1.funA(10);
		d1.funA(new Ramesh());
		d1.funA(null);
		d1.funA(true);
		d1.funA("RBG technologies");
		d1.funA(d1);
		d1.funA("Pradeep");
	}	
	
	void funA(k d1)
	{
		System.out.println(d1);
		
	}

}

