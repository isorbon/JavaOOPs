package com.syntax.class28.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW_04 {
    /* Create a Map that will store Employee name and salary.
     Write a logic to retrieve an employee who gets the highest salary.
     Output should be in the below format
     John Smith=$100000 */
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        employee.put("Alexey Sitalo", 95000);
        employee.put("Aysha Eshonova", 101060);
        employee.put("Demir Peyman", 120130);
        employee.put("Ziyamedin Akhmedov", 110020);

        String maxSalaryEmpName = "";
        int maxSalary = 0;

        for (Map.Entry<String, Integer> emp : employee.entrySet()
        ) {
            if(emp.getValue() > maxSalary) {
                maxSalary = emp.getValue();
                maxSalaryEmpName = emp.getKey();
            }
        }
        System.out.println(maxSalaryEmpName + " = $" + maxSalary);

    }
}
