package myMedicalapointment.Subjets;

import myMedicalapointment.Dates.User;

public class Patient extends User {

    private String birthday;
    private Double weight;
    private Double height;
    private String bloodType;

    Patient(String name, String email) {
        super(name, email);
    }

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

}
