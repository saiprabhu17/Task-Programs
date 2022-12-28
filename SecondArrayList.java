package CollectionF;

import java.util.ArrayList;

public class SecondArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
        System.out.println("Elements first in rraylist" +al);
        System.out.println("Size of ArraList at first"+ (al.size()));
        al.remove(3);
        System.out.println("After  Removed Elemet in index 3 : " + al);
        System.out.println("Size after removed index Three : " +al.size());
        al.add(0,5);
        System.out.println("Elemets after added element 5 in index 0:" +al);
        al.remove(2);
        System.out.println("Removed index 2 : "+al);
        al.clear();
        System.out.println(al);
        System.out.println("After cleared array list : "+ al.size());
        

	}

}
