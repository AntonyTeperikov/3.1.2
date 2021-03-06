package com.example.demo.repository;


import com.example.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository <Role, Long> {
    @Query("SELECT r FROM Role r where r.role = :role")
    Role getRoleByRoleName(@Param("role") String role);
}
