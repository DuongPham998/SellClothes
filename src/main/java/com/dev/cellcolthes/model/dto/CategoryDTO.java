package com.dev.cellcolthes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDTO {
    private long id;
    private String categoryName;
    private String description;
    private int categoryParent;
    private int status;
    private int categoryOrder;
}
