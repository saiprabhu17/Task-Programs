package CollectionF;

public class RemoveAllSpacesInGivenString
{
public static void main(String[] args)
{	
String s="I am Learning Java";
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
 {
	if(c[i]!=' ')
	{
		System.out.print(c[i]);
    }
 }
}
}
