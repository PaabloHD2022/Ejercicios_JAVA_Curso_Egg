
package servicios;

import entidades.Editorial;
import java.util.Scanner;
import persistencia.Controladora;

public class EditorialServicio {
    Scanner leer = new Scanner(System.in);
    Editorial editorial = new Editorial();
    Controladora control = new Controladora();

    public Editorial crearEditorial() {
        System.out.println("-------------CREAR EDITORIAL------------\n");
        System.out.println("Ingrese el nombre de la Editorial: ");
        editorial.setNombre(leer.nextLine());
        editorial.setAlta(true);
        control.crearEditorial(editorial);
        return editorial;
    }
    
}
