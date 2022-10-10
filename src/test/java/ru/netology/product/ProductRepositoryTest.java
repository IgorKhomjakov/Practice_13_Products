package ru.netology.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    public class productRepositoryTest {

        Product product1 = new Book(1, "Книги", 200, "Весна", "А. Блок");
        Product product2 = new Book(2, "Книги", 323, "Полет", "Ю. Иванов");
        Product product3 = new Smartphone(1, "Смартфон", 12_000, "Nokia 110", "Nokia");
        Product product4 = new Smartphone(2, "", 35_000, "Xiaomi 12T", "Xiaomi");

        @Test
        public void shouldShowAllSaveProducts() {
            ProductRepository repository = new ProductRepository();
            repository.save(product1);
            repository.save(product2);
            repository.save(product3);
            repository.save(product4);

            Product[] expected = {product1, product2, product3, product4};
            Product[] actual = repository.getProducts();

            Assertions.assertArrayEquals(expected,actual);
        }
    }
}
