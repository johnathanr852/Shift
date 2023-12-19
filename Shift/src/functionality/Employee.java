package functionality;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class for the handling of employee objects.
 * 
 * @author John Ryder.
 * @version 1.0
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	ArrayList<Shift> currentShifts;
	private String employeeNotes;
	
	/**
	 * Create a new employee, specifying name and age.
	 * @param name - the name of the employee.
	 * @param age - the age of the employee.
	 */
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
		this.currentShifts = new ArrayList<>();
		this.employeeNotes = "";
	}
	
	/**
	 * Create an employee, specifying name, age, current shifts, and notes.
	 * @param name - the name of the employee.
	 * @param age - the age of the employee.
	 * @param currentShifts - the current shifts to be worked by the employee.
	 * @param employeeNotes - the notes about the employee
	 */
	public Employee(String name, int age, ArrayList<Shift> currentShifts, String employeeNotes)
	{
		this(name, age);
		this.currentShifts = currentShifts;
		this.employeeNotes = employeeNotes;
	}
	
	/**
	 * Get the employee's name.
	 * @return the employee's name.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Set the employee's name.
	 * @param newName - the employee's new name.
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	/**
	 * Get the employee's age.
	 * @return the employee's age.
	 */
	public int getAge()
	{
		return this.age;
	}
	
	/**
	 * Set the employee's age.
	 * @param newAge - the employee's new age.
	 */
	public void setAge(int newAge)
	{
		this.age = newAge;
	}
	
	/**
	 * Add a shift to the employee.
	 * @param newShift - the new shift.
	 */
	public void addShift(Shift newShift)
	{
		this.currentShifts.add(newShift);
	}
	
	/**
	 * Remove a shift from the employee.
	 * @param shiftToRemove - the shift to remove.
	 */
	public void removeShift(Shift shiftToRemove)
	{
		//TODO
	}
	
	/**
	 * Get the employee's current shifts.
	 * @return the current shifts of the employee.
	 */
	public ArrayList<Shift> getShifts()
	{
		return this.currentShifts;
	}
	
	/**
	 * Add a note to the employee's file.
	 * @param newNote - the note to add to the employee's file.
	 */
	public void addNote(String newNote)
	{
		this.employeeNotes = this.employeeNotes + "\n" + newNote;
	}
	
	/**
	 * "Hard-set" the employee's notes. Note that this will overwrite previously saved notes.
	 * If you wish to modify the previously saved notes, use addNote instead.
	 * @param newNote - the new note.
	 */
	public void setNote(String newNote)
	{
		this.employeeNotes = newNote;
	}
}
