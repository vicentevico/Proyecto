/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import utilidades.EnumDescompte;
import utilidades.EnumModalidad;

/**
 *
 * @author ALUMNEDAM
 */
@Entity
@NamedQueries({
@NamedQuery(name= Matricula.CONSULTA_MATRICULA, query="SELECT m FROM Matricula m WHERE m.alumne.nif=:nif")})
@Table(name = "AV_MATRICULES")
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public static final String CONSULTA_MATRICULA = "buscar_per_alumne";

    @Id
    private Long idM;
    
    @OneToOne
    @JoinColumn(name="idAlum")
    private Alumne alumne;
    private String data;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="idMatricula")
    private List<UnitatFormativa> unitatsFormatives;
    private EnumModalidad modalitat;
    private EnumDescompte descompte;
    
    @Embedded
    private Import importMatricula;
    
    

    public Matricula(Long id, Alumne alumne, String data, EnumModalidad modalitat, EnumDescompte descompte, Import importMatricula) {
        this.idM = id;
        this.alumne = alumne;
        this.data = data;
        this.modalitat = modalitat;
        this.descompte = descompte;
        this.importMatricula = importMatricula;
    }

    public Matricula() {
    }

    public Long getId() {
        return idM;
    }

    public void setId(Long id) {
        this.idM = id;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<UnitatFormativa> getUnitatsFormatives() {
        return unitatsFormatives;
    }

    public void setUnitatsFormatives(List<UnitatFormativa> unitatsFormatives) {
        this.unitatsFormatives = unitatsFormatives;
    }

    public EnumModalidad getModalitat() {
        return modalitat;
    }

    public void setModalitat(EnumModalidad modalitat) {
        this.modalitat = modalitat;
    }

    public EnumDescompte getDescompte() {
        return descompte;
    }

    public void setDescompte(EnumDescompte descompte) {
        this.descompte = descompte;
    }

    public Import getImportMatricula() {
        return importMatricula;
    }

    public void setImportMatricula(Import importMatricula) {
        this.importMatricula = importMatricula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idM);
        hash = 53 * hash + Objects.hashCode(this.alumne);
        hash = 53 * hash + Objects.hashCode(this.data);
        hash = 53 * hash + Objects.hashCode(this.unitatsFormatives);
        hash = 53 * hash + Objects.hashCode(this.modalitat);
        hash = 53 * hash + Objects.hashCode(this.descompte);
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
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.idM, other.idM)) {
            return false;
        }
        if (!Objects.equals(this.alumne, other.alumne)) {
            return false;
        }
        if (!Objects.equals(this.unitatsFormatives, other.unitatsFormatives)) {
            return false;
        }
        if (this.modalitat != other.modalitat) {
            return false;
        }
        if (this.descompte != other.descompte) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matricula{" + "id=" + idM + ", alumne=" + alumne + ", data=" + data + ", unitatsFormatives=" + unitatsFormatives + ", modalitat=" + modalitat + ", descompte=" + descompte + '}';
    }
    
    
    
}
