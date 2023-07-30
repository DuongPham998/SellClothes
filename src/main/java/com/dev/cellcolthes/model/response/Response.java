package com.dev.cellcolthes.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private int responseCode;
    private String message;
    private Object object;
}
