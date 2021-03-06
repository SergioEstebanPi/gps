package entity;
// Generated 12-ene-2018 9:51:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Candidato generated by hbm2java
 */
public class Candidato  implements java.io.Serializable {


     private int idCandidato;
     private String nombreCandidato;
     private String apellidoCandidato;
     private Set<Votacion> votacions = new HashSet<Votacion>(0);

    public Candidato() {
    }
    
	
    public Candidato(int idCandidato, String nombreCandidato, String apellidoCandidato) {
        this.idCandidato = idCandidato;
        this.nombreCandidato = nombreCandidato;
        this.apellidoCandidato = apellidoCandidato;
    }
    public Candidato(int idCandidato, String nombreCandidato, String apellidoCandidato, Set<Votacion> votacions) {
       this.idCandidato = idCandidato;
       this.nombreCandidato = nombreCandidato;
       this.apellidoCandidato = apellidoCandidato;
       this.votacions = votacions;
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
    public Set<Votacion> getVotacions() {
        return this.votacions;
    }
    
    public void setVotacions(Set<Votacion> votacions) {
        this.votacions = votacions;
    }




}


