package ong.somosmas.appsomosmas.repository;

import ong.somosmas.appsomosmas.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
