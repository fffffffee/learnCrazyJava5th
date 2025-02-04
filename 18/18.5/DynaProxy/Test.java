public class Test {
    public static void main(String[] args) throws Exception {
        Dog target = new GunDog();
        //MyInvokationHandler handler = new MyInvokationHandler();
        //handler.setTarget(target);
        Dog dog = (Dog) MyProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}
