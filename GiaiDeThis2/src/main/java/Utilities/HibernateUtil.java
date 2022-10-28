/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import DomainModel.KhachHang;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author hungs
 */
public class HibernateUtil {

    public static final SessionFactory Factory;

    static {
        Configuration conf = new Configuration();
        Properties props = new Properties();

        props.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        props.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        props.put(Environment.URL, "jdbc:sqlserver://HUNG_SILVER:1433;databaseName=SOF2041_DAM;encrypt=true;trustServerCertificate=true");
        props.put(Environment.USER, "hung");
        props.put(Environment.PASS, "123");
        props.put(Environment.SHOW_SQL, true);

        conf.addAnnotatedClass(KhachHang.class);

        conf.setProperties(props);
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        Factory = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFactory() {
        return Factory;
    }

    public static void closeFactory() {
        Factory.close();
    }

    public static void main(String[] args) {
        System.out.println(getFactory());
        System.out.println("Thành công");
    }

}
