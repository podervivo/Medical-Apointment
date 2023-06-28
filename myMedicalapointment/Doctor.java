package myMedicalapointment;

public class Doctor {
    static int id = 0;
    String name;
    String especiality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");

    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del Doctor asignado es : " + name);
        id++;
        this.name = name;
        this.especiality = speciality;

    }

    // comportamietos
    public void showName() {
        System.out.println(name);

    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

}
