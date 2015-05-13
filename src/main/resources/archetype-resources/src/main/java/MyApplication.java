package ${groupId};

import ${groupId}.common.servlet.GuiceResourceConfig;
import ${groupId}.guice.MyModule;
import org.glassfish.hk2.api.ServiceLocator;

import javax.inject.Inject;

public class MyApplication extends GuiceResourceConfig {

    @Inject
    MyApplication(ServiceLocator serviceLocator) {
        super(serviceLocator, new MyModule(), "${groupId}");
    }
}
