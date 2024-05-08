package br.com.brenoxdmoon.productcatalogjava.inbound.facade;

import br.com.brenoxdmoon.productcatalogjava.inbound.dto.ProductDTO;
import br.com.brenoxdmoon.productcatalogjava.inbound.dto.ProductPersistDTO;

public interface ProductFacade {
    ProductDTO save(ProductPersistDTO dto);
}
