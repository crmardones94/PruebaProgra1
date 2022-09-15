/**
 * @author cr.mardones
 * @fecha 14-09-2022
 */
package prueba1.Metodos;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Metodo {
    
    public static boolean ValidaPassword(String pass){
        boolean validaMayu = false;
        boolean validaNum = false;
        if(pass.length()>5){
            for(int x=0;x<pass.length();x++){
                if(!Character.isUpperCase(pass.charAt(x))){
                    validaMayu = true;
                }            
                else if(!Character.isDigit(pass.charAt(x))){
                    validaNum = true;
                }
            }
            if(validaMayu==true && validaNum==true){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }       
    }
    
    public static boolean ValidaEdad(Date fechaNac){
        
        Date fec = new Date();
        String fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(fec);
        
        
        
        
        return false;
    }
}
