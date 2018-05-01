package javainuse_tutorial;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class Application {

    public static void main(String[] args) {
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        try {
            ctx.addRoutes(routeBuilder);
            ctx.start();
            Thread.sleep(1000);
            ctx.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}