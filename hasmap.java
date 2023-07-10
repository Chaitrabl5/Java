package P1;
import java.util.HashMap;
import java.util.TreeMap;
public class hasmap {	
	public static void main(String args[])
	{
		//TreeMap 1) sorted order
		//2) key should to be homo
		//3) duplicate are allowed
		
//		TreeMap tm =new TreeMap();
//		tm.put(1, "india");
//		tm.put(3, "aus");
//		tm.put(2,"uk");
//		tm.put(4,"uk");
//		tm.put(4,"usa");
//		System.out.println(tm);
//		
		
		
		
		
// map will store key , value pairs
		// 1) hashmap 2) treemap
		
		// 1) hashmap
		// 1) very fast accessible compare to treemap
		 //2) allow duplicate values
	// no order of insertion
		//4) homo and hetero values are allowed
		HashMap hm=new HashMap();
		hm.put("040", "chennai");
		hm.put("080","bengalore");
		hm.put("044","hyd");
		hm.put("090",8989);
		hm.put("050",8989);
		System.out.println(hm);
		
	}
}
