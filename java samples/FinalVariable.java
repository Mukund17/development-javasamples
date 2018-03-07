class FinalVariable {  
	final int limit=90;  
	void run(){  
		limit=400;  
	}  
 public static void main(String args[]){  
	 FinalVariable speedlimit=new FinalVariable();  
	 speedlimit.run();  
 }  
}
