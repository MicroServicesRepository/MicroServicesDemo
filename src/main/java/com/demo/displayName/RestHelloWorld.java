/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.displayName;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dkeziah
 */
@RestController
public class RestHelloWorld {

    @Autowired
    private UserInterface user;
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET, value = "/hello-world")
    public @ResponseBody
    NameID showMessage(@RequestParam(value = "name", required = true) String name) {
        return new NameID(counter.incrementAndGet(), name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addUser")
    public @ResponseBody
    String addUser(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "id", required = true) long id) {
        NameID objname = new NameID(id, name);
        objname.setId(id);
        objname.setName(name);
        user.save(objname);
        return "Saved";
    }
}
