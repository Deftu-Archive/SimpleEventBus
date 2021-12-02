import xyz.deftu.eventbus.SimpleEventBus;
import xyz.deftu.eventbus.SubscriberDepth;

public class Test {

    private static final Test INSTANCE = new Test();

    public void start() {
        SimpleEventBus.getGlobalBus().register(TestEvent.class, this::onConsumerTest);
        SimpleEventBus.getGlobalBus().register(TestListener.INSTANCE, SubscriberDepth.DEEP_SUPER);

        SimpleEventBus.getGlobalBus().post(new TestEvent());
    }

    private void onConsumerTest(TestEvent event) {
        System.out.println("Consumer test completed!");
    }

    public static void main(String[] args) {
        INSTANCE.start();
    }

}