
package Repositories;

import CustomModel.KhachHangCustom;
import DomainModel.KhachHang;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author hungs
 */
public class KhachHangRepository {

    public List<KhachHangCustom> getList() {
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            List<KhachHangCustom> list = new ArrayList<>();
            String hql = "select new CustomModel.KhachHangCustom(Id,Ma,Ho+' '+TenDem+' '+Ten,NgaySinh,Sdt,DiaChi+','+ThanhPho+','+QuocGia)  from KhachHang order by Ma";
            TypedQuery<KhachHangCustom> qr = s.createQuery(hql);
            list = qr.getResultList();
            s.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean create(KhachHang kh) {
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                s.saveOrUpdate(kh);
                trans.commit();
                s.close();
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    public boolean delete(String id) {
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                String hql= "delete from KhachHang where id=:id";
                Query qr = s.createQuery(hql);
                qr.setParameter("id", id);
                qr.executeUpdate();
                trans.commit();
                s.close();
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        KhachHangRepository khrp = new KhachHangRepository();
        for (KhachHangCustom x : khrp.getList()) {
            System.out.println(x);
        }
    }
}
