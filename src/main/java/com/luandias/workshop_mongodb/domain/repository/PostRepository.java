package com.luandias.workshop_mongodb.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luandias.workshop_mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
