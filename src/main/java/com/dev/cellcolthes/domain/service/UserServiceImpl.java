package com.dev.cellcolthes.domain.service;

import com.dev.cellcolthes.domain.api.UserService;
import com.dev.cellcolthes.model.dto.UserDTO;
import com.dev.cellcolthes.model.entity.User;
import com.dev.cellcolthes.repository.UserRepository;
import com.dev.cellcolthes.utils.mapper.user.UserMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public boolean insertUser(UserDTO userDTO) {
        if (userDTO != null) {
            User user = UserMapperImpl.getInstance().userDTOToUser(userDTO);
            if (user != null) {
                userRepository.save(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateUser(UserDTO userDTO) {
        User userMapper = UserMapperImpl.getInstance().userDTOToUser(userDTO);
        userRepository.save(userMapper);
        return true;
    }

    @Override
    public boolean deleteUser(long userId) {
        userRepository.deleteById(userId);
        return true;
    }

    @Override
    public UserDTO getUser(long userId) {
        User optional = userRepository.findUsersByUserId(userId);
        if (optional != null) {
            return UserMapperImpl.getInstance().userToUserDTO(optional);
        }
        return null;
    }

    @Override
    public List<UserDTO> getUsers(List<Long> userIds) {
        return Collections.emptyList();
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = userRepository.findAll();
        if (!users.isEmpty()) {
            List<UserDTO> userDTOList = UserMapperImpl.getInstance().listUserToListUserDTO(users);
            if (userDTOList != null && !userDTOList.isEmpty())
                return userDTOList;
        }
        return Collections.emptyList();
    }

    @Override
    public Long countUses() {
        return userRepository.countByUserIdIsNotNull();
    }



    @Override
    public List<UserDTO> findUserPage(String userName, int pageSize, int pageNo) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<User> userPage = userRepository.findAll(pageable);
        List<User>users = userPage.getContent();
        if (!users.isEmpty()) {
            return UserMapperImpl.getInstance().listUserToListUserDTO(users);
        }
        return Collections.emptyList();
    }

    @Override
    public int getPages(int limit) {
        Page<User> userPage = userRepository.findAll(PageRequest.of(0, limit));
        return userPage.getTotalPages();
    }
}
