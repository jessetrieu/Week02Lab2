package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 579957
 */
public class UserService {
    
    public boolean login(String username, String password){
        
        if((username.equals("adam") || username.equals("betty")) && password.equals("password")){
        
        return true;

        }
        return false;
    }
    
}
