/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import utilidades.EnumCurso;

/**
 *
 * @author Vicente
 */
@Entity
@Table(name="AV_CURSOS")
public class Curs implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Atributos
    @Id
    private Long id;
    private EnumCurso enumCurso;
    private ArrayList<UnitatFormativa> listaUnidadesFormativas;

    
    //Constructores
    public Curs(Long id, EnumCurso enumCurso, ArrayList<UnitatFormativa> listaUnidadesFormativas){
        this.id = id;
        this.enumCurso = enumCurso;
        this.listaUnidadesFormativas = listaUnidadesFormativas;
    }
    
    public Curs(){
        
    }
    
    //Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumCurso getEnumCurso() {
        return enumCurso;
    }

    public void setEnumCurso(EnumCurso enumCurso) {
        this.enumCurso = enumCurso;
    }

    public ArrayList<UnitatFormativa> getListaUnidadesFormativas() {
        return listaUnidadesFormativas;
    }

    public void setListaUnidadesFormativas(ArrayList<UnitatFormativa> listaUnidadesFormativas) {
        this.listaUnidadesFormativas = listaUnidadesFormativas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Curs[ id=" + id + " ]";
    }
}
