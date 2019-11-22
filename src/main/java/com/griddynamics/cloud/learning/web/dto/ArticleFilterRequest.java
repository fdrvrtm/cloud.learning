package com.griddynamics.cloud.learning.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleFilterRequest {
    private PaginatedRequestParams params;
    private PurchaseType purchaseType;
    private String caption;
    private String tag;
}