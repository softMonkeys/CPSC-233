import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class MyWindowListener extends WindowAdapter
{
  public void windowClosing(WindowEvent e)
  {
    JFrame aFrame = (JFrame) e.getWindow();
    aFrame.setTitle("Closing Window ...");
    try
    {
      Thread.sleep(30);
    }
    catch(InterruptedException ex)
    {
      System.out.println("Pausing Interrupted");
    }
    aFrame.setVisible(false);
    aFrame.dispose();
  }
}
