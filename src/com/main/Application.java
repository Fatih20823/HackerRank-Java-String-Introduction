package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        String dize_a = A.substring(0,1).toUpperCase()+A.substring(1);
        String dize_b = B.substring(0,1).toUpperCase()+B.substring(1);
        ArrayList<String> dizeSiralama = new ArrayList<>();
        dizeSiralama.add(dize_a);
        dizeSiralama.add(dize_b);       
        Collections.sort(dizeSiralama);
        
        System.out.println(dize_a.length()+dize_b.length());
        
        if (dizeSiralama.get(0).equals(dize_a)){
            System.out.println("No");
        }else{System.out.println("Yes");}
        
        System.out.println(dize_a+" "+dize_b);
        
        
        
	}

}
