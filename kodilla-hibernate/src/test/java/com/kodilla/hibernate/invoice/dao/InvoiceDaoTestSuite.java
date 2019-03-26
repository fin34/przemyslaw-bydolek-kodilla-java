package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        Invoice firstFV = new Invoice("0001");

        Product firstProduct = new Product("first product");
        Product seceondProduct = new Product("second product");
        Product thirdProduct = new Product("third product");

        Item first = new Item(firstProduct, new BigDecimal("100"), 10, new BigDecimal("1000"));
        Item second = new Item(seceondProduct, new BigDecimal("500"), 3, new BigDecimal("1500"));
        Item third = new Item(thirdProduct, new BigDecimal("10"), 10, new BigDecimal("100"));

        first.setInvoice(firstFV);
        second.setInvoice(firstFV);
        third.setInvoice(firstFV);

        firstFV.getItems().add(first);
        firstFV.getItems().add(second);
        firstFV.getItems().add(third);

        invoiceDao.save(firstFV);
        int id = firstFV.getId();
        Assert.assertNotEquals(0, id);

        invoiceDao.deleteById(id);
    }
}
