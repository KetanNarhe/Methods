package com.methods;

public class MethodChaningMangoDriver {

	public static void main(String[] args) {

		MethodChaningMangoExamp m1=new MethodChaningMangoExamp();
		
		m1.name="Hapus";
		m1.price=1200;
		m1.origin="Ratnagiri";
		
		m1.name().price().origin();
		
		
       MethodChaningMangoExamp m2=new MethodChaningMangoExamp();
		
       
		m2.name="Hapus Kesari";
		m2.price=1500;
		m2.origin="Kokan";
		
		m2.name().price().origin();
	}

}
