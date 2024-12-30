import java.lang.annotation.*;
import java.awt.event.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionListenerFor
{
    Class<? extends ActionListener> listener();
}
