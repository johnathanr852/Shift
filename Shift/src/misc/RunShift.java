package misc;

import gui.ShiftWindow;

/**
 * The main runner for Shift.
 * 
 * @author John Ryder
 * @version 1.0
 */
public class RunShift {

	/**
	 * Run Shift.
	 * @param args - execution-time arguments.
	 */
	public static void main(String[] args)
	{
		ShiftWindow newWindow = new ShiftWindow();
		newWindow.showWindow();
	}
}
