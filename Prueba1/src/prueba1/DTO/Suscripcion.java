/**
 * @author cr.mardones
 * @fecha 14-09-2022
 */
package prueba1.DTO;
import java.util.Date;
import java.time.LocalDateTime;
public class Suscripcion {
    private int Numero;
    private String FechaInicio;
    private int ValorSuscripcion;
    private int Abono;
    private String Club;
    private String Usuario;

    public Suscripcion() {
        this.FechaInicio = "";
        this.ValorSuscripcion = 0;
        this.Abono = 0;
        this.Club = "";
        this.Usuario = "";
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public int getAbono() {
        return Abono;
    }

    public void setAbono(int Abono) {
        this.Abono = Abono;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String Club) {
        this.Club = Club;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    
}
