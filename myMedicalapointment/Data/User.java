package myMedicalapointment.Data;

public class User {
    private int id;
    protected String name;
    private String addres;
    private String phoneNumber;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return this.addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("EL número de telefono debe contener 8 digitos como máximo");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", Phone: " + phoneNumber + ", Email: " + email + ", \n Address: " + addres;
    }
}
