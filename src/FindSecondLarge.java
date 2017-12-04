
public class FindSecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={35,10,5,15,20,25,3,2,60};
		int large,secondlarge;
		if(a[0]>=a[1])
		{
			large=a[0];
			secondlarge=a[1];
		}
		else
		{
			large=a[1];
			secondlarge=a[0];
		}
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>large)
			{
				secondlarge=large;
				large=a[i];
			}
		}
		
		int thirdlarge =-5;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>thirdlarge && a[i]<secondlarge)
			{
				thirdlarge=a[i];
			}
		}
		
		
		System.out.println("second large is "+secondlarge);
		System.out.println("third large is "+thirdlarge);
	}

}
