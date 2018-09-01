/**
 * 
 */
package org.simpleentityrestriction.reflection.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
/**
 * @author bbb
 *
 */
public @interface RestrictionShowField {

	public String targetEnvironments() default "";
}

