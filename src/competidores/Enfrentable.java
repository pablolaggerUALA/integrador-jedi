package competidores;


import java.util.*;

public abstract class Enfrentable {
    protected String nombre;
    protected String nombreFantasia;

    public Enfrentable(String nombre, String nombreFantasia) {
        this.nombre = nombre;
        this.nombreFantasia = nombreFantasia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public Enfrentable enfrentar(Enfrentable e, Comparator c) {
        int ganador = c.compare(this, e);
        if (ganador > 0){
            return this;
        } else if (ganador == 0){
            System.out.println("Hubo empate");
            return null;
        } else
            return e;
    }

    public List<Personaje> ordenar(Comparator c) {
        List<Personaje> personajes = this.getPersonajes();
        personajes.sort(c);
        return personajes;
    }
    public abstract float getValorAtributo(String key);

    public abstract List<Personaje> getPersonajes();


}

