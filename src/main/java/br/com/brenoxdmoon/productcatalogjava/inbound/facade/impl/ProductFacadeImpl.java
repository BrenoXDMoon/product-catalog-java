package br.com.brenoxdmoon.productcatalogjava.inbound.facade.impl;

import br.com.brenoxdmoon.productcatalogjava.inbound.dto.ProductDTO;
import br.com.brenoxdmoon.productcatalogjava.inbound.dto.ProductPersistDTO;
import br.com.brenoxdmoon.productcatalogjava.inbound.facade.ProductFacade;
import org.springframework.stereotype.Component;

@Component
public class ProductFacadeImpl implements ProductFacade {
    @Override
    public ProductDTO save(ProductPersistDTO dto) {
        return null;
    }
}
