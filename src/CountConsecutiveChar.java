
public class CountConsecutiveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aakashhh"+"#";
		char []c=s.toCharArray();
		int count;
		String res="";
		for(int i=0;i<c.length-1;)
		{
			count=1;
			
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					continue;
					
				}
				res=res+c[i]+count;
				break;
			}
			
			i=i+count;
		
			
		}
		System.out.println(res);

	}

}
