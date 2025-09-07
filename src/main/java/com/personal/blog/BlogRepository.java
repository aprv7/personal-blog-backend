package com.personal.blog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    // No additional methods needed for basic CRUD
}

