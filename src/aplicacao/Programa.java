package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone","99711122");
		
		cookies.remove("email");
		
		System.out.println("TODOS COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
