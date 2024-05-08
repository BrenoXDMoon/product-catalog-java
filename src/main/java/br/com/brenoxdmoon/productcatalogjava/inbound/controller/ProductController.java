package br.com.brenoxdmoon.productcatalogjava.inbound.controller;

import br.com.brenoxdmoon.productcatalogjava.inbound.dto.ProductPersistDTO;
import br.com.brenoxdmoon.productcatalogjava.inbound.dto.ProductDTO;
import br.com.brenoxdmoon.productcatalogjava.inbound.facade.ProductFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductFacade facade;

    @Autowired
    public ProductController(ProductFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public ResponseEntity<ProductDTO> save(@RequestBody ProductPersistDTO dto) {
        return ResponseEntity.ok().body(facade.save(dto));
    }

}
