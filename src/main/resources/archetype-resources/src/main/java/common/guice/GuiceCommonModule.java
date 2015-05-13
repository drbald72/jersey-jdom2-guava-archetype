package ${groupId}.common.guice;

import com.google.inject.AbstractModule;
import ${groupId}.common.jdom.DocumentBuilder;

public class GuiceCommonModule extends AbstractModule {
    protected void configure() {
        bind(DocumentBuilder.class);
    }
}
