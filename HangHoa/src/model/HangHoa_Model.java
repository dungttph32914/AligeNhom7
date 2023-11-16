
package model;

/**
 *
 * @author Kjoker
 */
public class HangHoa_Model {
    String ma;
    String loai;
    String ten;
    Integer soluong;
    String mau;
    Integer size;

    public HangHoa_Model() {
    }

    public HangHoa_Model(String ma, String loai, String ten, Integer soluong, String mau, Integer size) {
        this.ma = ma;
        this.loai = loai;
        this.ten = ten;
        this.soluong = soluong;
        this.mau = mau;
        this.size = size;
    }

    public String getMa() {
        return ma;
    }

    public String getLoai() {
        return loai;
    }

    public String getTen() {
        return ten;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public String getMau() {
        return mau;
    }

    public Integer getSize() {
        return size;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
}
