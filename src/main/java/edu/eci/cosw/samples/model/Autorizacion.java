package edu.eci.cosw.samples.model;
// Generated 9/10/2015 03:08:07 PM by Hibernate Tools 4.3.1


import edu.eci.cosw.samples.model.Medicamento;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Autorizaciones generated by hbm2java
 */
@Entity
@Table(name="Autorizaciones"
    ,catalog="cosw2"
)
public class Autorizacion  implements java.io.Serializable {


     private Integer numero;
     private Epsafilida epsafilidas;
     private Paciente pacientes;
     private Date fechaExpedicion;
     private Date fechaVencimiento;
     private String estado;

    public Autorizacion() {
    }

	
    public Autorizacion(Epsafilida epsafilidas) {
        this.epsafilidas = epsafilidas;
    }
    public Autorizacion(Epsafilida epsafilidas, Date fechaExpedicion, Date fechaVencimiento, String estado) {
       this.epsafilidas = epsafilidas;
       this.fechaExpedicion = fechaExpedicion;
       this.fechaVencimiento = fechaVencimiento;
       this.estado = estado;
    }
   
   
     @Id @GeneratedValue(strategy=IDENTITY)

    @Column(name="numero", unique=true, nullable=false)
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="Paciente_idPacientes", nullable=false)
    public Paciente getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EPSAfilidas_idEPS", nullable=false)
    public Epsafilida getEpsafilidas() {
        return this.epsafilidas;
    }
    
    public void setEpsafilidas(Epsafilida epsafilidas) {
        this.epsafilidas = epsafilidas;
    }

    
    
    
    
    
    @Temporal(TemporalType.DATE)
    @Column(name="fechaExpedicion", length=10)
    public Date getFechaExpedicion() {
        return this.fechaExpedicion;
    }
    
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaVencimiento", length=10)
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Column(name="estado", length=45)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado1) {
        this.estado = estado1;
    }
}


