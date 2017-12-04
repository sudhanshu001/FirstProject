
public class InsertElementInMiddleOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]=new int[5];
		int[] a={5,6,3,2,7,4,0};
		System.out.println("length is "+a.length);
		int pos=2;
		int key=10;
		
		
		for(int i=a.length-1;i>=pos;i--)
		{
			
			
			
			a[i]=a[i-1];
			
			//System.out.println(a[i]);
					
		}
		a[pos]=key;
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}
