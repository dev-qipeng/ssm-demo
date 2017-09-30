package sqar.utils;

import java.util.UUID;

public class IDGenerator {

	public static String getUuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(IDGenerator.getUuid());
	}

}
