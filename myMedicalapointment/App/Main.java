package myMedicalapointment.App;

import static myMedicalapointment.UI.UImenu.*;

import java.util.Date;

import myMedicalapointment.Subjets.Doctor;
import myMedicalapointment.Subjets.Patient;
import myMedicalapointment.UI.UImenu;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Emiliano Garello", "Pediatra");
        myDoctor.addTurnosDisponibles(new Date(), "10 am");
        myDoctor.addTurnosDisponibles(new Date(), "2 pm");
        myDoctor.addTurnosDisponibles(new Date(), "4 pm");

        System.out.println(myDoctor);

        // System.out.println(myDoctor.getTurnosDisponibles());

        for (Doctor.TurnosDisponibles tD : myDoctor.getTurnosDisponibles()) {
            System.out.println(tD.getDate() + " " + tD.getTime());
        }

        Patient patient = new Patient("Ivana Gomez", "Ivana@mail.com");

        System.out.println(patient);

    }

}