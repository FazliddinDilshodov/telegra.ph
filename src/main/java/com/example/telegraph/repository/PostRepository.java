package com.example.telegraph.repository;

import com.example.telegraph.entity.PostEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, UUID> {
    List<PostEntity>findPostEntitiesById(UUID id);

    List<PostEntity>findPostEntitiesByNameContainsIgnoreCaseOrTitleContainsIgnoreCase(String name, String description, Sort sort);
}
