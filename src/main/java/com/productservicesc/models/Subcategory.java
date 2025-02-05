package com.productservicesc.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subcategory extends BaseModel {

    private String surname;
}