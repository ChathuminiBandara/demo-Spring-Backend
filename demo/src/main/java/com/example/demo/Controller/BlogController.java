package com.example.demo.Controller;

import com.example.demo.Entity.Blog;
import com.example.demo.Repositary.BlogRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogRepositary blogRepository;

    @GetMapping("/all")
    public List<Blog> getAllPost() {
        return blogRepository.findAll();
    }
    @PostMapping("/savePost")
    public Blog savePost(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @GetMapping("/new/{id}")
    public String getNewPost(@PathVariable String id) {
        return id;
    }
    @PutMapping("/updatePost")
    public Blog updatePost(@RequestBody Blog blog) {
        return  blogRepository.save(blog);
    }

    @DeleteMapping("/deletePost/{id}")
    public void deletePost(@PathVariable String id) {
        blogRepository.deleteById(Integer.valueOf(id));}

}