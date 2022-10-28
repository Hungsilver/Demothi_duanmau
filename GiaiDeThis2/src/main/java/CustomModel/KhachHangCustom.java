/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomModel;

import java.util.Date;

/**
 *
 * @author hungs
 */
public class KhachHangCustom {
    
    private String Id;
    private String Ma;
    private String HovaTen;
    private Date NgaySinh;
    private String Sdt;
    private String Address;

    public KhachHangCustom() {
    }

    public KhachHangCustom(String Id, String Ma, String HovaTen, Date NgaySinh, String Sdt, String Address) {
        this.Id = Id;
        this.Ma = Ma;
        this.HovaTen = HovaTen;
        this.NgaySinh = NgaySinh;
        this.Sdt = Sdt;
        this.Address = Address;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String HovaTen) {
        this.HovaTen = HovaTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

  
    @Override
    public String toString() {
        return "KhachHangCustom{" + "Id=" + Id + ", Ma=" + Ma + ", HovaTen=" + HovaTen + ", NgaySinh=" + NgaySinh + ", Sdt=" + Sdt + ", Address=" + Address + '}';
    }
    
}
