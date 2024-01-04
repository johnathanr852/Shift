package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * The center panel for shift that allows for the creation of a new schedule.
 * @author John Ryder
 * @version 1.0
 *
 */
public class NewSchedulePanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea scheduleNameArea;
	private JTextArea startDateArea;
	private JTextArea endDateArea;
	private JButton createSchedule;
	private JButton cancelButton;
	private ShiftWindow linkedFrame;
	
	/**
	 * Create a new schedule panel for use in ShiftWindow.
	 * @param linkedFrame - the ShiftWindow that the frame is linked to.
	 */
	public NewSchedulePanel(final ShiftWindow linkedFrame)
	{
		super();
		this.linkedFrame = linkedFrame;
		this.scheduleNameArea = new JTextArea("Schedule Name");
		this.startDateArea = new JTextArea("Start Date (MM/DD/YYYY)");
		this.endDateArea = new JTextArea("End Date (MM/DD/YYYY)");
		this.createSchedule = new JButton("Create Schedule");
		this.cancelButton = new JButton("Cancel");
		this.setupLayout();
	}
	
	/**
	 * Sets up the layout of the panel.
	 */
	private void setupLayout()
	{
		this.setLayout(new FlowLayout());
		this.scheduleNameArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.add(this.scheduleNameArea);
		this.startDateArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.add(this.startDateArea);
		this.endDateArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.add(this.endDateArea);
		this.add(this.createSchedule);
		this.add(this.cancelButton);
	}
	
	/**
	 * Get this default panel.
	 * @return this default panel.
	 */
	public JPanel getThis()
	{
		return this;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
