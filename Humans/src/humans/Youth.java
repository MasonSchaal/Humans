package humans;

public class Youth extends Human{
    
    private int schoolGrade;
    private String schoolName;

    public Youth(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender,
                    int schoolGrade, String schoolName) {
        super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
        this.schoolGrade = schoolGrade;
        this.schoolName = schoolName;
    }
    
    public int getSchoolGrade() {
        return this.schoolGrade;
    }
    public String getSchoolName() {
        return this.schoolName;
    }
    
    public void setSchoolGrade(int schoolGrade) {
        this.schoolGrade = schoolGrade;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
