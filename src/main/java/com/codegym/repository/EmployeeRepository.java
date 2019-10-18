package com.codegym.repository;

import com.codegym.model.Department;
import com.codegym.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    Page<Employee> findAllByNameContaining(String firstName, Pageable pageable);

    @Query("select e from Employee e order by e.salary desc ")
    Page<Employee> sort(Pageable pageable);
    Iterable<Employee> findAllByDepartment(Department department);
}
