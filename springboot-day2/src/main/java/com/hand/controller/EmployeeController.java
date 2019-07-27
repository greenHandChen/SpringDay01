package com.hand.controller;

import com.hand.entity.HandEmployee;
import com.hand.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/showAll")
    @ResponseBody
    public List<HandEmployee> showAll(HandEmployee handEmployee){

        return employeeRepository.findAll();
    }
}
