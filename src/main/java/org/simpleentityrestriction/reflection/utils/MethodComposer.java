package org.simpleentityrestriction.reflection.utils;

import org.simpleentityrestriction.reflection.consts.Consts;

public class MethodComposer {

	public static String getGetMethodName(String fieldName) {
		StringBuffer tmpBuffer = new StringBuffer();
		if ( StringUtils.isNotBlank(fieldName) ) {
			tmpBuffer.append(Consts.GET_INITIAL)
			.append(fieldName.substring(0, 1).toUpperCase())
			.append(fieldName.substring(1));
		} 
		return tmpBuffer.toString();
	}
	
	public static String getSetMethodName(String fieldName) {
		StringBuffer tmpBuffer = new StringBuffer();
		if ( StringUtils.isNotBlank(fieldName) ) {
			tmpBuffer.append(Consts.SET_INITIAL)
			.append(fieldName.substring(0, 1).toUpperCase())
			.append(fieldName.substring(1));
		} 
		return tmpBuffer.toString();
	}
}
