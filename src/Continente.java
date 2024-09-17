import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Continente {

    private String nombre;
    private Set<Pais> paises=new HashSet<>();

    public Continente(String nombre) {
        this.nombre = nombre;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Pais> getPaises() {
        return paises;
    }

    public void setPaises(Set<Pais> paises) {
        this.paises = paises;
    }
 public void agregarPais(Pais pais){
        this.paises.add(pais);
 }
 public void eliminarPais(Pais pais) {
        paises.remove(pais);
        System.out.println("Se eliminó el pais "+pais.getNombre());

    }

}