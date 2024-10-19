public class RandomTest
{
    public static void main(String[] args)
    {
        var rand = new Random();
        System.out.println("rand.nextBoolean():" + rand.nextBoolean());
        var buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        System.out.println("rand.nextDouble():" + rand.nextDouble());
        System.out.println("rand.nextFloat():" + rand.nextFloat());
        System.out.println("rand.nextGaussian():" + rand.nextGaussian());
        System.out.println("rand.nextInt():" + rand.nextInt());
    }
}
