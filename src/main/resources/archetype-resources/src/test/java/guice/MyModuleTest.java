package ${groupId}.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MyModuleTest {

    @Test
    public void testConfigureCanBuildWithoutDependencies() throws Exception {
        Injector injector = Guice.createInjector(new MyModule());
        assertNotNull(injector);
    }
}
