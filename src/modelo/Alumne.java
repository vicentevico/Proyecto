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
import javax.persistence.Table;

/**
 *
 * @author ALUMNEDAM
 */
@Entity
@Table(name = "AV_ALUMNES")
public class Alumne implements Serializable {
    private static final long serialVersionUID = 1L;

    //Atributos
    @Id
    private String nif;
    private String nom;
    private String cognom;
    private String correu;
    private int telefon;

    //Constructores
    public Alumne(String nif, String nom, String cognom, String correu, int telefon) {
        this.nif = nif;
        this.nom = nom;
        this.cognom = cognom;
        this.correu = correu;
        this.telefon = telefon;
    }
    
    public Alumne(){
    }

    //Getters & Setters
    public String getId() {
        return nif;
    }

    public void setId(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getCorreu() {
        return correu;
    }

    public int getTelefon() {
        return telefon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nif);
        hash = 11 * hash + Objects.hashCode(this.nom);
        hash = 11 * hash + Objects.hashCode(this.cognom);
        hash = 11 * hash + Objects.hashCode(this.correu);
        hash = 11 * hash + this.telefon;
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
        final Alumne other = (Alumne) obj;
        if (this.telefon != other.telefon) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.cognom, other.cognom)) {
            return false;
        }
        if (!Objects.equals(this.correu, other.correu)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Alumne{" + "nif=" + nif + ", nom=" + nom + ", cognom=" + cognom + ", correu=" + correu + ", telefon=" + telefon + '}';
    }
}
