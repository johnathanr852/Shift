package gui;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * The "default" center panel for Shift that just describes how to load a schedule.
 * @author John Ryder
 * @version 1.0
 *
 */
public class DefaultPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private JTextArea defaultText;
	
	/**
	 * Create the default panel.
	 */
	public DefaultPanel()
	{
		super();
		this.defaultText = new JTextArea(
				"No schedule currently loaded. Load a schedule via File -> Open, or "
				+ "create a new schedule via Schedule -> New Schedule.");
		this.defaultText.setEditable(false);
		this.setLayout(new FlowLayout());
		this.add(this.defaultText);
	}
	
	/**
	 * Get this default panel.
	 * @return this default panel.
	 */
	public JPanel getThis()
	{
		return this;
	}
	
	
	/**
	 * Get the text area inside of the panel.
	 * @return the text area.
	 */
	public JTextArea getTextArea()
	{
		return this.defaultText;
	}
}
