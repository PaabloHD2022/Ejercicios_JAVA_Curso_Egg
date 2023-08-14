
package entidades;

/**Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. 


 *
 * @author Pablo Demartini
 */
public class Cadena {
    private String frase;
    private int longFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longFrase=" + longFrase + '}';
    } 
}
