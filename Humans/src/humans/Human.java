package humans;

import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;

public class Human {

    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String firstName;
    private String lastName;
    private Gender gender;
    
    public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public int getBirthYear() {
        return this.birthYear;
    }
    public int getBirthMonth() {
        return this.birthMonth;
    }
    public int getBirthDay() {
        return this.birthDay;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public Gender getGender() {
        return this.gender;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    public int calculateCurrentAgeInYears() {
        LocalDateTime birthday = LocalDateTime.of(this.getBirthYear(), this.getBirthMonth(), this.getBirthDay() , 0, 0, 0);
        return (int) ChronoUnit.YEARS.between(birthday, LocalDateTime.now());
    }
}
