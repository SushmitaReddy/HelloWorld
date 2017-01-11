package com.hello;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Hello {
	
	public static void main(String args[]){
		String name= "Raghu Kotla";
		String rev = "";
		int len = name.length();
		System.out.println("length =" +len);
		if(len==1){
			rev = name;

		}else{
			for(int i=len-1;i>=0;i--){
				System.out.println("for loop =" +len);
				 rev = rev+name.charAt(i);
			}
		}
		System.out.println("reverse String is = "+rev);
		
		ArrayList mp= new ArrayList();
		
		mp.add("1");
		mp.add("11");
		mp.add("111");
		
		Iterator itr = mp.iterator();
		while(itr.hasNext()){
			List etr = (List) itr.next();
			//System.out.println(" key"+etr.getItem(arg0)+":"+etr.get);
		}
		}
	
	


}
