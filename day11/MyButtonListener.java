import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener
{
  public void actionPerformed(ActionEvent e)
  {
    JButton aButton = (JButton) e.getSource();
    aButton.setText("Stop Clicking me");
  }
}
