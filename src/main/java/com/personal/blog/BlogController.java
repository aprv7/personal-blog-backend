package com.personal.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/blogs")
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable Long id) {
        Optional<Blog> blog = blogRepository.findById(id);
        return blog.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

