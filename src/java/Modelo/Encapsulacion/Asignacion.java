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
public class Asignacion {
    private int id;
    private String nrc;
    private String experiencia;
    private String salon;
    private String horario;
    private String usuario;
    
    public Asignacion(int id,String nrc,String experiencia,String salon,String horario,String usuario)
    {
        this.id=id;
        this.nrc=nrc;
        this.experiencia=experiencia;
        this.salon=salon;
        this.horario=horario;
        this.usuario=usuario;
        
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
     * @return the nrc
     */
    public String getNrc() {
        return nrc;
    }

    /**
     * @param nrc the nrc to set
     */
    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    /**
     * @return the experiencia
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
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
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
