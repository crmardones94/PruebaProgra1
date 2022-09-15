/**
 * @author cr.mardones
 * @fecha 14-09-2022
 */
package prueba1.DTO;
import java.util.Date;
import prueba1.Metodos.Metodo;
public class Usuario {
    private int ID;
    private String PrimerNombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int Rut;
    private String Dv;
    private Date FechaNacimiento;
    private int Telefono;
    private String NombreUsuario;
    private String Email;
    private String Password;   

    public Usuario() {
        this.ID = 0;
        this.PrimerNombre = "";
        this.SegundoNombre = "";
        this.ApellidoPaterno = "";
        this.ApellidoMaterno = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNacimiento = new Date();
        this.Telefono = 0;
        this.NombreUsuario = "";
        this.Email = "";
        this.Password = "";
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        if(PrimerNombre.length()>4){
            this.PrimerNombre = PrimerNombre;
        }
        else{
            System.out.println("Nombre no valida debe tener al menos 4 caracteres");
        }
            
    }

    public String getSegundoNombre() {
        
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        if(PrimerNombre.length()>4){
            this.ApellidoMaterno = ApellidoMaterno;
        }
        else{
            System.out.println("Apellido no validado debe tener al menos 4 caracteres");
        }
        
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getEmail() {
        
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@") && (Email.contains(".com") || Email.contains(".cl")) && Email.length()>4){
            this.Email = Email;
        }
        else{
            System.out.println("El correo debe contener un @ y el .com ademas, debe tener al menos 4 caracteres");
        }
        
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        Metodo met = new Metodo();
        if(met.ValidaPassword(Password)){
            this.Password = Password;
            System.out.println("Password valida");
        }
        else{
            System.out.println("Password ingresada no valida");
        }
        
        
    }
    
    
    
}
