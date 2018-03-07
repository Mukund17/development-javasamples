class Bike{  
  final void run(){
	System.out.println("runs");
	}  
}  
     
class FinalMethod extends Bike{  
   void run(){
		System.out.println("runs at 100kmph");
   }  
   public static void main(String args[]){  
   FinalMethod yamaha= new FinalMethod();  
   yamaha.run();  
   }  
}  
