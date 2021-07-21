package ServicesProduct;

import Repositories.ProductRepository;
import models.Produs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceProduct {
    @Autowired
    private ProductRepository productRepository;



    @Transactional
    public void addOneProduct(Produs p){

        productRepository.addProduct(p);

    }

    @Transactional
    public void addOneProductWithException(Produs p){

        productRepository.addProduct(p);
        throw  new RuntimeException(":(");
    }
}
