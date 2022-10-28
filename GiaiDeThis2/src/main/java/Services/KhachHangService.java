/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import CustomModel.KhachHangCustom;
import DomainModel.KhachHang;
import java.util.List;

/**
 *
 * @author hungs
 */
public interface KhachHangService {

    List<KhachHangCustom> getList();

    List<KhachHangCustom> getListFind(String text);

    boolean save(KhachHang kh);

    boolean update(KhachHang kh);

    boolean delete(String id);

}
