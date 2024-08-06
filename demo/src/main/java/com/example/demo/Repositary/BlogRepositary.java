package com.example.demo.Repositary;

import com.example.demo.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepositary extends JpaRepository<Blog, Integer>{

    @Override
    List<Blog> findAll();
}
