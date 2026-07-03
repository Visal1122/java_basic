package com.visal.learning.PhoneShop.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaginationDTO {
    private int pageSize;
    private int pageNumber;
    private int totalPages;
    private long totalElements;
    private int numberOfElements;
    private boolean first;
    private boolean last;
    private boolean empty;

}
