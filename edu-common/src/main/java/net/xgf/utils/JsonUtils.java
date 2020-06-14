package net.xgf.utils;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
	    // 定义jackson对象
	    private static final ObjectMapper MAPPER = new ObjectMapper();
	 
	    /**
	     * 将对象转换成json字符串。
	     */
	    public static String objectToJson(Object data) {
	        try {
	            String string = MAPPER.writeValueAsString(data);
	            return string;
	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	 /**
	     * 将json结果集转化为对象
	     */
	    public static <T> T jsonToPoJo(String jsonData, Class<T> beanType) {
	        try {
	            T t = MAPPER.readValue(jsonData, beanType);
	            return t;
	        } catch (Exception e) {
	             e.printStackTrace();
	        }
	        return null;
	    }
	    /**
	     * 将json数据转换成pojo对象list
	     */
	    public  static <T> T jsonToList(String jsonData,TypeReference<T> typeReference) {
	        try {
	            return MAPPER.readValue(jsonData, typeReference);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	    
	    /**
	     * 将json数据转换成pojo对象list
	     * <p>Title: jsonToList</p>
	     * <p>Description: </p>
	     * @param jsonData
	     * @param beanType
	     * @return
	     */
	    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {
	        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
	        try {
	            List<T> list = MAPPER.readValue(jsonData, javaType);
	            return list;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	         
	        return null;
	    }
	    

	
}