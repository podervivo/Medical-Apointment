package myMedicalapointment;

import static UI.UImenu.*;

import UI.UImenu;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Emiliano Garello", "Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Ivana Gomes", "Ivana@mail.com");
        patient.setWeight(85.4);
        patient.setHeight(1.73);
        System.out.println(patient.getName());
        System.out.println(patient.getHeight());
        System.out.println(patient.getWeight());
    }

}