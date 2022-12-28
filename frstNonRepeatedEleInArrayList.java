package colls;

import java.util.ArrayList;

public class frstNonRepeatedEleInArrayList 
{public void firstnonRepeated()
{
ArrayList<Integer> al=new ArrayList<>();
  {
    al.add(1);
    al.add(3);
    al.add(4);
    al.add(5);
    al.add(3);
    al.add(3);
System.out.println("Elements in an arraylist :"+ al);
abc: for(int i=0;i<al.size();i++)
{
  for(int j=i+1;j<al.size();j++)
    {
    if(al.get(i) == al.get(j))
      {
        System.out.println("First non repeated element in an arraylist is "+ al.get(i));
        break abc;
      }
   
   }
}

  }
}
public static void main(String args[])
{
frstNonRepeatedEleInArrayList a=new frstNonRepeatedEleInArrayList();
a.firstnonRepeated();
}
}
