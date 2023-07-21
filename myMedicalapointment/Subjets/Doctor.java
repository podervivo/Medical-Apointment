package myMedicalapointment.Subjets;

import java.util.Date;

import myMedicalapointment.Dates.User;

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

    public void setEspeciality(String especiality) {
        this.speciality = especiality;
    }

    ArrayList<TurnosDisponibles> turnosDisponibles = new ArrayList<>();

    public void addTurnosDisponibles(Date date, String time) {
        turnosDisponibles.add(new Doctor.TurnosDisponibles(date, time));
    }

    public ArrayList<TurnosDisponibles> getTurnosDisponibles() {
        return turnosDisponibles;
    }

    public static class TurnosDisponibles {

        private int id;
        private Date date;
        private String time;

        public TurnosDisponibles(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return this.date;
        }

        public String getTime() {
            return this.time;
        }

    }

}
