
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,95,15,7,8,90,2,3,25,30,12,45,50,78};
		int n=a.length;
		int largest;
		int secondlargest;
		if(a[0]>a[1])
		{
			largest=a[0];
			secondlargest=a[1];
		}
		else
		{
			largest=a[1];
			secondlargest=a[0];
		}
			
for(int i=2;i<n;i++)
{
	if(a[i]>largest)
	{
		secondlargest=largest;
		largest=a[i];
	}
	else if(a[i]>secondlargest)
		secondlargest=a[i];
	
}

System.out.println("Second largest is:"+secondlargest);
	}

}
