package humans;

public class WilliamAberhartStudent extends Youth{
    
    private static final String SCHOOL = "William Aberhart High School";
    private int homeRoom;
    private String homeRoomTeacher;
    
    public WilliamAberhartStudent(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender,
                                        int schoolGrade, int homeRoom, String homeRoomTeacher) {
        super(birthYear, birthMonth, birthDay, firstName, lastName, gender, schoolGrade, SCHOOL);
        this.homeRoom = homeRoom;
        this.homeRoomTeacher = homeRoomTeacher;
    }
    
    public int getHomeRoom() {
        return this.homeRoom;
    }
    public String getHomeRoomTeacher() {
        return this.homeRoomTeacher;
    }
    
    public void setHomeRoom(int homeRoom) {
        this.homeRoom = homeRoom;
    }
    public void setHomeRoomTeacher(String homeRoomTeacher) {
        this.homeRoomTeacher = homeRoomTeacher;
    }
    @Override
    public void setSchoolName(String schoolName) {
        throw new UnsupportedOperationException();
    }
}
