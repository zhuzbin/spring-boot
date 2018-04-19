package com.zhuzb.springboot.controller;

import com.zhuzb.springboot.conf.Book;
import com.zhuzb.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/13
 * Time：16:05
 */
@Controller
public class TestController {

/*    @Value("${book.name}")
    private String bookName;

    @Value("${book.author}")
    private String bookAuthor;*/

    @Autowired
    Book book;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello Spring Boot  "+book.getName()+"-------"+book.getAuthor();
    }

    @RequestMapping("/person")
    public String person(Model model){
        Person person = new Person("zzz",123);

        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person);
        personList.add(person);
        personList.add(person);

        model.addAttribute("singlePerson",person);
        model.addAttribute("people",personList);

        return "test";
    }
}
