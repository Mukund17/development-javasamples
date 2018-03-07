import java.util.*;  
public class TreeMapSample{  
   public static void main(String args[]) {  
	   Map<Integer, String> map = new TreeMap<Integer, String>();           
	   map.put(102,"Ram");  
	   map.put(103,"keerthi");  
	   map.put(101,"Ganesh");  
	   System.out.println("Before:"+ map);    
	   map.remove(101);  
	   System.out.println("After"+ map);  
   }      
}  