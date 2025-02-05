package com.productservicesc.dtos.products;

import com.productservicesc.dtos.products.GetProductDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatchProductResponseDto {
    private GetProductDto product;
}