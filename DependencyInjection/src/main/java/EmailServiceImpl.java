import interfaces.MessageService;

public class EmailServiceImpl implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to: " + receiver + "\nMessage: " + message);
    }
}