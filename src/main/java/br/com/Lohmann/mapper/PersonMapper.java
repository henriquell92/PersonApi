package br.com.Lohmann.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.Lohmann.dto.request.PersonDTO;
import br.com.Lohmann.entity.Person;

@Mapper
public interface PersonMapper {
	
PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
	
	@Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyy")
	Person toModel(PersonDTO personDTO);
	
	PersonDTO toDTO(Person person);

}
