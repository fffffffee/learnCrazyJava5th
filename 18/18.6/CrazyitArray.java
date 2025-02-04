public class CrazyitArray {
    @SuppressWarnings("unchecked")
    public static <T> T[] newInstance(Class<T> componentType, int length) 
    {
        return (T[]) java.lang.reflect.Array.newInstance(componentType, length);
    }

    public static void main(String[] args) {
        String[] arr = CrazyitArray.newInstance(String.class, 10);
        int[][] intArr = CrazyitArray.newInstance(int[].class, 5);
        arr[5] = "Java";
        arr[6] = "Crazy Java";
        intArr[1] = new int[]{1, 2};
        System.out.println(arr[5]);
        System.out.println(intArr[1][1]);
    }
}
