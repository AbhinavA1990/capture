package com.slk.capture.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.slk.capture.model.Post;

public interface PostRepository extends GraphRepository<Post>  {

}
