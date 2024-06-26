package net.javaguides.springboot.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@Repository
// my sql
// public interface EmployeeRepository extends JpaRepository<Employee, Long>{

// }

// mondoDb
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
