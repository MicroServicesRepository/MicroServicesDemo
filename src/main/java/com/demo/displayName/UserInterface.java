/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.displayName;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dkeziah
 */
public interface UserInterface extends CrudRepository<NameID, String>{
    
}
