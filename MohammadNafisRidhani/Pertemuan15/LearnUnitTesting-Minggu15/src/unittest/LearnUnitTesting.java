package unittest;

public class LearnUnitTesting {
    public static void main(String[] args) {
        MessageProcessor mProcessor = new MessageProcessor();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("Whats up bro?");
        mProcessor.showMessage();
    }
}
