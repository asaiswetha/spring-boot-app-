package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
