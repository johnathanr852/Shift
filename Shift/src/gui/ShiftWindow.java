package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * A class for holding the main window of Shift.
 * 
 * @author John Ryder
 * @version 1.0
 */
public class ShiftWindow extends JFrame implements ActionListener {

	private JMenuBar toolbar;
	private JMenu fileMenu;
	private JButton openButton;
	private JButton saveButton;
	private JMenu employeeMenu;
	private JButton addEmployeeButton;
	private JButton editEmployeeButton;
	private JMenu shiftMenu;
	private JButton addShiftButton;
	private JButton editShiftButton;
	private JMenu scheduleMenu;
	private JButton newScheduleButton;
	private JButton editScheduleButton;
	
	/**
	 * Create a default ShiftWindow object.
	 */
	public ShiftWindow()
	{
		super("Shift");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.toolbar = new JMenuBar();
		this.fileMenu = new JMenu("File");
		this.openButton = new JButton("Open");
		this.saveButton = new JButton("Save");
		this.employeeMenu = new JMenu("Employees");
		this.addEmployeeButton = new JButton("Add Employee");
		this.editEmployeeButton = new JButton("Edit Employee");
		this.shiftMenu = new JMenu("Schedule");
		this.addShiftButton = new JButton("Add Shift");
		this.editShiftButton = new JButton("Edit Shift");
		this.scheduleMenu = new JMenu("Schedule");
		this.newScheduleButton = new JButton("New Schedule");
		this.editScheduleButton = new JButton("Edit Schedule");
		this.fileMenu.add(this.openButton);
		this.fileMenu.add(this.saveButton);
		this.employeeMenu.add(this.addEmployeeButton);
		this.employeeMenu.add(this.editEmployeeButton);
		this.shiftMenu.add(this.addShiftButton);
		this.shiftMenu.add(this.editShiftButton);
		this.scheduleMenu.add(this.newScheduleButton);
		this.scheduleMenu.add(this.editScheduleButton);
		this.toolbar.add(this.fileMenu);
		this.toolbar.add(this.employeeMenu);
		this.toolbar.add(this.shiftMenu);
		this.toolbar.add(this.scheduleMenu);
		this.add(this.toolbar, BorderLayout.NORTH);
	}
	
	/**
	 * Run the current ShiftWindow.
	 */
	public void showWindow()
	{
		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * Get the toolbar.
	 * @return the toolbar.
	 */
	public JMenuBar getToolbar()
	{
		return this.toolbar;
	}
	
	/**
	 * Get the file menu.
	 * @return the file menu.
	 */
	public JMenu getFileMenu()
	{
		return this.fileMenu;
	}
	
	/**
	 * Get the open button.
	 * @return the open button.
	 */
	public JButton getOpenButton()
	{
		return this.openButton;
	}
	
	/**
	 * Get the save button.
	 * @return the save button.
	 */
	public JButton getSaveButton()
	{
		return this.saveButton;
	}
	
	/**
	 * Get the employee menu.
	 * @return the employee menu.
	 */
	public JMenu getEmployeeMenu()
	{
		return this.employeeMenu;
	}
	
	/**
	 * Get the add employee button.
	 * @return the add employee button.
	 */
	public JButton getAddEmployee()
	{
		return this.addEmployeeButton;
	}
	
	/**
	 * Get the edit employee button.
	 * @return the edit employee button.
	 */
	public JButton getEditEmployee()
	{
		return this.editEmployeeButton;
	}
	
	/**
	 * Get the shift menu.
	 * @return the schedule menu.
	 */
	public JMenu getShiftMenu()
	{
		return this.shiftMenu;
	}
	
	/**
	 * Get the add shift button.
	 * @return the add shift button.
	 */
	public JButton getAddShift()
	{
		return this.addShiftButton;
	}
	
	/**
	 * Get the edit shift button.
	 * @return the edit shift button.
	 */
	public JButton getEditShift()
	{
		return this.editShiftButton;
	}
	
	/**
	 * Get the schedule menu.
	 * @return the schedule menu.
	 */
	public JMenu getScheduleMenu()
	{
		return this.scheduleMenu;
	}
	
	/**
	 * Get the new schedule button.
	 * @return the new schedule button.
	 */
	public JButton getNewScheduleButton()
	{
		return this.newScheduleButton;
	}
	
	/**
	 * Get the edit schedule button.
	 * @return the edit schedule button.
	 */
	public JButton getEditScheduleButton()
	{
		return this.editScheduleButton;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
