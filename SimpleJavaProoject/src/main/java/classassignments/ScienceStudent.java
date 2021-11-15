package classassignments;

public class ScienceStudent extends Student{
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;

    ScienceStudent (String name,String rollNum,int physicsMarks,int chemistryMarks,int mathsMarks){
        super(name,rollNum);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks=chemistryMarks;
        this.mathsMarks = mathsMarks;
    }


}
