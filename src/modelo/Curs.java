/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import utilidades.EnumCurso;

/**
 *
 * @author Vicente
 */
@Entity
@NamedQueries({
@NamedQuery(name= Curs.CONSULTA, query="SELECT c FROM Curs c WHERE c.nombreCurso=:nombreCurso")})
@Table(name="AV_CURSOS")
public class Curs implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Nombre query
    public static final String CONSULTA = "CURSO";
    
    //Atributos
    @Id
    private Long idCurs;
    private EnumCurso nombreCurso;
    @OneToMany(mappedBy="idCurs")
    private List<UnitatFormativa> listaUnidadesFormativas;
    @ManyToOne
    @JoinColumn(name="cicleCurs")
    private Cicle cicleCurs;

    
    //Constructores
    public Curs(Long id, EnumCurso enumCurso, Cicle cicleCurs){
        this.idCurs = id;
        this.nombreCurso = enumCurso;
        this.cicleCurs = cicleCurs;
    }
    
    public Curs(){
        listaUnidadesFormativas = new ArrayList();
            
    }
    
    //Getters & Setters
    public Long getId() {
        return idCurs;
    }

    public void setId(Long id) {
        this.idCurs = id;
    }

    public EnumCurso getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(EnumCurso nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public List<UnitatFormativa> getListaUnidadesFormativas() {
        return listaUnidadesFormativas;
    }

    public void setListaUnidadesFormativas(List<UnitatFormativa> listaUnidadesFormativas) {
        this.listaUnidadesFormativas = listaUnidadesFormativas;
    }

    public Cicle getCicleCurs() {
        return cicleCurs;
    }

    public void setCicleCurs(Cicle cicleCurs) {
        this.cicleCurs = cicleCurs;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.idCurs);
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
        final Curs other = (Curs) obj;
        if (!Objects.equals(this.idCurs, other.idCurs)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Curs[ id=" + idCurs + " nom=" + nombreCurso + " ]";
    }
}
