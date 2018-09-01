/**
 * 
 */
package org.simpleentityrestriction.reflection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.simpleentityrestriction.reflection.utils.MethodComposer;
import org.simpleentityrestriction.reflection.utils.StringUtils;

/**
 * @author bbb
 *
 */

public class TestMethodComposer {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String fieldName = "id";
		System.out.println(StringUtils.isNotBlank(fieldName));
		System.out.println(MethodComposer.getGetMethodName(fieldName));
		System.out.println(MethodComposer.getSetMethodName(fieldName));
	}

}
