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
        System.out.println("Opcion 5 : Salir");
        System.out.println("\n Ingrese una opcion: ");

        Scanner scanner= new Scanner(System.in);
        int opcion= scanner.nextInt();
        scanner.nextLine();
        
        if(opcion==1){

            System.out.println("Ingrese el título del libro:");
                String titulo = scanner.nextLine();

                System.out.println("Ingrese el autor del libro:");
                String autor = scanner.nextLine();

                System.out.println("Ingrese el género del libro:");
                String genero = scanner.nextLine();

                System.out.println("Ingrese el código de barras:");
                String codigoBarras = scanner.nextLine();

                libros.add(new Libro(autor, titulo, genero, codigoBarras));

        }else if(opcion==2){
            System.out.println("Ingresa el codigo de barras: ");
            
            String codigoIngresado = scanner.next();

            Libro resultado=l1.buscarPorCodigo(libros,  codigoIngresado);

            if(resultado!=null){
                System.out.println("-" + resultado.getTitulo() + " de " + resultado.getAutor());
            }else{
                System.err.println("No hay libros disponibles con el codigo de barras: " + "\"" + codigoIngresado + "\"");
            }
        }else if(opcion==3){

            System.out.println("\nLista de todos los libros:");
            l1.mostrarTodos(libros);
            System.out.println("\n");

        
    
        } else if (opcion == 4) {
            System.out.println("Opción 1 : Buscar género");
            System.out.println("Opción 2 : Desplegar lista de géneros.");
            System.out.print("\nIngrese una opción: ");

            int seleccionadorGenero = scanner.nextInt();
            scanner.nextLine();

            if (seleccionadorGenero == 1) {
                System.out.print("Teclea el género deseado: ");
                String generoTecleado = scanner.nextLine();

                List<Libro> resultado = l1.buscarporGenero(libros, generoTecleado);

                if (!resultado.isEmpty()) { 
                    System.out.println("\nLibros encontrados en el género '" + generoTecleado + "':");
                    for (Libro libro : resultado) {
                        System.out.println("- " + libro.getTitulo() + " de " + libro.getAutor());
                    }
                } else {
                    System.err.println("No hay libros disponibles con el género: \"" + generoTecleado + "\"");
                }

            } else if (seleccionadorGenero == 2) {
                System.out.println("Seleccione el género que deseas:");

                List<String> listaGeneros = new ArrayList<>(Libro.obtenerGenerosUnicos(libros));

                for (int i = 0; i < listaGeneros.size(); i++) {
                    System.out.println((i + 1) + ". " + listaGeneros.get(i));
                }

                System.out.print("\nIngrese el número del género deseado: ");
                int opcionGenero = scanner.nextInt();

                if (opcionGenero < 1 || opcionGenero > listaGeneros.size()) {
                    System.out.println("Opción no válida.");
                } else {
                    String generoSeleccionado = listaGeneros.get(opcionGenero - 1);

                    List<Libro> librosEncontrados = l1.buscarporGenero(libros, generoSeleccionado);
                    System.out.println("\nLibros encontrados en el género:" + "\"" + generoSeleccionado + "\"");
                        for (Libro libro : librosEncontrados) {
                            System.out.println("- " + libro.getTitulo() + " de " + libro.getAutor());
                        }
                }
            }

        }else if (opcion==5){
            System.out.println("Usted ha salido del programa.");
            System.exit(0);

        }else{
            System.out.println("La opción seleccionada no es valida.");
        }
        



    }
    
}