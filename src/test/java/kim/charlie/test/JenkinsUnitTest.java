package kim.charlie.test;

import junit.framework.Assert;
import kim.charlie.JenkinsTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JenkinsUnitTest {
    private JenkinsTest mTest = null;

    @Before
    public void setUp() {
        mTest = new JenkinsTest();
        mTest.addString("Charlie");
    }

    @Test
    public void testJenkinsTest() {
        Assert.assertEquals(mTest.getFirst(), "Charlie");
    }

    @Test
    public void testJenkinsTestSize() {
        Assert.assertTrue(mTest.size() > 0);
    }

    @After
    public void tearDown() {
        mTest.clear();
    }
}