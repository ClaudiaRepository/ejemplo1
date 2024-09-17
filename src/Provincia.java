import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class  Provincia {

    private String nombre;
    private Integer poblacion;
    private Double superficie;
    private Pais pais;
    private Set<Ciudad> ciudades = new HashSet<>();
    private Set<Provincia> limitaConProvincias = new HashSet<>();
    private Set<Pais> limitaConPais = new HashSet<>();

    public Provincia(String nombre, Integer poblacion, Double superficie) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        System.out.println("Se creó provincia "+nombre);
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

    public Set<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(Set<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public Set<Provincia> getLimitaConProvincias() {
        return limitaConProvincias;
    }

    public void setLimitaConProvincias(Set<Provincia> limitaConProvincias) {
        this.limitaConProvincias = limitaConProvincias;
    }

    public Set<Pais> getLimitaConPais() {
        return limitaConPais;
    }

    public void setLimitaConPais(Set<Pais> limitaConPais) {
        this.limitaConPais = limitaConPais;
    }

    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }
    public void eliminarCiudades(Ciudad ciudad) {
        ciudades.remove(ciudad);
        System.out.println("Se eliminó la ciudad "+ciudad.getNombre());

    }

    public void mostrarCapitaldeProvincia() {
        System.out.print(" La capital de  "+this.nombre);
        for (Ciudad ciu : ciudades) {
            if (ciu.getEsCapitalDeProvincia())
                System.out.println(" es" + ciu.getNombre());
        }
    }



    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}