package com.luandias.workshop_mongodb.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luandias.workshop_mongodb.domain.Post;
import com.luandias.workshop_mongodb.domain.repository.PostRepository;
import com.luandias.workshop_mongodb.servicies.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public List<Post> findAll() {
		return repo.findAll();
	}

	public Post findById(String id) {
		Optional<Post> Post = repo.findById(id);
		return Post.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));

	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}

}
