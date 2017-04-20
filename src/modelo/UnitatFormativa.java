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
import javax.persistence.Table;

/**
 *
 * @author Vicente
 */
@Entity
@Table(name="AV_UNITATS_FORMATIVES")
public class UnitatFormativa implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Atributos
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name="nombreUnidad")
    private String nombre;
    private int horas;
    
    //Constructores
    public UnitatFormativa(Long id, String nombre, int horas){
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
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
