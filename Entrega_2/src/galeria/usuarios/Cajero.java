package galeria.usuarios;



import galeria.pieza.Pieza;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cajero extends Empleado {

    public Cajero(String idEmpleado, String nombre, String username, String passwordHash, String role) {
        super(idEmpleado, nombre, username, passwordHash, role);
    }

 
    
    public void procesarPago(CompradorPropietario comprador, CompradorPropietario vendedor, double monto, Pieza pieza) {
        
        if (comprador.getDinero() >= monto) {
            
            comprador.setDinero(comprador.getDinero() - monto);
      
            vendedor.setDinero(vendedor.getDinero() + monto);
           
            pieza.setPropietario(comprador);
     
        }
    }

 
   
    private void emitirRecibo(String transaccion) {
        try (FileWriter writer = new FileWriter("Recibo_" + transaccion.hashCode() + ".txt")) {
            writer.write("Recibo de la " + transaccion);
        } catch (IOException e) {
            
        }
    }
    
    
}