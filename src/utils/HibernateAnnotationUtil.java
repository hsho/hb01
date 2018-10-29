package utils;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * 使用 xml文件 或 annotation 描述表结构的, 都可以使用该类获得 SessionFactory
 * 
 * @author hs
 * 
 * @version 20181020
 *
 */
public class HibernateAnnotationUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}