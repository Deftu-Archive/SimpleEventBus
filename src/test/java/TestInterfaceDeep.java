import xyz.deftu.eventbus.SubscribeEvent;

public interface TestInterfaceDeep {
    @SubscribeEvent
    default void onDeepTest(TestEvent event) {
        System.out.println("Deep test worked!");
    }
}