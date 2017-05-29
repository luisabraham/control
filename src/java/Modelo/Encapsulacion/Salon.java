/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Encapsulacion;

/**
 *
 * @author trdni
 */
public class Salon {
    private int id;
    private String salon;
    private int capacidad;
    private String programas;

    public Salon(int id,String salon,int capacidad,String programas){
        this.id=id;
        this.salon=salon;
        this.capacidad=capacidad;
        this.programas=programas;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the salon
     */
    public String getSalon() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setSalon(String salon) {
        this.salon = salon;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the programas
     */
    public String getProgramas() {
        return programas;
    }

    /**
     * @param programas the programas to set
     */
    public void setProgramas(String programas) {
        this.programas = programas;
    }
    
}
