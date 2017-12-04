
public class SubstringCount {
	public static void main(String args[])
	{
		String str="aaaa";
		String Substr = "aaa";
		int count=0;
		int id=0;
		
			while((id=str.indexOf(Substr, id))!=-1)
			{
				count++;
				id++;
				System.out.println(id);
			}

		
		System.out.println(count);
	}

}
