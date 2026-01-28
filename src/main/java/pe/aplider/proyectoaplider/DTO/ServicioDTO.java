package pe.aplider.proyectoaplider.DTO;

import pe.aplider.proyectoaplider.entities.Usuario;

public class ServicioDTO {

    private int id;

    private String servicio;

    private String mes_de_mantenimiento;

    private Usuario usuario;

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
