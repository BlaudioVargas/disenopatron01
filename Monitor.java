
public class Monitor extends Hardware{
  private String resolucion;
  
  public Monitor (String id, String marca, String modelo, int precio, Proveedor proveedor, String resolucion){
    super (id, marca, modelo, precio, proveedor);
    this.resolucion = resolucion;
  }

  public String getresolucion(){
    return this.resolucion;
  }
}
