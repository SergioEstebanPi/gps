/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DAO.candidatoDAO;
import entity.Candidato;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Usuario
 */
@Named(value = "candidato")
@Dependent
public class CandidatoBean {

    private int idCandidato;
    private String nombreCandidato;
    private String apellidoCandidato;

    private candidatoDAO candidatoDAO;
    /**
     * Creates a new instance of Candidato
     */
    public CandidatoBean() {
        candidatoDAO = new candidatoDAO();
    }
    
    public void addCandidato(){
        Candidato candidato = new Candidato(getIdCandidato(), getNombreCandidato(), getApellidoCandidato());
        candidatoDAO.addCandidato(candidato);
    }
    
    public int getIdCandidato() {
        return this.idCandidato;
    }
    
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
    public String getNombreCandidato() {
        return this.nombreCandidato;
    }
    
    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }
    public String getApellidoCandidato() {
        return this.apellidoCandidato;
    }
    
    public void setApellidoCandidato(String apellidoCandidato) {
        this.apellidoCandidato = apellidoCandidato;
    }

}
