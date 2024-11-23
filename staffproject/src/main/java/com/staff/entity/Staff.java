package com.staff.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "Staff Data")
public class Staff
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Staff_Name")
    private String staffname;

    @Column(name = "Staff_College")
    private String staffcollege;

    @Column(name = "Staff_Location")
    private String stafflocation;

    @Column(name = "Staff_Dept")
    private String staffdept;

    @Column(name = "Staff_Salary")
    private String staffsalary;


}
