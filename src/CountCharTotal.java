
public class CountCharTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sudhanshu";
		char []c=s.toCharArray();
		int count;
		String res="";
		for(int i=0;i<c.length-1;i++)
		{
			count=1;
			if(c[i]=='#')
				continue;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					c[j]='#';
					
				}
			}
			
			res=res+c[i]+count;
			
		}
		
		System.out.println(res);

	}

}
