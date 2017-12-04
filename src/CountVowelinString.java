import java.util.HashMap;

public class CountVowelinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Aaeiioauo uuuu";
int count[]=new int[5];
for(int i=0;i<5;i++)
	count[i]=0;
HashMap<Character,Integer> hm=new HashMap<Character,Integer>();


for(char c:s.toCharArray())
{
	switch(c)
	{
	case 'a':
	case'A': hm.put('a', ++count[0]);
	break;
	case 'e':
	case'E': hm.put('e', ++count[1]);
	break;
	case 'i':
	case'I': hm.put('i', ++count[2]);
	break;
	case 'o':
	case'O': hm.put('o', ++count[3]);
	break;
	case 'u':
	case 'U':hm.put('u', ++count[4]);
	
	}
}
	
	System.out.println(hm);
	}

}
