package com.example.demo.service;

import com.example.demo.util.FooFormatter;
import com.example.demo.util.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    private Formatter formatter;

    @Autowired
    public FooService(@Qualifier("barFormatter") Formatter formatter) {
        this.formatter = formatter;
    }

}
















//    autowired sukuria konctruktoriu. Cia kaip mokinimas. Kai paleidines programa springas iesko anotaciju ir automatiskai sukuria, todel nereikia new service ir pan.
//    private Formater formatter;

//    @Autowired
//    public String fetchFoo() {
//        return formatter.formatter();
//    }

////    kitas budas autowired
//    @Autowired
//    public void setFooFormatter(FooFormatter fooFormatter) {
//        this.fooFormatter = fooFormatter;
//    }
////    public String fetchFoo() {
////        return fooFormatter.format();
////    }
//
////    trecias budas su konstruktorium, gal lengviausias?