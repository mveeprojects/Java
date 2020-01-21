package Creational_Patterns.Builder;

public class Application {

    public static void main(String[] args) {

        String DEFAULT_SUBJECT = "Some subject line";
        String DEFAULT_RECIPIENT = "dave@hotmail.com";
        String DEFAULT_GREETING = "Hi Dave";
        String DEFAULT_MESSAGE_BODY = "\nYes, I would be thrilled to see you holiday pictures.";
        String DEFAULT_SIGNATURE = "\nYours Sincerely,\nMark";

        // ordinary method to create an instance of a class (via constructor)
//        Email email = new Email("Some eubject line", "dave@hotmail.com", DEFAULT_GREETING + DEFAULT_MESSAGE_BODY + DEFAULT_SIGNATURE);

        // using builder pattern
        Email email = new Email.EmailBuilder()
                .withSubjectLine(DEFAULT_SUBJECT)
                .withRecipient(DEFAULT_RECIPIENT)
                .withGreeting(DEFAULT_GREETING)
                .withMessageBody(DEFAULT_MESSAGE_BODY)
                .withSignature(DEFAULT_SIGNATURE)
                .build();

        System.out.println(email.toString());
    }
}