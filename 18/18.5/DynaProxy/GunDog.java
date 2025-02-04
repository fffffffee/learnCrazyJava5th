public class GunDog implements Dog {
    @Override
    public void info() {
        System.out.println("I am a gundog.");
    }
    @Override
    public void run() {
        System.out.println("I run very fast.");
    }
}