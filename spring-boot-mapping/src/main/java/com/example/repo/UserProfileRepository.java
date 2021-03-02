package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.entities.UserProfile;

@Repository
@EnableJpaRepositories
public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{

}
