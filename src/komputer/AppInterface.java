
package komputer;

/**
 *
 * @author HP
 */
public interface AppInterface {
    final int ADD_DATA_KOMPUTER = 1;
    final int SEARC_BY_BRAND = 2;
    final int SEACR_BY_MODEL =3;
    final int EXIT = 4;
    
    public int pilihanMenu();
    public void add();
    public String keyword(String type);
    public Komputer searcByBrand(String brand) ;
    public Komputer searchByModel(String model);
    public void viewData(komputer k);
    public void exit;
    
}
