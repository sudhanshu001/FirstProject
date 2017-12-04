import org.apache.commons.lang3.text.StrBuilder;

public class ReverseStringInLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String line="Today is Sunday 03 Septemper 2017";
		
		String r1=reverseUsingStrinBuilder(line);
		System.out.println(r1);
		
		String r2=reverseUsingStrinBuilder(line);
		System.out.println(r2);
		
		if(r1.equals(r2))
			System.out.println("Yes");
		
	}

	public static String reverseUsingStrinBuilder(String line)
	{
        String[] s=line.split(" ");
		
		int n=s.length;
		String r="";
		for(int i=0;i<n;i++)
			r=r+new StringBuilder(s[n-1-i]).reverse().toString()+" ";
		return r;
		
		
	}
	
	public static String reverseUsingCharArray(String line)
	{
		String r="";
		char []c=line.toCharArray();
		int n=c.length;
		for(int i=0;i<n;i++)
		 r=r+c[n-i-1];
		return r;
	}
}
