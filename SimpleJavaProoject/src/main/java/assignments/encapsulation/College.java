package assignments.encapsulation;
/*Print college names(any 5 colleges) and departments - IT , CS , MECH , ECE , EEE , AERO , AUTO , EI -
Should use private variables for the department name and college . (Apply encapsulation)*/

public class College {
    //set private variables
    private String collegeName;
    private String [] departmentName;

    //getter method
    public String[] getDepartmentName() {
        return departmentName;
    }
    //setter method
    public void setDepartmentName(String[] departmentName) {
        this.departmentName = departmentName;
    }
    //getter method
    public String getCollegeName() {
        return collegeName;
    }
    //setter method
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }


}
