import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
		HashMap<Integer,String> HM = new HashMap<Integer,String>();
		
		HM.put(1, "theja");
		HM.put(2, "theja");
		HM.put(3, "theja");
		
	   for(Map.Entry m:HM.entrySet())
	   {
		   System.out.print(m.getkey(),m.getValue());
	   }
		
	}

}
