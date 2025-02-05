package com.productservicesc.advices;

import com.productservicesc.dtos.search.FilterDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@ControllerAdvice
@RestController
public class ExceptionAdvices {

    @ExceptionHandler(RuntimeException.class)
    public FilterDto handleRuntimeException(RuntimeException e) {
        FilterDto dto = new FilterDto();
        dto.setStatus("ERROR");
        dto.setMessage(e.getMessage());
        return dto;
    }

    @ExceptionHandler(Exception.class)
    public String handleException() {
        return "something went wrong";
    }
}