package ${groupId};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("api")
public class HelloServer {
    private static final Logger logger = LoggerFactory.getLogger(HelloServer.class);

    @Inject
    HelloServer() {
    }

    @GET
    @Path("hello")
    public String sayHello() {
        return "Hello World";
    }
}
