package com.plantasreyes.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantasreyes.database.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
