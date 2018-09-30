import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame
{
  private JButton left;
  private JButton right;
  private JLabel aLabel;
  private JLabel bLabel;
  private GridBagLayout aLayout;
  private GridBagConstraints aConstraint;

  public MyFrame()
  {
    MyWindowListener aWindowListener = new WindowListener();
    addWindowListener(aWindowListener);
    aConstraint = new GridBagConstraints();
    Scanner in = new Scanner(System.in);
    int padding = in.nextInt();

    left = new JButton("L: Press me");
    right = new JButton("R: Press me");

    MyButtonListener aButtonListener = new MyButtonListener();
    left.addActionListener(aButtonListener);
    right.addActionListener(aButtonListener);

    aLabel = new JLabel("Simple Label");
    bLabel = new JLabel("Label B");

    aConstraint.insets = new Insets(padding, padding, padding, padding);
    aLayout = new GridBagLayout();
    setLayout(aLayout);

    addWidget(aLabel, 0, 0, 1, 1);
    addWidget(bLabel, 1, 0, 1, 1);
    addWidget(left, 0, 1, 1, 1);
    addWidget(right, 1, 1, 1, 1);
  }

  public void addWidget(Component widget, int x, int y, int w, int h)
  {
    aConstraint.gridx = x;
    aConstraint.gridy = y;
    aConstraint.gridwidth = w;
    aConstraint.gridheight = h;
    aLayout.setConstraints(widget, aConstraint);
    add(widget);
  }
}
