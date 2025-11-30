package org.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Problem {
	
	public static void main (String[] args) {
     
    String a = "testing";
    String b = "Selenium";
    
    a = a+b;
    b = a.substring(0, a.length()-b.length());
    a = a.substring(b.length());
    
    System.out.println("afterswapping a:="+a);
    System.out.println("afteswapping b:="+b);
    
    System.out.println("arvind completed");
    
		
	}
	

}
