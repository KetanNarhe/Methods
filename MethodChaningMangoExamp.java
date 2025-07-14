package com.methods;

public class MethodChaningMangoExamp
{

    String name;
    double price;
    String origin;
    
    
    
    public MethodChaningMangoExamp name()
    {
    	System.out.println(name);
		return this;
    }
    
    public MethodChaningMangoExamp price()
    {
    	System.out.println(price);
    	
    	return this;
    }
    
    public MethodChaningMangoExamp origin()
    {
    	System.out.println(origin);
    	System.out.println("----------------------------");
		
    	
    	return this;
    }
    
} 
