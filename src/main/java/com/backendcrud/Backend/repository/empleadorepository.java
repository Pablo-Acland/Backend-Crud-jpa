package com.backendcrud.Backend.repository;

import com.backendcrud.Backend.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface empleadorepository extends JpaRepository<Empleado, Long> {

    Empleado fineByEmpleadoId(String empleadoid);

    List<Empleado> findByFirstName(String firstName);

    List<Empleado> findByLastName(String lastName);

    List<Empleado> findByRole(Role role);

}
