package gr.jchrist.ideaagents;

import mockit.Expectations;
import mockit.Mocked;
import org.junit.Assert;
import org.junit.Test;

public class SomeObjectTest {
    @Mocked
    SomeDependency someDependency;

    @Test
    public void someMethod() {
        SomeObject someObject = new SomeObject(someDependency);

        final String depResponse = "testResponse";
        new Expectations() {{
            someDependency.doSomething(); result = depResponse;
        }};

        Assert.assertEquals("unexpected response returned", depResponse, someObject.someMethod());
    }
}