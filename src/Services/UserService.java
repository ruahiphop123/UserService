/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.User;
import java.util.List;
import ConnectSQL.UserDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class UserService {
    
    private UserDao userDao;
    
    public UserService(){
        userDao = new UserDao();
    }
    
    public List<User> getAllUsers(){
        try {
            return userDao.getAllUsers();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
    public void deleteUser(int id){
        userDao.deleteUser(id);
    }
    
    public void updateUser(User user){
        try {
            userDao.updateUser(user);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
