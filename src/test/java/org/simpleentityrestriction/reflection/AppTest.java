package org.simpleentityrestriction.reflection;

import java.util.ArrayList;
import java.util.List;

import org.simpleentityrestriction.reflection.entity.TestEntity;
import org.simpleentityrestriction.reflection.service.TransferService;
import org.simpleentityrestriction.reflection.service.impl.TransferServiceImpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	List<String> l = new ArrayList<String>();
    	l.add("BBBB");
    	l.add("CCCC");
        TestEntity entity = new TestEntity(1, "AAAA", 45, l);
        System.out.println(entity.toString());
        
        TransferService t = new TransferServiceImpl();
        
        entity = (TestEntity) t.transfer(entity);
        
        System.out.println(entity.toString());
    }
}
