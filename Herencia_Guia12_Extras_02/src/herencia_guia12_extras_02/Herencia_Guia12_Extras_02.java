
package herencia_guia12_extras_02;

import entidad.Edificio;
import java.util.ArrayList;
import servicio.EdificioDeOficinasServicio;
import servicio.PolideportivoServicio;

/**
 *
 * @author Pablo Demartini
 */
public class Herencia_Guia12_Extras_02 {

    public static void main(String[] args) {
        
        ArrayList<Edificio> edificio = new ArrayList<>();
        
        EdificioDeOficinasServicio ed1 = new EdificioDeOficinasServicio();
        EdificioDeOficinasServicio ed2 = new EdificioDeOficinasServicio();
               
        ed1.crearEdificioOficina();
        ed1.cantidadPersonas();
        edificio.add(ed1);
        ed2.crearEdificioOficina();
        ed2.cantidadPersonas();
        edificio.add(ed2);
        
        PolideportivoServicio pol1 = new PolideportivoServicio();
        PolideportivoServicio pol2 = new PolideportivoServicio(); 
        
        pol1.crearPolideportivo();
        edificio.add(pol1);
        pol2.crearPolideportivo();
        edificio.add(pol2);
        
        for (Edificio edificio1 : edificio) {
            edificio1.calcularSuperficie();
            edificio1.calcularVolumen();            
            
        }
        
    }
    
}
