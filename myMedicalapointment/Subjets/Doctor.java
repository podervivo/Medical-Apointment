package myMedicalapointment.Subjets;

import java.util.Date;

import myMedicalapointment.Data.User;

import java.util.ArrayList;

public class Doctor extends User {
    // atributos

    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del Doctor asignado es : " + name);
        this.speciality = speciality;

    }

    // comportamientos

    public String getEspeciality() {
        return this.speciality;
    }

    public void setEspeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<TurnosDisponibles> turnosDisponibles = new ArrayList<>();

    public void addTurnosDisponibles(Date date, String time) {
        turnosDisponibles.add(new Doctor.TurnosDisponibles(date, time));
    }

    public ArrayList<TurnosDisponibles> getTurnosDisponibles() {
        return turnosDisponibles;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Especialidad: " + speciality + "\nDisponibles: " + turnosDisponibles.toString();
    }

    public static class TurnosDisponibles {

        private int id;
        private Date date;
        private String time;

        public TurnosDisponibles(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return this.date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return this.time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Turnos Disponibles \n Date: " + date + "\n Time: " + time;
        }

    }

}
