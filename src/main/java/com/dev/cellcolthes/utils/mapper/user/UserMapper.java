package com.dev.cellcolthes.utils.mapper.user;

import com.dev.cellcolthes.model.dto.UserDTO;
import com.dev.cellcolthes.model.entity.User;

import java.util.List;

public interface UserMapper {
    User userDTOToUser(UserDTO userDTO);

    UserDTO userToUserDTO(User user);

    List<UserDTO> listUserToListUserDTO(List<User> users);

}
