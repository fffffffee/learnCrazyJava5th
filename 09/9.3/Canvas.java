import java.util.List;
import java.util.ArrayList;
public class Canvas
{
    public void drawAll(List<? extends Shape> shapes)
    {
        for(var s : shapes)
        {
            s.draw(this);
        }
    }
    public static void main(String[] args)
    {
        List<Circle> circleList = new ArrayList<>();        
        var c = new Canvas();
        c.drawAll(circleList);
    }
}
