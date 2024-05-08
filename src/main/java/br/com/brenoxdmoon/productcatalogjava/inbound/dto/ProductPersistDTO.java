package br.com.brenoxdmoon.productcatalogjava.inbound.dto;

import lombok.Data;

@Data
public class ProductPersistDTO {

    private String name;
    private String description;
    private double price;
    private String category;
    private boolean availability;

}
