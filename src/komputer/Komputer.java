
package komputer;

/**
 *
 * @author HP
 */
public class Komputer {
 private String brand;
    private String model;
    private String disk;
    private String diskSize;
    private String ram;
    
public String getBrand() {
return brand;
}
public void setBrand(String brand) {
this.brand = brand;
}
public String getModel() {
    return model;
}
public void setModel(String model) {
    this.model = model ;
}
public String getDisk() {
    return disk;
}
public void setDisk(String disk) {
    this.disk = disk;
}
public String getDiskSize(){
    return diskSize;  
}
public void setDsikSize(int diskSize){
    this.diskSize = diskSize;
}
public String  getram (){
    return ram;
}
public void  setRam(int ram){
    this.ram = ram; 

    }
}
