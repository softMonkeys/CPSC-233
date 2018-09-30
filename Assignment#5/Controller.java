import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener
{
  private View aView;
  private Model aModel;
  private threadCounter t;

  Controller(View aView, Model aModel)
  {
    this.aView = aView;
    this.aModel = aModel;
    this.t = t;
    aView.setEventListener((ActionListener) this);
  }

  public void actionPerformed(ActionEvent e)
  {
    try
    {
      assumingCorrectNumberFormat(e);
    }
    catch (NumberFormatException e2)
    {
      aView.setOutputErrorMesssage();
    }
  }


  public void assumingCorrectNumberFormat(ActionEvent e)
  {
    String actionCommand = e.getActionCommand();


    if (actionCommand.equals("start"))
    {
      int upperBoundInput = Integer.parseInt(aView.getUpperBoundInput());
      int lowerBoundInput = Integer.parseInt(aView.getLowerBoundInput());
      int incrementInput = Integer.parseInt(aView.getIncrementInput());
      int delayInput = Integer.parseInt(aView.getDelayInput());
      aModel.setUpperBound(upperBoundInput);
      aModel.setLowerBound(lowerBoundInput);
      aModel.setIncrement(incrementInput);
      aModel.setDelay(delayInput);

      t = new threadCounter(aView, lowerBoundInput, upperBoundInput, incrementInput, delayInput, true);
      t.start();
    }
    else if (actionCommand.equals("pause"))
    {
      t.pause();
      t.pauseThread();

    }
    else if (actionCommand.equals("continue"))
    {
      t.resumeThread();
    }
    else
    {
      System.out.println("Unanticipated error.");
    }
  }

  public static void main(String[] args)
  {
    View w = new View();
    w.setVisible(true);
    Model m = new Model();
    Controller thisController = new Controller(w, m);
  }


}
