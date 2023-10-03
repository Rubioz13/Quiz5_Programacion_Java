public class Principal {
    public static void main(String[] args) {
        /**
         * se crean diferente objetos "libro1,2,3,4,5"  y se les asigna ,el titulo autor, y numero de paginas
         * y con el objeto bibliotecaKonradLorenz y registrarLibro se usa para agregarlo a la Biblioteca.
         */
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        Libro libro1= new Libro ("Cienañosdesoledad","Gabriel García Márquez",496);
        Libro libro2= new Libro("El código Da Vinci","Dan Brown",656);
        Libro libro3= new Libro("1984","George Orwell",326);
        Libro libro4= new Libro ("El Hobbit","J.R.R. Tolkien",310);
        Libro libro5= new Libro ("La Odisea","Homero",448);
        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);
    }
}
