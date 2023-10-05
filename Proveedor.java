public class Proveedor{
  private String idproveedor;
  private String direccionproveedor;
  private String coreeoproveedor;

  public Proveedor(String id, String direccion, String correo){
    this.idproveedor = id;
    this.direccionproveedor = direccion;
    this.coreeoproveedor = correo;
  }

  public String getid(){
    return this.idproveedor;
  }

  public String getdireccion(){
    return this.direccionproveedor;
  }

  public String getcorreo(){
    return this.coreeoproveedor;
  }
}
