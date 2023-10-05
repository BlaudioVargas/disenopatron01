
public class Hardware{
  private String idproducto;
  private String marca;
  private String modelo;
  private int preciounitario;
  private Proveedor proveedor;

  public class Hardware (String id, String marca, String modelo, int precio, Proveedor proveedor){
    this.idproducto = id;
    this.marca = marca;
    this.modelo = modelo;
    this.preciounitario = precio;
    this.proveedor = proveedor;
  }

  public String getid(){
    return this.id;
  }

  public String getmarca(){
    return this.marca;
  }

  public String getmodelo(){
    return this.modelo;
  }

  public int getprecio(){
    return this.preciounitario;
  }

  public Proveedor getproveedor(){
    return this.proveedor;
  }
}
