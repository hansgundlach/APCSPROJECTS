package testers;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {
	private int a;
	private int b;
	
	public static void nullchecker(int glob){
	
	}

	public test(int a ,int b){
		this.a = a;
		this.b= b;
	}
	public String toString(){
	 return "yhis is "+a+"dog"+b;
	}
	
	public static void main(String args[]){
		test test1 = new test(3,4);
	    System.out.println(test1.toString());
	     
	    
	    int as = 3;
	    as = 2;
	    int[] hello = new int[3];
	    hello[0] = 2;
	    hello[1] = 2;
	    hello[2] = 2;
	    System.out.println("this number is the length"+hello.length); 
	 Object yoyo = null;
	 if(test1.equals(null)){
		 
		 //Always check code afterward with what they write 
		 //always check for bounds errors
		 
		 //I guess using null works for some non static methods 
		 System.out.println("I guess this does work");
	 }
	    String teststing = "hello";
	    teststing  = "help";
	    		if(as == 2){
	    			System.out.println("Yes");
	    			System.out.println(teststing.length());
	    		}
	
	ArrayList<Integer> listtest = new ArrayList<Integer>();
	listtest.add(1);
	listtest.add(2);
	
	//Object ob = listtest.add(1,7);
	Integer[] call = new Integer[]{1,2,3};
	
	Integer a = new Integer(1);
	Integer b = new Integer(1);
	a=b;
	//checks for reference equality as expected
	if(a==1){
		//auto-boxing works
		System.out.println(b.toString()+"Hans");
	}
	
	for(int i = 0;i<call.length;i++){
		if(call[i]==2){
			//System.out.println(call[i]);
			System.out.println(listtest.toString());
		}
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int first = 0;
	int second = 0;
	
	public test(int a ,int b){
		first = a;
		second = b;
	}
	public void increment(int c){
		c++;
	}
	
	public static void ADDint(int n){
	while(n<8){
		n++;
	}
	System.out.println(n);
	}
	public static void main(String args[]){
		int j = 1;
		int k = 2;
		String s1 = "hello";
		String s2 = "pigglet";
		s1 = s2;
		test hello = new test(2,3);
		test hello2 = new test(2,3);
		
		 String bog = "hog";
		 String hog = "hog";
		 //wonder about creation of objetcs in methods
		 Integer a = new Integer(1);
		 Integer b = new Integer(2);
		
		 System.out.println(a + " " + b);
		 
		 System.out.println(a + " " + b); 
		 String[] jar = new String[3];
		jar[0] = "hello";
		jar[1] = "you have new jar";
		for(int i = 0;i<jar.length;i++){
		 System.out.println(jar[i].toString());
		}
		 System.out.println(new Integer(5));
		 ADDint(2);
		 
		
		 
		
		if(bog == hog ){
			
			System.out.println("ehllo");
			System.out.println(3);
			System.out.println(hog.substring(3));
			System.out.println("1" + new Integer(2) + 3);
			System.out.println(s1);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		else if (5==5){
			String m = "hello chap";
			System.out.println(m.indexOf("c"));
			System.out.println(3);
		
	}

}*/
}