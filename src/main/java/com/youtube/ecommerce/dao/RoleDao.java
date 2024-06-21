package com.youtube.ecommerce.dao;

import com.youtube.ecommerce.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
