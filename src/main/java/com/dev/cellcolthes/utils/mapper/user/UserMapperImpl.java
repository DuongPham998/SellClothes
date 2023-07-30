package com.dev.cellcolthes.utils.mapper.user;

import com.dev.cellcolthes.model.dto.UserDTO;
import com.dev.cellcolthes.model.entity.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMapperImpl implements UserMapper{
    private static final UserMapperImpl userMapper = new UserMapperImpl();
    public static UserMapperImpl getInstance() {return userMapper;}
    private UserMapperImpl () {}
    @Override
    public User userDTOToUser(UserDTO userDTO) {
        if (userDTO != null)
            return new User(
                    userDTO.getUserId(),
                    userDTO.getUserName(),
                    userDTO.getPassword(),
                    userDTO.getEmail(),
                    userDTO.getAddress(),
                    userDTO.getPhone(),
                    userDTO.getRole(),
                    userDTO.getCreateData(),
                    userDTO.getStatus()
            );
        return null;
    }

    @Override
    public UserDTO userToUserDTO(User user) {
        if (user != null)
            return new UserDTO(
                    user.getUserId(),
                    user.getUserName(),
                    user.getPassword(),
                    user.getEmail(),
                    user.getAddress(),
                    user.getPhone(),
                    user.getRoles(),
                    user.getCreateDate(),
                    user.getStatus()
            );
        return null;
    }

    @Override
    public List<UserDTO> listUserToListUserDTO(List<User> users) {
        if (users != null && !users.isEmpty()) {
            List<UserDTO> userDTOList = new ArrayList<>();
            for (User user : users) {
                userDTOList.add(userToUserDTO(user));
            }
            return userDTOList;
        }
        return Collections.emptyList();
    }
}
