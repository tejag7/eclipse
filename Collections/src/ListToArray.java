import java.util.*;

public class ListToArray {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("theja");
		list.add("dinesh");
		list.add("raj");
		list.add("sai");
		
		Object[] l = list.toArray();
		
		 Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		
		

	}

}
