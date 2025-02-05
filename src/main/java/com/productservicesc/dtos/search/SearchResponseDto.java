package com.productservicesc.dtos.search;

import com.productservicesc.dtos.products.GetProductDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
public class SearchResponseDto {
    private Page<GetProductDto> productsPage;
}