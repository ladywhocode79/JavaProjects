package classassignments;

public class CommerceStudent extends Student{
    int accountsMarks;
    int  economicMarks;
    int businessStudiesMarks;

    CommerceStudent (String name,String rollNum,int accountsMarks,int economicMarks,int businessStudiesMarks){
        super(name,rollNum);
        this.accountsMarks = accountsMarks;
        this.economicMarks=economicMarks;
        this.businessStudiesMarks = businessStudiesMarks;
    }
}
