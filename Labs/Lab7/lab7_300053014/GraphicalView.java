import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicalView extends JFrame implements View {
	private JLabel input;
	private Timer model;
	public GraphicalView (Timer model, Controller controller) {

		setLayout (new GridLayout(2, 3));
		this.model = model;

		// Your code here

		// making 6 buttons
		JButton inHour = new JButton("IncrementHours");
		JButton outHour = new JButton("DecrementHours");
		JButton inMinute = new JButton("IncrementMinutes");
		JButton outMinute = new JButton("DecrementMinutes");
		JButton inSecond = new JButton("IncrementSeconds");
		JButton outSecond = new JButton("DecrementSeconds");

		inHour.addActionListener(controller);
		outHour.addActionListener(controller);
		inMinute.addActionListener(controller);
		outMinute.addActionListener(controller);
		inSecond.addActionListener(controller);
		outSecond.addActionListener(controller);

		add(inHour);
		add(outHour);
		add(inMinute);
		add(outMinute);
		add(inSecond);
		add(outSecond);

		input = new JLabel();
		add(input);

		//setup
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 100);

		//display the window
		setVisible(true);
	}

	public void update () {
		input.setText(model.toString());
	}
}
