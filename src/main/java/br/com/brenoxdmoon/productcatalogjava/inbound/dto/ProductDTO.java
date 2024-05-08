package br.com.brenoxdmoon.productcatalogjava.inbound.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ProductDTO {
    private int id;
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean availability;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdate;
}
