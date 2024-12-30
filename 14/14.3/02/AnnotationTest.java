import java.awt.event.*;
import javax.swing.*;
public class AnnotationTest
{
    private JFrame mainWin = new JFrame("使用注解绑定事件监听器");
    @ActionListenerFor(listener = OkListener.class)
    private JButton ok = new JButton("确定");
    @ActionListenerFor(listener = CancelListener.class)
    private JButton cancel = new JButton("取消");
    public void init()
    {
        var jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);
        ActionListenerInstaller.processAnnotations(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }
    public static void main(String[] args)
    {
        new AnnotationTest().init();
    }
}
class OkListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(null, "单击了确认按钮");
    }
}
class CancelListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(null, "单击了取消按钮");
    }
}
