/*
2. Crea una clase Libro con los métodos Titulo, Autor, numPaginas, Precio y 
añoPublicacion. La clase contendrá un constructor por defecto, un constructor 
con parámetros y los métodos getters y setters. Crea un menú que permita añadir 
libros nuevos. El programa guardarà todos los objetos cuando se seleccione la 
opción salir del menú. Cuando se ejecute el programa cargarà todos los objetos 
guardados para volver al estado en el que se dejò el programa. Una opción del 
menú será mostrar todos los libros actuales con su información.
 */
package serializable2;

public class Libro {
    
    protected String Titulo;
    protected String Autor;
    protected int numPaginas;
    protected float Precio;
    protected int anyoPublicacion;
    
    public Libro(){
        
    }
    public Libro(String tit, String nombre, int paginas){
        Titulo = tit;
        Autor = nombre;
        numPaginas = paginas;
    }
    
    public void setTitulo(String tit){
        
        Titulo = tit;
    }
    public void setAutor(String nombre){
        
        Autor = nombre;
    }
    public void setNumPaginas(int paginas){
        
        numPaginas = paginas;
    }
    public void setPrecio(float precio){
        
        Precio = precio;
    }
    public void setAnyo(int anyo){
        
        anyoPublicacion = anyo;
    }
    
    public String getTitulo(){
        
        return Titulo;
    }
    public String getAutor(){
        
        return Autor;
    }
    public int getPaginas(){
        
        return numPaginas;
    }
    public float getPrecio(){
        
        return Precio;
    }
    public int getAnyo(){
        
        return anyoPublicacion;
    }
}
