package Expectionhandling;
class TestExceptionPropagation1{  
	  void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e)
	   {System.out.println("exception handled");}  
	  }  
public class propagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
		   obj.p();  
		   System.out.println("normal flow...");  
	}

}
