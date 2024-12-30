import java.awt.event.*;
import javax.swing.*;
import java.lang.reflect.*;
public class ActionListenerInstaller
{
    public static void processAnnotations(Object obj)
    {
        try
        {
            Class cl = obj.getClass();
            for(Field f : cl.getDeclaredFields())
            {
                f.setAccessible(true);
                ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
                Object fObj = f.get(obj);
                if(a != null && fObj != null && fObj instanceof AbstractButton)
                {
                    Class<? extends ActionListener> listenerClazz = a.listener();
                    ActionListener a1 = listenerClazz.getDeclaredConstructor().newInstance();
                    var ab = (AbstractButton) fObj;
                    ab.addActionListener(a1);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
