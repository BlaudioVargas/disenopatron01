public class Proveedor{
  private String idproveedor;
  private String direccionproveedor;
  private String coreeoproveedor;
  private String telefonoproveedor;

  public Proveedor(String id, String direccion, String correo, String telefono){
    this.idproveedor = id;
    this.direccionproveedor = direccion;
    this.coreeoproveedor = correo;
    this.telefonoproveedor = telefono;
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

  public String gettelefono(){
    return this.telefonoproveedor;
  }
}
