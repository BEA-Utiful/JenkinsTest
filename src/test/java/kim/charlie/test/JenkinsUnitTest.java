package kim.charlie.test;

import junit.framework.Assert;
import kim.charlie.JenkinsTest;
import org.junit.Test;

public class JenkinsUnitTest {
    @Test
    public void testJenkinsTest() {
        JenkinsTest test = new JenkinsTest();
        test.addString("Charlie");

        Assert.assertEquals(test.getFirst(), "Charlie");
    }
}
