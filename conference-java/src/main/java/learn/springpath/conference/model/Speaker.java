package learn.springpath.conference.model;

public class Speaker {

    private String firstName;
    private String lastName;
    private double seedNum;

    public Speaker() {
    }

    public Speaker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", seedNum=" + seedNum +
                '}';
    }
}
