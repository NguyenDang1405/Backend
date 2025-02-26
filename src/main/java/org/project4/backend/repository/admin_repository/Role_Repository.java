package org.project4.backend.repository.admin_repository;

import org.project4.backend.entity.Role_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Role_Repository extends JpaRepository<Role_Entity, Long> {
    List<Role_Entity> findByName(String name);
}
