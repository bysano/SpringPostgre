package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alka0317
 * Date: 4/18/17
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class WebControler {
    @Autowired
    UserPojoRepository userPojoRepository;
//          @RequestMapping("/")
//    public String findall(){
//              for(UserPojo cust : userPojoRepository.findAll()){
//                        System.out.println(cust.toString());
//              }
//              return "done";
//    }

    @RequestMapping("/")
    public String findbyid(){
        System.out.println(userPojoRepository.findOne(1l).toString());
        return "done";
    }
}
