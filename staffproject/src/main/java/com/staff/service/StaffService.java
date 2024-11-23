package com.staff.service;


import com.staff.entity.Staff;
import com.staff.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService
{
    @Autowired
    private StaffRepository repo;

    public Staff saveStaff(Staff staff)
    {
        return repo.save(staff);
    }

    public List<Staff> findAll()
    {
        return repo.findAll();
    }

    public Staff findById(int id)
    {
        Optional<Staff> staff = repo.findById(id);

        if(staff.isEmpty())
        {
            throw new RuntimeException("Staff is not found");
        }
        return staff.get();
    }

    public Staff updateStaff(Staff staff)
    {
        Optional<Staff> upstaff = repo.findById(staff.getId());

        if(upstaff.isEmpty())
        {
            throw new RuntimeException("staff not found");
        }
        Staff existingStaff=upstaff.get();
        existingStaff.setStaffname(staff.getStaffname());
        existingStaff.setStaffcollege(staff.getStaffcollege());
        return repo.save(existingStaff);
    }

    public void delete(int id)
    {
        Optional<Staff> staff = repo.findById(id);

        if(staff.isEmpty())
        {
            throw  new RuntimeException("delete staff");
        }
        repo.delete(staff.get());
    }

}
