
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fib fib = new Fib();
		fib.rechne(6);

	}
	
	private int rechne(int zahl)
	{
		if(zahl == 0 || zahl == 1)
		{
			zahl = 1;
		}
		else
		{
			zahl = rechne((zahl-2) + rechne(zahl-1));
		}
		return zahl;
		
	}

}
