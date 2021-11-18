package assignments.encapsulation;

public class CollegeLists extends College{
    public static void main(String[] args) {
       //print college details
        String [] departmentName = new String[] {"CS, IT , CS , MECH , ECE , AERO "};
        printCollegeDetails("IIT Madras",departmentName);
        String [] departmentName1 = new String[] {"CS, MECH , ECE , AERO "};
        printCollegeDetails("IIT Mumbai",departmentName1);
        String [] departmentName2 = new String[] {"IT , CS , MECH , ECE , EEE , AERO , AUTO , EI"};
        printCollegeDetails("NIIT Bangalore",departmentName2);
        String [] departmentName3 = new String[] {"CS , MECH , ECE , EEE , AERO , AUTO , EI"};
        printCollegeDetails("NIIT Bhopal",departmentName3);
        String [] departmentName4 = new String[] {"CS , MECH , ECE , EEE , AERO , AUTO , EI"};
        printCollegeDetails("MIT Mandsaur",departmentName4);



    }
    //prints college names and department lists using class getter and setter methods
    static void printCollegeDetails(String collegeName,String [] departmentLists){
        College collegeObj = new College();
        collegeObj.setCollegeName(collegeName);
        collegeObj.setDepartmentName(departmentLists);
        System.out.println(collegeObj.getCollegeName()+" has following departments : ");
        String [] departmentName = collegeObj.getDepartmentName();
        for(int i=0;i<departmentName.length;i++)
            System.out.println(departmentName[i]);
    }
}
