/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jac.UsersApp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jacob.gitau
 */
@RestController
public class UserAccount {
    
    @GetMapping(path="user/account",produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAccountBalance()
    {
        
        return "Coder";
    }
}
