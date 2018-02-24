package com.slk.capture.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.slk.capture.model.Comments;

public interface CommentsRepository extends GraphRepository<Comments> {

}
