public class InnerClassesType2 {
	
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  


	public static void main(String[] args) {
		
		InnerClassesType2  ob=new InnerClassesType2 ();  
		ob.display();  

	}

}