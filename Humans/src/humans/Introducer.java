package humans;

public class Introducer {

    public String createPublicIntroduction(Human person) {
        try {
            String intro = String.format("I am pleased to introduce %s %s.", person.getFirstName(), person.getLastName());
            String pronoun = "";
            if (person.getGender() == Gender.MALE) {
                pronoun = "He";
            } else if (person.getGender() == Gender.FEMALE) {
                pronoun = "She";
            } else {
                pronoun = "They";
            }
            if (person instanceof Adult) {
                Adult adult = (Adult) person;
                intro += String.format(" %s works at %s and their occupation is %s.", pronoun, adult.getPlaceOfWork(), adult.getOccupation());
            } else if (person instanceof Youth) {
                Youth youth = (Youth) person;
                intro += String.format(" %s goes to %s and is in grade %d.", pronoun, youth.getSchoolName(), youth.getSchoolGrade());
            }
            return intro;
        } catch (Exception e) {
            return "This person has issues and can't be introduced.";
        }
    }
}
