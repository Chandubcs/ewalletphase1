package dao;

import entities.Ewallet;
import exceptions.EmployeeNotFoundException;

import java.util.*;

public class EwalletDaoImpl implements IEwalletDao {
    private Map<String, Ewallet> store = new HashMap<>();

    @Override
    public void addEmployee(Ewallet e) {
        store.put(e.getPhno(),e);

    }

    @Override
    public Ewallet findEmployeeByphno(String phno) {
        Ewallet e=store.get(phno);
        if(e==null)
        {
            throw new EmployeeNotFoundException("Employee not found for phno:"+phno);
        }
        return e;
    }

    @Override
    public Set<Ewallet> allEmployees() {
        Collection<Ewallet> employees=store.values();
        Set<Ewallet> employeeSet = new HashSet<>(employees);
        return employeeSet;

    }
}
