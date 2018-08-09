import interfaces.Consumer;
import interfaces.MessageServiceInjector;

public class Application {

    public static void main(String[] args) {
        String msg = "Hi";
        String email = "bob@abc.com";
        String phone = "12345678910";

        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}