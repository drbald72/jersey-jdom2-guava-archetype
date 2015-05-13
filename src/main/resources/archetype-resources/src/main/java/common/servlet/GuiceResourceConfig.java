package ${groupId}.common.servlet;

import com.google.inject.Guice;
import com.google.inject.Module;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

public class GuiceResourceConfig extends ResourceConfig {
    protected GuiceResourceConfig(ServiceLocator serviceLocator, Module guiceModule, String scannedPackage) {
        packages(scannedPackage);

        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);

        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(Guice.createInjector(guiceModule));
    }
}

