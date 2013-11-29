/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author francisco
 */
@Entity
@Table(name="autor")
public class Autor {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idAutor;
    private String nombres;
    @Column(name="apepaterno")
    private String apePaterno;
    @Column(name="apematerno")
    private String apeMaterno;

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nombres=" + nombres + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + '}';
    }
    
}
