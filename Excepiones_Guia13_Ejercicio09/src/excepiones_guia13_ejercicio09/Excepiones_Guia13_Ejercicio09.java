/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepiones_guia13_ejercicio09;

/**
 *
 * @author Pablo Demartini
 */
public class Excepiones_Guia13_Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        class C {
        
            void metodoC() throws TuException{
                sentencia_c1
                try {
                    sentencia_c2 
                    sentencia_c3
                } catch (MioException e) {
                    sentencia_c4
                } catch (TuException e) {
                    sentencia_c5
                    throw (e)
                } finally { 
                    sentencia_c6
                }
            }
        }    
    }
}

 /*

a) Si se produce la excepción MioException, las sentencias se ejecutan en el siguiente orden:

sentencia_c1
sentencia_c2
sentencia_c3
sentencia_c4
sentencia_c6
La excepción MioException es capturada por el bloque catch correspondiente y se ejecuta la sentencia_c4. Después de eso, el programa continúa con la sentencia_c6 en el bloque finally.

b) Si no se produce la excepción MioException, las sentencias se ejecutan en el siguiente orden:

sentencia_c1
sentencia_c2
sentencia_c3
sentencia_c6
Como no se produce la excepción MioException, el bloque catch correspondiente no se activa y se ejecuta la sentencia_c6 en el bloque finally.

c) Si se produce la excepción TuException, las sentencias se ejecutan en el siguiente orden:

sentencia_c1
sentencia_c2
sentencia_c3
sentencia_c5
throw (e)
sentencia_c6
La excepción TuException es capturada por el bloque catch correspondiente y se ejecuta la sentencia_c5. Luego se lanza la excepción nuevamente utilizando el statement throw (e). Después de eso, el programa continúa con la sentencia_c6 en el bloque finally.

*/
