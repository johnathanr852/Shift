package functionality;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class for shift objects, which hold information on shifts that will be worked by customers.
 * 
 * @author John Ryder
 * @version 1.0
 */
public class Shift implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> workingEmployees;
	private String startDay;
	private String endDay;
	private String startTime;
	private String endTime;
	private String shiftName;
	private String shiftDescription;
	private int workersNeeded;
	
	/**
	 * Create the shift object.
	 * @param startDay - the day the shift starts.
	 * @param endDay - the day the shift ends.
	 * @param startTime - the time the shift starts.
	 * @param endTime - the time the shift ends.
	 * @param shiftName - the name of the shift.
	 * @param shiftDescription - the description of the shift.
	 * @param workersNeeded - the amount of workers needed to fill the shift.
	 */
	public Shift(final String startDay, final String endDay, final String startTime,
			final String endTime, final String shiftName, final String shiftDescription,  
			final int workersNeeded)
	{
		this.startDay = startDay;
		this.endDay = endDay;
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftName = shiftName;
		this.shiftDescription = shiftDescription;
		this.workersNeeded = workersNeeded;
		this.workingEmployees = new ArrayList<>();
	}
	
	
	/**
	 * Create the shift object, specifying employees who are working the shift.
	 * @param startDay - the day the shift starts.
	 * @param endDay - the day the shift ends.
	 * @param startTime - the time the shift starts.
	 * @param endTime - the time the shift ends.
	 * @param shiftName - the name of the shift.
	 * @param shiftDescription - the description of the shift.
	 * @param workersNeeded - the amount of workers needed to fill the shift.
	 * @param workingEmployees - the list of employees currently working the shift.
	 */
	public Shift(final String startDay, final String endDay, final String startTime,
			final String endTime, final String shiftName, final String shiftDescription,  
			final int workersNeeded, final ArrayList<Employee> workingEmployees)
	{
		this(startDay, endDay, startTime, endTime, shiftName, shiftDescription, workersNeeded);
		this.workingEmployees = workingEmployees;
	}
	
	/**
	 * Get the list of working employees.
	 * @return the list of working employees.
	 */
	public ArrayList<Employee> getWorkingEmployees()
	{
		return this.workingEmployees;
	}
	
	/**
	 * Adds a new employee to the shift as long as the number of employees working is less than
	 * the number of employees needed.
	 * @param newEmployee - the employee to add.
	 */
	public void addWorkingEmployee(final Employee newEmployee)
	{
		if (this.workingEmployees.size() < workersNeeded)
		{
			this.workingEmployees.add(newEmployee);
		}
	}
	
	/**
	 * Removes an employee from the list of employees working.
	 * @param employeeToRemove - the employee to remove.
	 */
	public void removeWorkingEmployee(final Employee employeeToRemove)
	{
		if (workingEmployees.contains(employeeToRemove))
		{
			workingEmployees.remove(employeeToRemove);
		}
	}
	
	/**
	 * Get the start day.
	 * @return the start day.
	 */
	public String getStartDay()
	{
		return this.startDay;
	}
	
	/**
	 * Set the start day.
	 * @param newStartDay - the new start day.
	 */
	public void setStartDay(final String newStartDay)
	{
		this.startDay = newStartDay;
	}
	
	/**
	 * Get the shift's end day.
	 */
	public String getEndDay()
	{
		return this.endDay;
	}
	
	/**
	 * Set the shift's end day.
	 * @param newEndDay - the new end day.
	 */
	public void setEndDay(final String newEndDay)
	{
		this.endDay = newEndDay;
	}
	
	/**
	 * Get the start time.
	 * @return the start time.
	 */
	public String getStartTime()
	{
		return this.startTime;
	}
	
	/**
	 * Set the start time.
	 * @param newStartTime - the new start time.
	 */
	public void setStartTime(final String newStartTime)
	{
		this.startTime = newStartTime;
	}
	
	/**
	 * Get the end time.
	 * @return the end time.
	 */
	public String getEndTime()
	{
		return this.endTime;
	}
	
	/**
	 * Set the end time.
	 * @param newEndTime - the new end time.
	 */
	public void setEndTime(final String newEndTime)
	{
		this.endTime = newEndTime;
	}
	
	/**
	 * Get the shift name.
	 * @return the shift name.
	 */
	public String getShiftName()
	{
		return this.shiftName;
	}
	
	/**
	 * Set the shift name.
	 * @param newShiftName - the new shift name.
	 */
	public void setShiftName(final String newShiftName)
	{
		this.shiftName = newShiftName;
	}
	
	/**
	 * Get the shift description.
	 * @return the shift description.
	 */
	public String getShiftDescription()
	{
		return this.shiftDescription;
	}
	
	/**
	 * Append to the shift description.
	 * 
	 * @param stringToAppend - the string to append to the shift description.
	 */
	public void appendToShiftDescription(final String stringToAppend)
	{
		this.shiftDescription = this.shiftDescription + "\n" + stringToAppend;
	}
	
	/**
	 * Overwrite the shift description.
	 * 
	 * @param newShiftDescription - the new description of the shift.
	 */
	public void overwriteShiftDescription(final String newShiftDescription)
	{
		this.shiftDescription = newShiftDescription;
	}
	
	/**
	 * Get the number of workers needed for the shift.
	 * 
	 * @return the number of workers needed for the shift.
	 */
	public int getWorkersNeeded()
	{
		return this.workersNeeded;
	}
	
	/**
	 * Set the number of workers needed.
	 * 
	 * @param newWorkersNeeded - the new number of workers needed.
	 */
	public void setWorkersNeeded(final int newWorkersNeeded)
	{
		this.workersNeeded = newWorkersNeeded;
	}
	
	/**
	 * Check the equality of two shifts. Shifts are equals if their names, descriptions, 
	 * start and end days, start and end times, and number of workers needed match.
	 * 
	 * @return true or false if the shifts are equal or not.
	 */
	public boolean equals(Object obj)
	{
		Shift otherShift = (Shift) obj;
		if (this.shiftName.equals(otherShift.shiftName) && 
			this.shiftDescription.equals(otherShift.shiftDescription) &&
			this.startDay.equals(otherShift.startDay) &&
			this.endDay.equals(otherShift.endDay) &&
			this.startTime.equals(otherShift.startTime) &&
			this.endTime.equals(otherShift.endTime) &&
			this.workersNeeded == otherShift.workersNeeded)
		{
			return true;
		} else
		{
			return false;
		}
	}
}
