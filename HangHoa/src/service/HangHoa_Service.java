
package service;

import java.util.ArrayList;
import java.util.List;
import model.HangHoa_Model;

/**
 *
 * @author Kjoker
 */
public class HangHoa_Service {
    List<HangHoa_Model> list = new ArrayList<>();
    
    public HangHoa_Service(){
        list.add(new HangHoa_Model("01","Adidas","Super Star XLG",5,"Đen",40));
        list.add(new HangHoa_Model("02", "Nike","Nike Air Force 1",2, "Trắng",50));
        list.add(new HangHoa_Model("03", "Adidas","Campus",3, "Đỏ",43));
        list.add(new HangHoa_Model("04", "Adidas","Samba",3, "Vàng",43));
        list.add(new HangHoa_Model("05", "Adidas","Forum",3, "Trắng",43));
    }
    
    public List<HangHoa_Model> getAll(){ return list;}
    public HangHoa_Model getAt(int i) { return list.get(i);}
    public HangHoa_Model getLast() { return list.get(list.size()-1);}
    
    public void add(HangHoa_Model hh) {list.add(hh);}
    
    public void delete(int i) { list.remove(i); }
    public void update(int i, HangHoa_Model hh) { list.set(i, hh); }
}
