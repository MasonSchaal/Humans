package humans;

import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;
import java.util.Comparator;

public class Human implements Comparable<Human>{
    
    public static final Comparator<Human> AGE_ORDER = new Comparator<Human>() {
        public int compare(Human h1, Human h2) {
            return h1.compareTo(h2);
        }
    };
    public static final Comparator<Human> NAME_ORDER = new Comparator<Human>() {
        public int compare(Human h1, Human h2) {
            int nameCompare = h1.getLastName().compareTo(h2.getLastName());
            if (nameCompare != 0) {
                return nameCompare;
            }
            return (h1.getFirstName().compareTo(h2.getFirstName()));
        }
    };
    public static final Comparator<Human> ASSEMBLY_ORDER = new Comparator<Human>() {
        public int compare(Human h1, Human h2) {
            int assemblyCompare = ((Integer) rankOfHuman(h1)).compareTo(rankOfHuman(h2));
        }
    };

    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDateTime birthDate;
    
    public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = LocalDateTime.of(birthYear, birthMonth, birthDay, 0, 0, 0);
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

    @Override
    public int compareTo(Human o) {
        return this.birthDate.compareTo(o.birthDate);
    }
    
    public static int rankOfHuman(Human o) {
        if (o instanceof WilliamAberhartStudent) {
            return 0;
        } else if (o instanceof Youth) {
            return 1;
        } else if (o instanceof Adult) {
            return 2;
        } else {
            return 3;
        }
    }
}
