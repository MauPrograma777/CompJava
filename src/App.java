import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Libro l1 = new Libro();
        l1.setTitulo("100 años de soledad");
        l1.setAutor("Gabriel Garcia Marquez");
        l1.setGenero("Novela");
        l1.setCodigoBarras("00001");

        Libro l2=new Libro("Rowling", 
        "Harry potter y la piedra filosofal",
        "Ciencia ficcion", "00002");

        Libro l3= new Libro("Baldor",
        "Operaciones Aritmeticas", "Educacion", "00003");

        List<Libro> libros = new ArrayList<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);

        System.out.println("\n --MENU--");
        System.out.println("Opcion 1 : Guardar Libro");
        System.out.println("Opcion 2 : Buscar por codigo");
        System.out.println("Opcion 3 : Mostrar todos los libros");
        System.out.println("Opcion 4 : Buscar por genero");
        System.out.println("\n Ingrese una opcion");

        Scanner scanner= new Scanner(System.in);
        int opcion= scanner.nextInt();
        
        if(opcion==1){

        }else if(opcion==2){
            Libro resultado=l1.buscarPorCodigo(libros,  "00002");
            if(resultado!=null){
                System.out.println(resultado.getTitulo());
            }else{
                System.err.println("No se encontro el codigo de barras");
            }
        }else if(opcion==3){

        }else{

        }
            
        


    }
}
