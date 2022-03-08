package com.example.restfulwebservice.user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
	
	//아이디를 이용한 검색 - 반환타입 Optional
	Optional<Post> findById(Integer Id);
	
	//이름을 이용한 검색 - 반환타입 T
	Post findByName(String name);
	
	//아이디와 Description을 이용한 검색
	List<Post> findByIdAndDescription(Integer id, String description);
	
}
