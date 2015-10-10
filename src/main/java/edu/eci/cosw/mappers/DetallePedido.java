package edu.eci.cosw.mappers;
// Generated 9/10/2015 03:08:07 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetallesPedido generated by hbm2java
 */
@Entity
@Table(name="DetallesPedido"
    ,catalog="cosw2"
)
public class DetallePedido  implements java.io.Serializable {


     private Integer idDetalle;
     private MedicamentoPorProveedor medicamentosPorProveedor;
     private Pedido pedidos;
     private Integer cantidad;

    public DetallePedido() {
    }

	
    public DetallePedido(MedicamentoPorProveedor medicamentosPorProveedor, Pedido pedidos) {
        this.medicamentosPorProveedor = medicamentosPorProveedor;
        this.pedidos = pedidos;
    }
    public DetallePedido(MedicamentoPorProveedor medicamentosPorProveedor, Pedido pedidos, Integer cantidad) {
       this.medicamentosPorProveedor = medicamentosPorProveedor;
       this.pedidos = pedidos;
       this.cantidad = cantidad;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idDetalle", unique=true, nullable=false)
    public Integer getIdDetalle() {
        return this.idDetalle;
    }
    
    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MedicamentosPorProveedor_idMedicamentosPorProveedor", nullable=false)
    public MedicamentoPorProveedor getMedicamentosPorProveedor() {
        return this.medicamentosPorProveedor;
    }
    
    public void setMedicamentosPorProveedor(MedicamentoPorProveedor medicamentosPorProveedor) {
        this.medicamentosPorProveedor = medicamentosPorProveedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Pedidos_idPedidos", nullable=false)
    public Pedido getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }

    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }




}


