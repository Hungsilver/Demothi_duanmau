/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import CustomModel.KhachHangCustom;
import DomainModel.KhachHang;
import Repositories.KhachHangRepository;
import Services.KhachHangService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hungs
 */
public class IKhachHangService implements KhachHangService {

    KhachHangRepository KHRepository;
    public static List<KhachHangCustom> list_KHCustom;

    public IKhachHangService() {
        KHRepository = new KhachHangRepository();
        list_KHCustom = new ArrayList<>();
    }

    @Override
    public List<KhachHangCustom> getList() {
        //list_KHCustom.clear();
        list_KHCustom = KHRepository.getList();
        return list_KHCustom;
    }

    @Override
    public boolean save(KhachHang kh) {
        kh.setId(null);
        if (KHRepository.create(kh)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(KhachHang kh) {
        if (KHRepository.create(kh)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        if (KHRepository.delete(id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<KhachHangCustom> getListFind(String text) {
        List<KhachHangCustom> list = new ArrayList<>();
        for (var x : getList()) {
            if (x.getAddress().contains(text) || x.getSdt().contains(text)) {
                list.add(x);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        IKhachHangService kh = new IKhachHangService();

        System.out.println(kh.getList());
    }

}
