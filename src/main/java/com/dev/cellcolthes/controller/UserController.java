package com.dev.cellcolthes.controller;

import com.dev.cellcolthes.domain.api.UserService;
import com.dev.cellcolthes.model.dto.UserDTO;
import com.dev.cellcolthes.model.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<UserDTO> getUsers() {
        return userService.getAll();
    }

    @PostMapping("")
    public Response insertUser(@RequestBody UserDTO userDTO) {
        boolean addUser = userService.insertUser(userDTO);
        if (addUser)
            return new Response(HttpStatus.OK.value(), "success !", userDTO.getUserName());
        return new Response(HttpStatus.BAD_REQUEST.value(), "can not add !", userDTO.getUserName());
    }

    @GetMapping("/{id}")
    public Response getUser(@PathVariable("id") long userId) {
        UserDTO userDTO = userService.getUser(userId);
        if (userDTO != null) {
            return new Response(HttpStatus.OK.value(), "success !!", userDTO);
        }
        return new Response(HttpStatus.NO_CONTENT.value(), HttpStatus.NO_CONTENT.name(), false);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") long userId, @RequestBody UserDTO userDTO) {
        UserDTO user = userService.getUser(userId);
        if (user == null)
            return "can not update !";
        boolean updateUser = userService.updateUser(userDTO);
        if (updateUser)
            return "success !!";
        return "can not update !!";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long userId) {
        UserDTO userDTO = userService.getUser(userId);
        if (userDTO == null)
            return "can not delete !";
        boolean deleteUser = userService.deleteUser(userId);
        if (deleteUser)
            return "success !!";
        return "can not delete !";
    }

    @GetMapping("countUser")
    public String countUser() {
        long total = userService.countUses();
        return "total user in system : " + total;
    }

    /*
    * params : - pageNo = trang so bao nhieu
    *          - pageSize = so luong ban ghi hien thi
    * */
    @GetMapping("findUser")
    public List<UserDTO> findUser(@RequestParam("userName") String userName,
                           @RequestParam(name = "pageSize") int pageSize,
                           @RequestParam(name = "pageNo") int pageNo) {
         return userService.findUserPage(userName, pageSize, pageNo);
    }

    @GetMapping("pages_total")
    public String getPages(@RequestParam(name = "limit") int limit) {
        int totalPages = userService.getPages(limit);
        return "total page of list user : " + totalPages;
    }
}
