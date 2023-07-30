package com.dev.cellcolthes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private long userId;
    private String userName;
    private String password;
    private String email;
    private String address;
    private String phone;
    private String role;
    private long createData;
    private int status;

    public UserDTO(String userName, String password, String email, String address, String phone, String role, long createData, int status) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.role = role;
        this.createData = createData;
        this.status = status;
    }
}
