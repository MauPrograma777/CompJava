import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Libro{
    private String autor;
    private String titulo;
    private String genero;
    private String codigoBarras;
    public String getAutor(){
        return autor;
        
    }
    public Libro() {
    }
    
    public Libro(String autor, String titulo, String genero, String codigoBarras) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.codigoBarras = codigoBarras;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    public Libro buscarPorCodigo(List<Libro> libros, String codigoBarras){
        for(int i=0;i<libros.size();i++){
            if (libros.get(i).getCodigoBarras().equals(codigoBarras)) {

                return libros.get(i);
            }
        }
        return null;
    }


    public void mostrarTodos(List<Libro> libros){
        for (Libro libro : libros){
            System.out.println("Nombre: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Genero: " + libro.getGenero());
            System.out.println("Codigo de Barras: " + libro.getCodigoBarras());
        
        }
    }

    public List<Libro> buscarporGenero (List<Libro> libros, String genero){
        List<Libro> librosEncontrados=new ArrayList<>();
        for(int i=0;i<libros.size();i++){
            if (libros.get(i).getGenero().equals(genero)) {
                librosEncontrados.add(libros.get(i));
            }
        }
        return librosEncontrados;
    }

    public static Set<String> obtenerGenerosUnicos(List<Libro> libros) {
        Set<String> generos = new HashSet<>();
        for (Libro libro : libros) {
            generos.add(libro.getGenero());
        }
        return generos;
    }


}