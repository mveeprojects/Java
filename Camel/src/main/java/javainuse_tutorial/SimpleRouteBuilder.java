package javainuse_tutorial;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    public void configure() throws Exception {
//        noop=true tells camel to just copy the information from source rather than deleting it from the source
        from("file://src/main/java/javainuse_tutorial/test_inputs?noop=true").to("file://src/main/java/javainuse_tutorial/test_outputs");
    }
}