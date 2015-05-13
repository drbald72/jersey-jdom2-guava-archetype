package ${groupId}.guice;

import com.google.inject.AbstractModule;
import ${groupId}.HelloServer;
import ${groupId}.common.guice.GuiceCommonModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyModule extends AbstractModule {
    private static final Logger logger = LoggerFactory.getLogger(MyModule.class);

    @Override
    protected void configure() {
        logger.info("Configuring guice injector for application.");
        install(new GuiceCommonModule());

        bind(HelloServer.class);
    }
}
