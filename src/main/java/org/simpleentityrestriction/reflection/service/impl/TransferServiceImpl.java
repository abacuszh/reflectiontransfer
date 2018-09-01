package org.simpleentityrestriction.reflection.service.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.simpleentityrestriction.reflection.annotation.RestrictionHideAll;
import org.simpleentityrestriction.reflection.annotation.RestrictionHideField;
import org.simpleentityrestriction.reflection.annotation.RestrictionShowField;
import org.simpleentityrestriction.reflection.service.TransferService;
import org.simpleentityrestriction.reflection.utils.MethodComposer;

public class TransferServiceImpl implements TransferService{

	public Object transfer(Object obj) {
		
		Class clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		
		Object newObj = null;
		try {
			newObj = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		// default value is to show all fields
		boolean showAll = true ;
		Annotation[] classAnnotation = obj.getClass().getDeclaredAnnotations();
		for ( int i=0, iLength=classAnnotation.length; i<iLength; i++ ) {
			if ( classAnnotation[i] instanceof RestrictionHideAll) {
				showAll = false;
				break;
			}
		}
		
		boolean showField = true;
		Annotation fieldAnnotation = null;
		Method setMethod = null;
		Method getMethod = null;
		for ( int i=0, iLength=fields.length; i<iLength; i++ ) {
			String fieldName = fields[i].getName();
			if ( showAll ) {
				fieldAnnotation = fields[i].getAnnotation(RestrictionHideField.class);
				if ( fieldAnnotation != null ) {
					showField = false;
				}
			} else {
				fieldAnnotation = fields[i].getAnnotation(RestrictionShowField.class);
				if ( fieldAnnotation != null ) {
					showField = true;
				}
			}
			if ( showField ) {
				try {
					System.out.println(MethodComposer.getSetMethodName(fieldName)
							+ " "
							+ MethodComposer.getGetMethodName(fieldName));
					getMethod = clazz.getMethod(MethodComposer.getGetMethodName(fieldName)
							, null);
					setMethod = clazz.getMethod(MethodComposer.getSetMethodName(fieldName)
							, getMethod.getReturnType());
					setMethod.invoke(newObj, getMethod.invoke(obj, null));
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			showField = false;
			setMethod = null;
			getMethod = null;
			fieldAnnotation = null;
		}
		
		return newObj;
	}

}

