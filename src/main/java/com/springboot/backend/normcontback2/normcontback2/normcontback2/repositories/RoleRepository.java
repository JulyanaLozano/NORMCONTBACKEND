package com.springboot.backend.normcontback2.normcontback2.normcontback2.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.normcontback2.normcontback2.normcontback2.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

    Optional<Role> findByCodRol(String name);

}
