package com.springboot.backend.normcontback2.normcontback2.normcontback2.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="rol")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    @Column(name = "cod_rol")
    private String codRol;

    @Column(name = "desc_rol")
    private String desRol;

    @Column(name = "estado")
    private String estado;

    @JsonIgnoreProperties({"roles", "handler", "hibernateLazyInitializer"})
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role() {
        this.users = new ArrayList<>();
    }

    

    public Integer getIdRol() {
        return idRol;
    }



    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }



    public String getCodRol() {
        return codRol;
    }



    public void setCodRol(String codRol) {
        this.codRol = codRol;
    }



    public String getDesRol() {
        return desRol;
    }



    public void setDesRol(String desRol) {
        this.desRol = desRol;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idRol == null) ? 0 : idRol.hashCode());
        result = prime * result + ((codRol == null) ? 0 : codRol.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Role other = (Role) obj;
        if (idRol == null) {
            if (other.idRol != null)
                return false;
        } else if (!idRol.equals(other.idRol))
            return false;
        if (codRol == null) {
            if (other.codRol != null)
                return false;
        } else if (!codRol.equals(other.codRol))
            return false;
        return true;
    }
    
}
