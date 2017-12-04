
public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int x=5/0;
		}
		
		catch(Exception e)
		{
		e.printStackTrace();
		System.exit(0);
		}
		
		finally
		{
			
			System.out.println("Always executed");
			
		}
	}

}
