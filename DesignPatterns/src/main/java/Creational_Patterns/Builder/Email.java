package Creational_Patterns.Builder;

// https://dzone.com/articles/creational-design-patterns-builder-pattern

class Email {

    private String subject;
    private String recipient;
    private String message;

    private Email(String subject, String recipient, String message) {
        this.subject = subject;
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String toString() {
        return "\nsubject:\t" + subject + "\n" +
                "recipient:\t" + recipient + "\n" +
                "message:\n\n" + message;
    }

    static class EmailBuilder {

        private String subjectLine = "";
        private String greeting = "";
        private String messageBody = "";
        private String signature = "";
        private String recipient = "";

        EmailBuilder withSubjectLine(String subjectLine) {
            this.subjectLine = subjectLine;
            return this;
        }

        EmailBuilder withRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        EmailBuilder withMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        EmailBuilder withSignature(String signature) {
            this.signature = signature;
            return this;
        }

        EmailBuilder withGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        Email build() {
            String message = greeting + "\n" + messageBody + "\n\n" + signature;
            return new Email(subjectLine, recipient, message);
        }
    }
}