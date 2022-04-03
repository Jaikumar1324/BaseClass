package org.hexa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassEmp {
	public static void main(String[] args) {
		Map<Integer,String>m =new HashMap();
	    m.put(10, "10");
	    m.put(20, "20");
	    m.put(30, "30");
	    m.put(50, "50");
	    m.put(60, "60");
	    m.put(10, "10");
	    m.put(50, "50");
	    m.put(40, "40");
	    System.out.println(m);
	    int i = m.size();
	    System.out.println(i);
	    boolean b = m.containsKey(70);
	    System.out.println(b);
		Set<Integer> y = m.keySet();
		System.out.println(y);
		for (Integer e : y) {
			System.out.println(e);
		}
			
		}
	
	
	    
	    
	}


