package com.dev.cellcolthes.domain.api;

import com.dev.cellcolthes.model.dto.UserDTO;
import com.dev.cellcolthes.model.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    boolean insertUser(UserDTO userDTO);

    boolean updateUser(UserDTO userDTO);

    boolean deleteUser(long userId);

    UserDTO getUser(long userId);

    List<UserDTO> getUsers(List<Long> userIds);

    List<UserDTO> getAll();

    Long countUses();

    List<UserDTO> findUserPage(String userName, int pageSize, int pageNo);

    int getPages(int limit);
}
