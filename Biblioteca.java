import java.util.LinkedList;
public class Biblioteca {
    /**
     @param titulo titulo del libro
      * @LinkedList sirve para crear una lista en este caso los libros
     */
    LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();
    public void registrarLibro (Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * @for,if,equals para recorrer la lista buscando un titulo igual al que ingresamos
     * Complejidad O(n) Lineal
     */
    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    public LinkedList<Libro> mostrarLibrosDisponibles () {
        return librosDisponibles;
    }

}
