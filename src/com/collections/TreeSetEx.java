package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String args[])
	{
		MyComparator wm=new MyComparator();
		TreeSet<Integer> tr=new TreeSet<Integer>(wm);
		tr.add(23);
		tr.add(3);
		tr.add(5);
		tr.add(7);
		tr.add(43);
		tr.add(98);
		System.out.println(tr);
	}
}



 class MyComparator implements Comparator
{

	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
			return 0;
	}
	
}


