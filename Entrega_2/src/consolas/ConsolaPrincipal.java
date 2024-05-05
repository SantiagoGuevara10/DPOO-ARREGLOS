package consolas;

import java.util.LinkedList;
import java.util.List;

import galeria.inventarios.InventarioGeneral;
import galeria.usuarios.Empleado;

/**
 * En esta clase se encuentra el método main de la aplicación.
 *//**
 * En esta clase se encuentra el método main de la aplicación.
 */
public class ConsolaPrincipal extends ConsolaBasica{
	/**
     * Opciones que se mostrarán en el menú principal
     */
    private final String[] opcionesMenuPrincipal = new String[]{"Ingresar como Empleado","Ingresar como cliente","Crear Usuario","Salir" };

    private InventarioGeneral inventario;
    
    /**
     * Muestra el menú principal de la aplicación y ejecuta la opción que seleccione el usuario.
     * 
     * El menú vuelve a mostrarse hasta que el usuario seleccione la opción para abandonar la aplicación.
     */
    private void mostrarMenuPrincipal( )
    {
        int opcionSeleccionada = mostrarMenu( "Menú principal", opcionesMenuPrincipal );
        if( opcionSeleccionada == 1 )
        {
             
        }
        else if( opcionSeleccionada == 2 )
        {
            
        }
        else if( opcionSeleccionada == 3 )
        {
            crearUsuario();
        }  
        
        else if( opcionSeleccionada == 4 )
        {
            System.out.println( "Saliendo ..." );
            System.exit( 0 );
        }
        mostrarMenuPrincipal( );
    }
    
    
    private void crearUsuario() {
		ConsolaCrearUsuario creacionuser = new ConsolaCrearUsuario();
		Object usuarionuevo = creacionuser.mostrarMenu();
		
	}


	public static void main( String[] args )
    {
		List<String> bola = new LinkedList<>();
		bola.add("popo");
		bola.add("mor");
		System.out.println(bola);
        ConsolaPrincipal c = new ConsolaPrincipal( );
        c.mostrarMenuPrincipal( );
    }
	
	
	
}
