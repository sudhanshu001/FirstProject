public class SortStringinLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line="My name is khan";
		String []s=line.split(" ");
		String temp;
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareToIgnoreCase(s[j])>0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}

		for(String t:s)
			System.out.print(t+" ");
		
	}

}
