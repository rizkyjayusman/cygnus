package com.cygnus.app.mapper;

import com.cygnus.app.dto.UserDto;
import com.cygnus.app.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User toUser(UserDto userDto);

}
