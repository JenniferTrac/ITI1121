import javax.swing.*;
import java.awt.*;

 public class MyFirstGUI{

  public static void main(String[] args){

	JFrame myFrame = new JFrame();
	//set the title
	myFrame.setTitle("My first Window");

	//set the size to 500X300 pixels (width by heigth)
	myFrame.setSize(500, 300);

	//set the object to the middle of our screen
	myFrame.setLocationRelativeTo(null);

	//end program when user closes the window
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	//create a panel
	JPanel myPanel = new JPanel();
	//add a label to the panel
	myPanel.add(new Label("My first panel"));
	//set panel background color
	myPanel.setBackground(Color.green);
	//add the panel to the frame
	myFrame.add(myPanel, BorderLayout.NORTH);

	//YOUR CODE HERE

    // third panel
    JPanel thirdPanel = new JPanel();
    thirdPanel.add(new Label("My third panel"));
    thirdPanel.setBackground(Color.yellow);
    myFrame.add(thirdPanel, BorderLayout.SOUTH);

    // east panel
    JPanel secondPanel = new JPanel();
    secondPanel.setBackground(Color.orange);
    myFrame.add(secondPanel, BorderLayout.EAST);

    // buttons
    JButton startButton = new JButton();
    startButton.add(new Label("Start"));
    secondPanel.add(startButton, BorderLayout.NORTH);

    JButton endButton = new JButton();
    endButton.add(new Label("End"));
    endButton.setBackground(Color.red);
    secondPanel.add(endButton, BorderLayout.NORTH);


	//set the window to visible
    myFrame.setVisible(true);
	}

}
