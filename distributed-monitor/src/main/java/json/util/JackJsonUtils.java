package json.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JackJsonUtils {

	static ObjectMapper objectMapper;
	
//	����json
	public static <T> T fromJson(String content,Class<T> valueType){
		
		if(objectMapper==null){
			objectMapper = new ObjectMapper();
		}
		
		try{
			return objectMapper.readValue(content, valueType);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
//	����json
	public static String toJson(Object object){
		if(objectMapper==null){
			objectMapper = new ObjectMapper();
		}
		
		try{
			return objectMapper.writeValueAsString(object);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}