/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
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

/**
 *
 * @author ALUMNEDAM
 */
@Entity
@NamedQueries({
@NamedQuery(name= Alumne.CONSULTA_NOM, query="SELECT c FROM Cicle c WHERE c.moduls=:modul")})
@Table(name = "AV_CICLES")
public class Cicle implements Serializable {
    private static final long serialVersionUID = 1L;

    //Atributos
    @Id
    private Long id;
    private String nom;
    private String grau;
    
    @OneToMany(mappedBy="cicleModul")
    private List<Modul> moduls;
    @OneToMany(mappedBy="cicleCurs")
    private List<Curs> cursos;
    
    @ManyToOne
    @JoinColumn(name = "familia")
    private Familia familiaCicle;

    //Constuctores
    public Cicle(Long id, String nom, String grau, Familia familiaCicle) {
        this.id = id;
        this.nom = nom;
        this.grau = grau;
        this.familiaCicle = familiaCicle;
    }

    public Cicle() {
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

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public List<Modul> getModuls() {
        return moduls;
    }

    public void setModuls(List<Modul> moduls) {
        this.moduls = moduls;
    }

    public List<Curs> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curs> cursos) {
        this.cursos = cursos;
    }

    public Familia getFamiliaCicle() {
        return familiaCicle;
    }

    public void setFamiliaCicle(Familia familiaCicle) {
        this.familiaCicle = familiaCicle;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.nom);
        hash = 53 * hash + Objects.hashCode(this.grau);
        hash = 53 * hash + Objects.hashCode(this.moduls);
        hash = 53 * hash + Objects.hashCode(this.cursos);
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
        final Cicle other = (Cicle) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.grau, other.grau)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.moduls, other.moduls)) {
            return false;
        }
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Cicle{" + "id=" + id + ", nom=" + nom + ", grau=" + grau + ", moduls=" + "modulos" + ", cursos=" + "cursos" + '}';
    }    
}
