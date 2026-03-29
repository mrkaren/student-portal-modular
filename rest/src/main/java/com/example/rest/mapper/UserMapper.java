package com.example.rest.mapper;

import com.example.model.User;
import com.example.rest.dto.SaveUserRequest;
import com.example.rest.dto.UserAuthResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "role", source = "saveUserRequest.role")
    User toEntity(SaveUserRequest saveUserRequest);

    UserAuthResponse toDto(User user);

}
