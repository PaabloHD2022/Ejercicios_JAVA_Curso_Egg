
package entidad;

import java.util.Date;

/**Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, 
 * la nacionalidad y su fecha de nacimiento. 
 * La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA solamente.
 *
 * @author Pablo Demartini
 */
public class Alumno {
    
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer diaNac;
    private Integer mesNac;
    private Integer anioNac;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String nacionalidad, Integer diaNac, Integer mesNac, Integer anioNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anioNac = anioNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(Integer diaNac) {
        this.diaNac = diaNac;
    }

    public Integer getMesNac() {
        return mesNac;
    }

    public void setMesNac(Integer mesNac) {
        this.mesNac = mesNac;
    }

    public Integer getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(Integer anioNac) {
        this.anioNac = anioNac;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", diaNac=" + diaNac + ", mesNac=" + mesNac + ", anioNac=" + anioNac + '}';
    }
    
}
