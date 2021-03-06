/**
 * 
 */
package org.simpleentityrestriction.reflection.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
/**
 * @author bbb
 *
 */
public @interface RestrictionHideAll {
	public String targetEnvironments() default "";
}

