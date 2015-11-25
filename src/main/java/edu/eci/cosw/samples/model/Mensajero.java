package edu.eci.cosw.samples.model;
// Generated 9/10/2015 03:08:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Mensajeros generated by hbm2java
 */
@Entity
@Table(name="Mensajeros"
)
public class Mensajero  implements java.io.Serializable {


     private int idEmpleados;
     private String nombre;
     private String cargo;
     private Integer salario;
     private Integer telefono;
     private String direccion;
     private String correo;
     private Set<Despacho> despachoses = new HashSet<Despacho>(0);

    public Mensajero() {
    }

	
    public Mensajero(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }
    public Mensajero(int idEmpleados, String nombre, String cargo, Integer salario, Integer telefono, String direccion, String correo, Set<Despacho> despachoses) {
       this.idEmpleados = idEmpleados;
       this.nombre = nombre;
       this.cargo = cargo;
       this.salario = salario;
       this.telefono = telefono;
       this.direccion = direccion;
       this.correo = correo;
       this.despachoses = despachoses;
    }
   
     @Id 

    
    @Column(name="idEmpleados", unique=true, nullable=false)
    public int getIdEmpleados() {
        return this.idEmpleados;
    }
    
    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="cargo", length=45)
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    @Column(name="salario")
    public Integer getSalario() {
        return this.salario;
    }
    
    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    
    @Column(name="telefono")
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="direccion", length=45)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="correo", length=45)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mensajeros")
    public Set<Despacho> getDespachoses() {
        return this.despachoses;
    }
    
    public void setDespachoses(Set<Despacho> despachoses) {
        this.despachoses = despachoses;
    }




}


