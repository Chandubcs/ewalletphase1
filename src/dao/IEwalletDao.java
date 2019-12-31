package dao;

import entities.Ewallet;

import java.util.Set;

public interface IEwalletDao {
    void addEmployee(Ewallet e);

    Ewallet findEmployeeByphno(String phno);

    Set<Ewallet> allEmployees();


}
