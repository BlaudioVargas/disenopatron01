
public class Computador extends Hardware{
  private String cpu;
  private String ram;
  private String hdd;

  public Computador (String id, String marca, String modelo, int precio, Proveedor proveedor, String cpu, String ram, String hdd){
    super (id, marca, modelo, precio, proveedor);
    this.cpu = cpu;
    this.ram = ram;
    this.hdd = hdd;
  }

  public String getcpu (){
    return this.cpu;
  }

  public String getram(){
    return this.ram;
  }

  public String gethdd(){
    return this.hdd;
  }
}
