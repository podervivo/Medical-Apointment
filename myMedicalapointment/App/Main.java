package myMedicalapointment.App;

import static myMedicalapointment.UI.UImenu.*;

import java.util.Date;

import myMedicalapointment.Subjets.Doctor;
import myMedicalapointment.UI.UImenu;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Emiliano Garello", "Pediatra");
        myDoctor.addTurnosDisponibles(new Date(), "10 am");
        myDoctor.addTurnosDisponibles(new Date(), "2 pm");
        myDoctor.addTurnosDisponibles(new Date(), "4 pm");

        // System.out.println(myDoctor.getTurnosDisponibles());

        for (Doctor.TurnosDisponibles tD : myDoctor.getTurnosDisponibles()) {
            System.out.println(tD.getDate() + " " + tD.getTime());
        }

        /*
         * Patient patient = new Patient("Ivana Gomes", "Ivana@mail.com");
         * patient.setWeight(85.4);
         * patient.setHeight(1.73);
         * System.out.println(patient.getName());
         * System.out.println(patient.getHeight());
         * System.out.println(patient.getWeight());
         * 
         * Patient patient2 = new Patient("Juan Perez", "juan@mail.com");
         * patient2.setAge(60);
         * patient2.getHeight(65.6);
         * patient2.setWeight(60.0);
         */

    }

}