
public class Principal {

    public static void main(String[] args) {

        System.out.println("Creando objetos ");
        System.out.println("--------------------------------------------------");
        //Creación de Continentes
        Continente c1 = new Continente("America ");
        Continente c2 = new Continente("Oceanía");

        //Crear y agregar  países
        Pais p1 = new Pais("Argentina",47,3.5);
        Pais p2 = new Pais("Australia",26,7.73);

        //----Agregando paises---
        c1.agregarPais(p1);
        c2.agregarPais(p2);

        //Crear y agregar provincias a los países
        Provincia prov1 = new Provincia("Mendoza",2,149.06);
        p1.agregarProvincia(prov1);
        Provincia provO1 = new Provincia("Nueva Gales del Sur",7,809.1);
        p2.agregarProvincia(provO1);

        //Crear y agregar ciudades a las provincias
        Ciudad ciu1 = new Ciudad("Mendoza",   200,true);
        Ciudad ciu2 = new Ciudad("San Martín",   50,false);
        Ciudad ciu3 = new Ciudad("Mundo Nuevo",   12,false);
        Ciudad ciu5 = new Ciudad("Buenos Aires",3,false);
        Ciudad ciO1 = new Ciudad("Sidney",5,false);
        prov1.agregarCiudad(ciu1);
        prov1.agregarCiudad(ciu2);
        prov1.agregarCiudad(ciu3);
         System.out.println("---------------------------------");
         System.out.println("Eliminando objetos ");

         //Borrar algún continente, país , provincia y ciudad
          provO1.eliminarCiudades(ciO1);
          p2.eliminarProvincia(provO1);
          c2.eliminarPais(p2);
          provO1 = null;
          p2=null;
          c2= null;
          System.gc();
        System.out.println("---------------------------------");
        //Mostrar capitales de provincias y capitales de países.
          // Primero agrego capital de pais
        ciu5.setEsCapitalDePais(p1);
        prov1.mostrarCapitaldeProvincia();


    }

}