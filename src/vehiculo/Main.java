
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoPerezSarabiaAna2223 miVehiculoPerezSarabiaAna2223;
        int stockActual;
        
        miVehiculoPerezSarabiaAna2223 = new VehiculoPerezSarabiaAna2223("Seat",18000,100);
        operativaVehiculosPerezSarabiaAna(miVehiculoPerezSarabiaAna2223, 50);
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoPerezSarabiaAna2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoPerezSarabiaAna2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosPerezSarabiaAna(VehiculoPerezSarabiaAna2223 miVehiculoPerezSarabiaAna2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoPerezSarabiaAna2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
