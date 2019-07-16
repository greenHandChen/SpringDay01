package hello;

public class MessagePrinter {
    private MessagService messagService;
    public void setMessagService(MessagService messagService) {
        this.messagService = messagService;
    }

    public MessagService getMessagService() {
        return messagService;
    }

    public void printMessage()
    {
        System.out.println(this.getMessagService().getMessage());
    }
}