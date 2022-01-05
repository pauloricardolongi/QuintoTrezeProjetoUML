package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone","99711122");
		cookies.put("rg","1010911018");
		
		cookies.remove("email");
		cookies.put("phone","99771133");
		
		System.out.println("Contem 'phone' key: " + cookies.containsKey("CPF"));
		System.out.println("phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("TODOS COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + "= " + cookies.get(key));
		}

	}

}
