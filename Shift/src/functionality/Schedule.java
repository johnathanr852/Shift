package functionality;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class for defining and modifying schedules.
 * 
 * @author John Ryder
 * @version 12/18/23
 */
public class Schedule implements Serializable {

	private static final long serialVersionUID = 1L;
	private HashMap<Shift, ArrayList<Employee>> items;
	private String startDate;
	private String endDate;
	private String name;
	
	/**
	 * Creates a default schedule with a default name, start and end date, and no items.
	 */
	public Schedule()
	{
		this.items = new HashMap<>();
		this.startDate = "1/1/1969";
		this.endDate = "1/2/1969";
		this.name = "Default Schedule";
	}
	
	/**
	 * Creates a schedule with a specific start date, end date, and name.
	 * @param startDate - the start date of the schedule.
	 * @param endDate - the end date of the schedule.
	 * @param name - the name of the schedule.
	 */
	public Schedule(final String startDate, final String endDate, final String name)
	{
		this.startDate = startDate;
		this.endDate = endDate;
		this.name = name;
		this.items = new HashMap<>();
	}
	
	/**
	 * Get the start date.
	 * @return the start date.
	 */
	public String getStart()
	{
		return this.startDate;
	}
	
	/**
	 * Set the start date.
	 * @param newStart the new start date.
	 */
	public void setStart(final String newStart)
	{
		this.startDate = newStart;
	}
	
	/**
	 * Get the end date.
	 * @return the end date.
	 */
	public String getEnd()
	{
		return this.endDate;
	}
	
	/**
	 * Set the end date.
	 * @param newEnd - the new end date.
	 */
	public void setEnd(final String newEnd)
	{
		this.endDate = newEnd;
	}
	
	/**
	 * Get the hash map of shifts and workers who are working them.
	 * @return - the hash map.
	 */
	public HashMap<Shift, ArrayList<Employee>> getItems()
	{
		return this.items;
	}
	
	/**
	 * Searches for a shift in the schedule, and returns the employees if found.
	 * @param shiftToSearch - the shift to search for.
	 * @return the ArrayList of employees if it is found, or an empty ArrayList otherwise.
	 */
	public ArrayList<Employee> getWorkers(final Shift shiftToSearch)
	{
		ArrayList<Employee> workersForShift = new ArrayList<>();
		if (this.items.containsKey(shiftToSearch))
		{
			workersForShift = this.items.get(shiftToSearch);
		}
		return workersForShift;
	}
	
	/**
	 * Adds a shift and its employees to the hash map of items.
	 * @param shiftToAdd - the shift object to be added.
	 */
	public void addShift(final Shift shiftToAdd)
	{
		ArrayList<Employee> shiftEmployees = shiftToAdd.getWorkingEmployees();
		this.items.put(shiftToAdd, shiftEmployees);
	}
	
	/**
	 * Remove a shift.
	 * @param shiftToRemove - the shift to be removed.
	 */
	public void removeShift(final Shift shiftToRemove)
	{
		this.items.remove(shiftToRemove);
	}
	
	/**
	 * Add an employee to a shift.
	 * @param shiftToModify - the shift where the employee is to be added.
	 * @param employeeToAdd - the employee to add to the shift.
	 */
	public void addEmployeeToShift(final Shift shiftToModify, final Employee employeeToAdd)
	{
		if (this.items.containsKey(shiftToModify))
		{
			this.items.get(shiftToModify).add(employeeToAdd);
		}
	}
	
	/**
	 * Remove an employee from a shift.
	 * @param shiftToModify - the shift where the employee is to be removed from.
	 * @param employeeToRemove - the employee to remove.
	 */
	public void removeEmployeeFromShift(final Shift shiftToModify, final Employee employeeToRemove)
	{
		if (this.items.containsKey(shiftToModify))
		{
			this.items.get(shiftToModify).remove(employeeToRemove);
		}
	}
}
