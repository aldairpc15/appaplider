package pe.aplider.proyectoaplider.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "servicio", length = 50, nullable = false)
    private String servicio;

    @Column(name = "mes_de_mantenimiento", length = 50, nullable = false)
    private String mes_de_mantenimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Servicio() {
    }

    public Servicio(int id, String servicio, String mes_de_mantenimiento, Usuario usuario) {
        this.id = id;
        this.servicio = servicio;
        this.mes_de_mantenimiento = mes_de_mantenimiento;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getMes_de_mantenimiento() {
        return mes_de_mantenimiento;
    }

    public void setMes_de_mantenimiento(String mes_de_mantenimiento) {
        this.mes_de_mantenimiento = mes_de_mantenimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
