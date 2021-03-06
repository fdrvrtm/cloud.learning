package com.griddynamics.cloud.learning.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleFilterRequest {

    @NotNull
    private PurchaseType type;

    private String caption;

    private String tag;
}
