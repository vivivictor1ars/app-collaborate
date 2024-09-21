package backend.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Puesto_Trabajos")
public class Puesto_Trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Habilidad_id")
    private Habilidad habilidad;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Reclutador_id")
    private Reclutador reclutador;

    public Puesto_Trabajo(){

    }

    public Puesto_Trabajo(int id, Habilidad habilidad, Reclutador reclutador) {
        this.id = id;
        this.habilidad = habilidad;
        this.reclutador = reclutador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }
}

/*
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Puesto_Trabajos")
public class Puesto_Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Requisito_id")
    private Requisito requisito;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Reclutador_id")
    private Reclutador reclutador;

    public Puesto_Trabajo(){

    }

    public Puesto_Trabajo(int id, Requisito requisito, Reclutador reclutador) {
        this.id = id;
        this.requisito = requisito;
        this.reclutador = reclutador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }
}

 */