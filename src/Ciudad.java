
public class Ciudad {

    private String nombre;
    private Integer habitantes;
    private Pais esCapitalDePais;
    private Boolean esCapitalDeProvincia;
    private Provincia provincia;


    public Ciudad(String nombre, Integer habitantes, Boolean esCapitalDeProvincia) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.esCapitalDeProvincia = esCapitalDeProvincia;
        System.out.println("Se creó ciudad "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    public Pais getEsCapitalDePais() {
        return esCapitalDePais;
    }

    public void setEsCapitalDePais(Pais esCapitalDePais) {
        this.esCapitalDePais = esCapitalDePais;
        System.out.println(this.nombre+" es capital de "+this.esCapitalDePais.getNombre());
    }

    public Boolean getEsCapitalDeProvincia() {
        return esCapitalDeProvincia;
    }

    public void setEsCapitalDeProvincia(Boolean esCapitalDeProvincia) {
        this.esCapitalDeProvincia = esCapitalDeProvincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public void mostrarCapitales(){

    }
}
