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
 * @author ALUMNEDAM
 */
@Entity
@Table(name = "AV_FAMILIES")
public class Familia implements Serializable {
    private static final long serialVersionUID = 1L;

    //Atributos
    @Id
    private Long id;
    private String nom;
    private ArrayList<Cicle> cicles;

    //Constructores
    public Familia(Long id, String nom, ArrayList<Cicle> cicles) {
        this.id = id;
        this.nom = nom;
        this.cicles = cicles;
    }
    
    public Familia() {
    }
    
    //Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Cicle> getCicles() {
        return cicles;
    }

    public void setCicles(ArrayList<Cicle> cicles) {
        this.cicles = cicles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.nom);
        hash = 31 * hash + Objects.hashCode(this.cicles);
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
        final Familia other = (Familia) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cicles, other.cicles)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Familia{" + "id=" + id + ", nom=" + nom + ", cicles=" + "nada" + '}';
    }
}
