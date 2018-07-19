package firstproject;

public class Emp1 {


}

class HR extends Emp1{
	
}
 class Recruiter extends HR{
	 
 }
 
 class Financier extends HR{
	 
 }
 
 class Technical extends Emp1{
	 
 }
 
 class Javapm extends Technical{
	 
 }
 
 class Mainframepm extends Technical{
	 
 }
 
 class Typecasting{
 public static void main(String[] args)
 {    
	 Technical t= new Javapm();
	 HR h=new Recruiter();
	 Emp1 e =new HR();
	 Emp1 e1=new Mainframepm();
//	    downcasting
	 
	 Technical t1=new Javapm();
	 if(t1 instanceof Javapm ) {
		 Javapm jp=(Javapm)t1;
	 }
	 
	 
	 
	 
	 
 }
 
 }
