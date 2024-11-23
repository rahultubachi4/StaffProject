package com.staff.controller;


import com.staff.entity.Staff;
import com.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StaffController
{
    @Autowired
    private StaffService ser;

    @PostMapping("/save")
    public Staff saveStaff(@RequestBody Staff staff)
    {
        return ser.saveStaff(staff);
    }

    @GetMapping("/findById")
    public Staff findById(@RequestParam int id)
    {
        return ser.findById(id);
    }

    @GetMapping("/findByAll")
    public List<Staff> findAll()
    {
        return ser.findAll();
    }

    @PutMapping("/update")
    public Staff updateStaff(@RequestBody Staff staff)
    {
        return ser.updateStaff(staff);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id)
    {
        ser.delete(id);
    }


}
