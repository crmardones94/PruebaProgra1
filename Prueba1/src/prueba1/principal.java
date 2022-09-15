/**
 * @author cr.mardones
 * @fecha 14-09-2022
 */
package prueba1;
import java.text.SimpleDateFormat;
import prueba1.DTO.Usuario;
import prueba1.DTO.Club;
import prueba1.DTO.Suscripcion;
import java.util.Date;
public class principal {
   
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Usuario usu = new Usuario();        
        usu.setPassword("qWerty1");
        Date fechanac = new Date("22/05/2022");
        System.out.println(fechanac);
        
        
    }
    
}
