package backend.project.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
@Entity
@Table(name = "reclutadores")
public class Reclutador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Descripcion_Reclutador",length = 200,nullable = false)
    private String Descripcion_Reclutador;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Empresa_id")
    private Empresa empresa;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "User_id")
    private User user;

    public Reclutador(){}

    public Reclutador(int id, String descripcion_Reclutador, Empresa empresa, User user) {
        this.id = id;
        this.Descripcion_Reclutador = descripcion_Reclutador;
        this.empresa = empresa;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_Reclutador() {
        return Descripcion_Reclutador;
    }

    public void setDescripcion_Reclutador(String descripcion_Reclutador) {
        Descripcion_Reclutador = descripcion_Reclutador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

/*
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "reclutadores")
public class Reclutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Descripcion_Reclutador",length = 200,nullable = false)
    private String Descripcion_Reclutador;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Empresa_id")
    private Empresa empresa;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Usuario_id")
    private Usuario usuario;

    public Reclutador(){

    }

    public Reclutador(int id, String descripcion_Reclutador, Empresa empresa, Usuario usuario) {
        this.id = id;
        this.Descripcion_Reclutador = descripcion_Reclutador;
        this.empresa = empresa;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_Reclutador() {
        return Descripcion_Reclutador;
    }

    public void setDescripcion_Reclutador(String descripcion_Reclutador) {
        Descripcion_Reclutador = descripcion_Reclutador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

 */