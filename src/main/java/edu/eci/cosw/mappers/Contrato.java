package edu.eci.cosw.mappers;
// Generated 9/10/2015 03:08:07 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contratos generated by hbm2java
 */
@Entity
@Table(name="Contratos"
    ,catalog="cosw2"
)
public class Contrato  implements java.io.Serializable {


     private int idContratos;
     private Epsafilida epsafilidas;
     private String descripcion;
     private Integer numeroAfiliados;
     private Integer precioPorAfiliado;

    public Contrato() {
    }

	
    public Contrato(int idContratos, Epsafilida epsafilidas) {
        this.idContratos = idContratos;
        this.epsafilidas = epsafilidas;
    }
    public Contrato(int idContratos, Epsafilida epsafilidas, String descripcion, Integer numeroAfiliados, Integer precioPorAfiliado) {
       this.idContratos = idContratos;
       this.epsafilidas = epsafilidas;
       this.descripcion = descripcion;
       this.numeroAfiliados = numeroAfiliados;
       this.precioPorAfiliado = precioPorAfiliado;
    }
   
     @Id 

    
    @Column(name="idContratos", unique=true, nullable=false)
    public int getIdContratos() {
        return this.idContratos;
    }
    
    public void setIdContratos(int idContratos) {
        this.idContratos = idContratos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EPSAfilidas_idEPS", nullable=false)
    public Epsafilida getEpsafilidas() {
        return this.epsafilidas;
    }
    
    public void setEpsafilidas(Epsafilida epsafilidas) {
        this.epsafilidas = epsafilidas;
    }

    
    @Column(name="descripcion", length=200)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="NumeroAfiliados")
    public Integer getNumeroAfiliados() {
        return this.numeroAfiliados;
    }
    
    public void setNumeroAfiliados(Integer numeroAfiliados) {
        this.numeroAfiliados = numeroAfiliados;
    }

    
    @Column(name="precioPorAfiliado")
    public Integer getPrecioPorAfiliado() {
        return this.precioPorAfiliado;
    }
    
    public void setPrecioPorAfiliado(Integer precioPorAfiliado) {
        this.precioPorAfiliado = precioPorAfiliado;
    }




}


