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

/**
 *
 * @author Vicente
 */
@Entity
@Table(name="AV_MODULS")
public class Modul implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Atributos
    @Id
    private Long id;
    private String nombre;
    private ArrayList<UnitatFormativa> listaUnidadesFormativas;
    
    //Constructores
    public Modul(Long id, String nombre, ArrayList<UnitatFormativa> listaUnidadesFormativas){
        this.id = id;
        this.nombre = nombre;
        this.listaUnidadesFormativas = listaUnidadesFormativas;
    }

    public Modul(){
        
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

    public ArrayList<UnitatFormativa> getListaUnidadesFormativas() {
        return listaUnidadesFormativas;
    }

    public void setListaUnidadesFormativas(ArrayList<UnitatFormativa> listaUnidadesFormativas) {
        this.listaUnidadesFormativas = listaUnidadesFormativas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Modul other = (Modul) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Modul[ id=" + id + " ]";
    }
}
