package myMedicalapointment.Subjets;

import myMedicalapointment.Data.User;

public class Patient extends User {

    public Patient(String name, String email) {
        super(name, email);
    }

    private String birthday;
    private Double weight;
    private Double height;
    private String bloodType;

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + " Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Age: " + birthday + "\nHeight: " + height + "\nweight: " + weight + getWeight()
                + "\n Blood type   ";
    }

}
