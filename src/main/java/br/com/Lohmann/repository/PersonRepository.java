package br.com.Lohmann.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Lohmann.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
