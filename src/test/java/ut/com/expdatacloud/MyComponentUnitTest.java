package ut.com.expdatacloud;

import org.junit.Test;
import com.expdatacloud.api.MyPluginComponent;
import com.expdatacloud.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}