import interfaces.Consumer;
import interfaces.MessageService;

class MyApplication implements Consumer {

    private MessageService service;

    public MyApplication(MessageService service){
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}