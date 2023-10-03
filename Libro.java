

public class Libro {
    private String titulo;
    private String autor;
    private int numdePaginas;

    /**
     *
     * @param titulo variable para el titulo del libro
     * @param autor variable para el nombre del autor del libro
     * @param numdePaginas variable para le num de paginas del libro
     */
    public Libro(String titulo, String autor, int numdePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numdePaginas = numdePaginas;
    }

    /**
     * @getandset se usa "get" para poder traer la variable y traer el titulo "en este caso que le hayamos puesto autor,paginas, etc. y el "set" para
     * poder modificar esas variables
     * @return se usa el return "variable" para que retorne al la varibale y que no se vuelva infinito
     * Complejidad O(1) Constante en todo.
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumdePaginas() {
        return numdePaginas;
    }

    public void setNumdePaginas(int numdePaginas) {
        this.numdePaginas = numdePaginas;
    }

}
