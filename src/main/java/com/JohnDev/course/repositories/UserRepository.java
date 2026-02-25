package com.JohnDev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JohnDev.course.entities.User;

//Repositório responsável por fazer as operações com User.
//Faz extends JpaRepository passando como parâmetro a entidade desejada e o tipo da chave da entidade
public interface UserRepository extends JpaRepository<User, Long>{

}
