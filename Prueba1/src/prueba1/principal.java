/**
 * @author cr.mardones
 * @fecha 14-09-2022
 */
package prueba1;
import java.util.Scanner;
import prueba1.DTO.Usuario;
import prueba1.DTO.Club;
import prueba1.DTO.Suscripcion;
import prueba1.Metodos.Metodo;
public class principal {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usu = new Usuario();  
        //Ingresamos nombre de usuario
        usu.setNombreUsuario("dcog");
        //ingresamos password
        usu.setPassword("qWerty1"); 
        
        //ingresamos rut
        System.out.println("ingrese su rut sin sigito verificador ni punto ni guion");
        int rut = sc.nextInt();
        //ingresamos numero verificador
        System.out.println("ingrese su digito verificador");
        String dv = sc.next();
        //usamos metodo para validar rut
        boolean valida = Metodo.ValidarDv(String.valueOf(rut),dv);
        if(valida==true){
            usu.setRut(rut);
            usu.setDv(dv);
        }
        else{
            System.out.println("El rut ingresado no es valido");
        }
        
        usu.setFechaNacimiento("1994/05/22");
        
        System.out.println(usu.getFechaNacimiento());
        
        
        
        
        
        
        
    }
    
}
