package com.example.week10.Repository.Crud;

import com.example.week10.Dto.UserDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrudRepository extends CrudRepository<UserDto, Integer> {
}
