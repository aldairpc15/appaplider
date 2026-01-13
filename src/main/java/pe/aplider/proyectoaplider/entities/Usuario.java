package pe.aplider.proyectoaplider.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 20, nullable = false)
    private String apellido;

    @Column(name = "correo", length = 30, nullable = false)
    private String correo;

    @Column(name = "telefono", length = 9, nullable = false)
    private String telefono;

    @Column(name = "cargo", length = 20, nullable = false)
    private String cargo;

    @Column(name = "ruc", length = 20, nullable = false)
    private String ruc;

    @Column(name = "empresa", length = 30, nullable = false)
    private String empresa;

    @Column(name = "estado", length = 15 , nullable = false)
    private String estado;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Servicio> servicios;

    public Usuario() {
    }

    public Usuario(int id, String apellido, String nombre, String correo, String telefono, String cargo, String ruc, String empresa, String estado, List<Servicio> servicios) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.ruc = ruc;
        this.empresa = empresa;
        this.estado = estado;
        this.servicios = servicios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}

