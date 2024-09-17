import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pais {

    private String nombre;
    private Integer poblacion;
    private Double superficie;

    private Set<Provincia> provincias=new HashSet<>();
    private Set<Pais> limitapaises=new HashSet<>();

    public Pais(String nombre, Integer poblacion, Double superficie) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        System.out.println("Se creó pais "+nombre);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Set<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(Set<Provincia> provincias) {
        this.provincias = provincias;
    }

    public Set<Pais> getLimitapaises() {
        return limitapaises;
    }

    public void setLimitapaises(Set<Pais> limitapaises) {
        this.limitapaises = limitapaises;
    }
    public void agregarProvincia(Provincia provincia){
        this.provincias.add(provincia);
    }
    public void eliminarProvincia(Provincia provincia) {
        provincias.remove(provincia);
        System.out.println("Se eliminó la provincia "+provincia.getNombre());

    }
    public void mostrarCapital() {

    }
}