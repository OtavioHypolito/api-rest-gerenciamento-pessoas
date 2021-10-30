package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mapper.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", DateFormat = "dd-MM-yyyy");
    Person ToModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
