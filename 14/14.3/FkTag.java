import java.lang.annotation.*;
@Repeatable(FkTags.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FkTag
{
    String name() default "疯狂软件";
    int age();
}
