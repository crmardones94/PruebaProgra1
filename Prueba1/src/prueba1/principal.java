/**
 * @author cr.mardones
 * @fecha 14-09-2022
 */
package prueba1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import prueba1.DTO.Usuario;
import prueba1.DTO.Club;
import prueba1.DTO.Suscripcion;
import prueba1.Metodos.Metodo;
public class principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usu = new Usuario();  
         
        int ID=1000;
        //creamos usuario 1    
        usu.setID(ID);
        usu.setPrimerNombre("Cristian");
        usu.setSegundoNombre("Eduardo");
        usu.setApellidoPaterno("Mardones");
        usu.setApellidoMaterno("Perez");        
        usu.setTelefono(56520050);             
        usu.setNombreUsuario("dcog");
        usu.setPassword("Afds22231");
        usu.setEmail("david.cogiolle@gmail.com");
        /*System.out.println("ingrese su rut sin sigito verificador ni punto ni guion");
        int rut = sc.nextInt();
        System.out.println("ingrese su digito verificador");
        String dv = sc.next();*/
        int rut = 18829876;
        String dv = "1";
        boolean valida = Metodo.ValidarDv(String.valueOf(rut),dv);
        if(valida==true){
            usu.setRut(rut);
            usu.setDv(dv);
        }
        else{
            System.out.println("El rut "+rut+" ingresado no es valido");
        }        
        usu.setFechaNacimiento("1994/05/22");  
        ID++;
        
        
        //creamos usuario 2
        Usuario usu2 = new Usuario(); 
        usu2.setID(ID);
        usu2.setPrimerNombre("Cris");
        usu2.setSegundoNombre("Edu");
        usu2.setApellidoPaterno("Mardones");
        usu2.setApellidoMaterno("Perez");        
        usu2.setTelefono(56101010);             
        usu2.setNombreUsuario("ggft");
        usu2.setPassword("G1ovanniGg34");
        usu.setEmail("gerr.adere@live.cl");
        /*System.out.println("ingrese su rut sin sigito verificador ni punto ni guion");
        int rut2 = sc.nextInt();
        System.out.println("ingrese su digito verificador");
        String dv2 = sc.next();*/
        int rut2 = 17417319;
        String dv2 = "2";
        valida = Metodo.ValidarDv(String.valueOf(rut2),dv2);
        if(valida==true){
            usu2.setRut(rut2);
            usu2.setDv(dv2);
        }
        else{
            System.out.println("El rut "+rut2+" ingresado no es valido");
        }        
        usu.setFechaNacimiento("1994/05/22");
        ID++;
        
        
        String Deporte = "Handball";
        //creamos primer club
        Club cl = new Club();        
        int correlativo=11;
        cl.setNombreClub("Arsenal de Coquimbo");
        cl.setCodigo(cl.getNombreClub().substring(0,2).toUpperCase()+Deporte.substring(0,1)+correlativo);
        cl.setFundador("Cristian Mardones");
        cl.setAnioFundado(2000);
        cl.setPais("Chile");
        cl.setLema("Canones a los puertos");
        cl.setValorSuscripcion(10050);
        cl.setColor1("Amarillo");
        cl.setColor2("Rojo");    
        correlativo = correlativo+1;
        
        //creamos Segundo club
        Club cl2 = new Club();
        cl2.setNombreClub("Manquehue City");
        cl2.setCodigo(cl2.getNombreClub().substring(0,2).toUpperCase()+Deporte.substring(0,1)+correlativo);
        cl2.setFundador("Cristian Mardones");
        cl2.setAnioFundado(2007);
        cl2.setPais("Chile");
        cl2.setLema("Vivir y Fuerza");
        cl2.setValorSuscripcion(15100);
        cl2.setColor1("Celeste");
        cl2.setColor2("Blanco");    
        correlativo = correlativo+1;
        
        //creamos tercer club
        Club cl3 = new Club();
        cl3.setNombreClub("Los Cóndores Unidos");
        cl3.setCodigo(cl3.getNombreClub().substring(0,2).toUpperCase()+Deporte.substring(0,1)+correlativo);
        cl3.setFundador("Cristian Mardones");
        cl3.setAnioFundado(2004);
        cl3.setPais("Chile");
        cl3.setLema("Desde lo alto al sol");
        cl3.setValorSuscripcion(13200);
        cl3.setColor1("Amarillo");
        cl3.setColor2("Naranjo");    
        correlativo = correlativo+1;
        
        //creamos subscripcion
        
        int Numero = 1010;        
        //Ingreso suscripcion 1
        Suscripcion sus = new Suscripcion();
        sus.setNumero(Numero);
        String fecha = String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        sus.setFechaInicio(fecha);
        sus.setValorSuscripcion(cl.getValorSuscripcion()+cl2.getValorSuscripcion());
        sus.setAbono(cl.getValorSuscripcion()+cl2.getValorSuscripcion());
        sus.setClub(cl.getCodigo()+" "+cl2.getCodigo());
        sus.setUsuario(usu.getNombreUsuario());
        
        //Ingreso suscripcion 2
        
        Numero = Numero +10;
        Suscripcion sus2 = new Suscripcion();
        sus2.setNumero(Numero);
        fecha = String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        sus2.setFechaInicio(fecha);
        sus2.setValorSuscripcion(cl3.getValorSuscripcion());
        sus2.setAbono(cl3.getValorSuscripcion());
        sus2.setClub(cl3.getCodigo());
        sus2.setUsuario(usu2.getNombreUsuario());
        
         Numero = Numero +10;
        Suscripcion sus3 = new Suscripcion();
        sus3.setNumero(Numero);
        fecha = String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        sus3.setFechaInicio(fecha);
        sus3.setValorSuscripcion(cl2.getValorSuscripcion()+cl3.getValorSuscripcion());
        sus3.setAbono(cl2.getValorSuscripcion()+cl3.getValorSuscripcion());
        sus3.setClub(cl2.getCodigo()+" "+cl3.getCodigo());
        sus3.setUsuario(usu.getNombreUsuario());      
        
        
        System.out.println("Numero: "+sus.getNumero()+"\nUsuario: "+sus.getUsuario()+"\nAbono total: "+sus.getValorSuscripcion()+"\nEquipos: "+sus.getClub());
        
        
        
        
        
        
        
    }
    
}
