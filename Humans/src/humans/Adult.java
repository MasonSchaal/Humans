package humans;

public class Adult extends Human{
    
    private String placeOfWork;
    private String occupation;

    public Adult(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender,
                    String placeOfWork, String occupation) {
        super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
        this.placeOfWork = placeOfWork;
        this.occupation = occupation;
    }
    
    public String getPlaceOfWork() {
        return this.placeOfWork;
    }
    public String getOccupation() {
        return this.occupation;
    }
    
    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
