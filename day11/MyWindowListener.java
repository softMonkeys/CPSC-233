import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;

public class MyWindowListener extends WindowAdapter
{
  public static final int DELAY = 30;
  public void windowClosing(WindowEvent e)
  {
    JFrame aFrame = (JFrame) e.getWindow();
    aFrame.setTitle("Closing Window...");
    try
    {
      Thread.sleep(DELAY);
    }
    catch (InterruptedException ex)
    {
      System.out.println("Closing Interrption");
    }
    aFrame.setVisible(true);

  }
}
