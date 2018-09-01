package org.simpleentityrestriction.reflection.utils;

public class StringUtils {

	public static boolean isBlank(String str) {
		return ( null == str )
				|| ( "".equals(str.replaceAll("[\\t ]", "")) ); 
	}
	
	public static boolean isNotBlank ( String str ) {
		return !isBlank(str);
	}
}

