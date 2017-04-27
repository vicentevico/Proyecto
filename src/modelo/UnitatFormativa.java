/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Vicente
 */
@Entity
@NamedQueries({
@NamedQuery(name= UnitatFormativa.CONSULTA, query="SELECT c FROM UnitatFormativa c WHERE c.nomUnitatFormativa=:nomUnitatFormativa")})
@Table(name="AV_UNITATS_FORMATIVES")
public class UnitatFormativa implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Nombre query
    public static final String CONSULTA = "UF_PER_NOM";
    //Atributos
    @Id
    private Long id;
    private String nomUnitatFormativa;
    private int horas;
    
    @ManyToOne
    @JoinColumn(name="idCurs")
    private Curs idCurs;
    @ManyToOne
    @JoinColumn(name="idModul")
    private Modul idModul;
    @ManyToOne
    @JoinColumn(name="idMatricula")
    private Matricula idMatricula;
    
    //Constructores
    public UnitatFormativa(Long id, String nombreUnitatFormativa, int horas, Curs idCurs, Modul idModul, Matricula idMatricula){
        this.id = id;
        this.nomUnitatFormativa = nombreUnitatFormativa;
        this.horas = horas;
        this.idCurs = idCurs;
        this.idModul = idModul;
        this.idMatricula = idMatricula;
    }
    
    public UnitatFormativa(){
        
    }
    
    //Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomUnitatFormativa() {
        return nomUnitatFormativa;
    }

    public void setNomUnitatFormativa(String nomUnitatFormativa) {
        this.nomUnitatFormativa = nomUnitatFormativa;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public Modul getIdModul() {
        return idModul;
    }

    public void setIdModul(Modul idModul) {
        this.idModul = idModul;
    }

    public Curs getIdCurs() {
        return idCurs;
    }

    public void setIdCurs(Curs idCurs) {
        this.idCurs = idCurs;
    }

    public Matricula getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Matricula idMatricula) {
        this.idMatricula = idMatricula;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnitatFormativa other = (UnitatFormativa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "modelo.UnitatFormativa[ id=" + id + " ]";
    }
}
