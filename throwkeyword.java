package Expectionhandling;
import java.io.IOException;  
class Testthrows1{  
	  void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }

public class throwkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Testthrows1 obj=new Testthrows1();  
		   obj.p();  
		   System.out.println("normal flow...");  
	}

}
