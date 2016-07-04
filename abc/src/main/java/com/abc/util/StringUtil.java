package com.abc.util;

public class StringUtil {
	
	public static boolean isEmpty(String str){
		if(str==null || str.length()==0){
			return true;
		}
		
		return false;
	}
	
	public static boolean isTrimEmpty(String str){
		if(str==null || str.trim().length()==0){
			return true;
		}
		
		return false;
	}

}
