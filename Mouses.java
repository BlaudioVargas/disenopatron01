
public class Mouses extends Hardware{
  private Boolean inalambrico;

  public Mouses (String id, String marca, String modelo, int precio, Proveedor proveedor, boolean inalambrico){
    super (id, marca, modelo, precio, proveedor);
    this.inalambrico = inalambrico;
  }

  public String getinalambrico(){
    if(inalambrico){
      return "Inalambrico";
    }
    return "No es Inalambrico";
  } 
  
}
