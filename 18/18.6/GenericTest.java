import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public class GenericTest {
    private Map<String, Integer> score;
    public static void main(String[] args) throws Exception {
        Class<GenericTest> clazz = GenericTest.class;
        var field = clazz.getDeclaredField("score");
        Class<?> fieldType = field.getType();
        System.out.println("score的类型是：" + fieldType);
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            var pType = (ParameterizedType) genericType;
            var rType = pType.getRawType();
            System.out.println("原始类型是: " + rType);
            Type[] tArgs = pType.getActualTypeArguments();
            System.out.println("泛型信息是: ");
            for (int i = 0; i < tArgs.length; i++) {
                System.out.println("第" + i + "个泛型类型是: " + tArgs[i]);
            }
        } else {
            System.out.println("获取泛型类型出错！");
            
        }
    }
}
