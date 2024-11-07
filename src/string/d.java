package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class d {
	public static void main(String[] args) {
		Map<String,Integer> m1=new LinkedHashMap<>();
		m1.put("gowtham", 123);
		m1.put("vasanth", 193);
		m1.putAll(m1);
		
		System.out.println(m1.remove("gowtham", 123));
		System.out.println(m1.entrySet());
	}

}
