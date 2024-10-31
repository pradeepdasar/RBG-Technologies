
public class GenericDemo2 <f>
{

	public static void main(String[] args)
	{
		GenericDemo2 <String>t1=new GenericDemo2 <String>();
		t1.funB("RBG");
	//	t1.funB(10);
		
//		GenericDemo2 <int>t2=new GenericDemo2 <int>();
		
		GenericDemo2 <Integer>t2=new GenericDemo2 <Integer>();
		t2.funB(10);
		t2.funB(50);
 //       t2.funB(true);
        
//		GenericDemo2 <boolean>t3=new GenericDemo2 <boolean>();
		GenericDemo2 <Boolean>t3=new GenericDemo2 <Boolean>();
		t3.funB(true);
t3.funB(false);
//t3.funB(10);
//t3.funB(50);		
		
	
		
		
		
	}
	void funB(f t1)
	{
		System.out.println(t1);
	}

}
