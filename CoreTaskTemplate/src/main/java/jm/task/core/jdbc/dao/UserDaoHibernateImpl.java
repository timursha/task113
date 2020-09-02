package jm.task.core.jdbc.dao;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.SessionFactory;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
//    Session session;

    @Override
    public void createUsersTable() {
//        session = session.getSessionFactory().openSession();
//        session.beginTransaction();
//        String sql = "CREATE TABLE IF NOT EXISTS users (id integer primary key auto_increment not null, name varchar(124), lastName varchar(124), age int)";
//        int a = session.createQuery(sql).executeUpdate();
//        session.beginTransaction().commit();
//        session.close();
    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
