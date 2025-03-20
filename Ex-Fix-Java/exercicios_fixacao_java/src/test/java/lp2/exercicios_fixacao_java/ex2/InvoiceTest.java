package lp2.exercicios_fixacao_java.ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    private Invoice invoice;

    @BeforeEach
    void setUp() {
        // Inicializando o objeto Invoice antes de cada teste
        invoice = new Invoice(1, 101, "Item Teste", 2, 50.0);
    }

    @Test
    void testGetInvoiceAmount() {
        // Verificando se o valor total está correto
        double result = invoice.getInvoiceAmount();
        System.out.println("Testando getInvoiceAmount, resultado: " + result); // Print para verificar o valor
        assertEquals(100.0, result, "O valor total da fatura deve ser 100.0");
    }

    @Test
    void testSetQuantity() {
        // Alterando a quantidade e verificando se a quantidade foi definida corretamente
        invoice.SetQuantity(5);
        System.out.println("Testando setQuantity, nova quantidade: " + invoice.getQuantity()); // Print para verificar a nova quantidade
        assertEquals(5, invoice.getQuantity(), "A quantidade deveria ser 5");

        // Verificando se a quantidade não pode ser negativa
        invoice.SetQuantity(-5);
        System.out.println("Testando setQuantity com valor negativo, nova quantidade: " + invoice.getQuantity()); // Print para verificar o valor após tentativa de valor negativo
        assertEquals(0, invoice.getQuantity(), "A quantidade não pode ser negativa, deveria ser 0");
    }

    @Test
    void testSetUnityPrice() {
        // Alterando o preço unitário e verificando se foi atualizado corretamente
        invoice.SetUnityPrice(30.0);
        System.out.println("Testando setUnityPrice, novo preço unitário: " + invoice.getUnity_price()); // Print para verificar o novo preço
        assertEquals(30.0, invoice.getUnity_price(), "O preço unitário deveria ser 30.0");

        // Verificando se o preço unitário não pode ser negativo
        invoice.SetUnityPrice(-30.0);
        System.out.println("Testando setUnityPrice com valor negativo, novo preço unitário: " + invoice.getUnity_price()); // Print para verificar o valor após tentativa de valor negativo
        assertEquals(0.0, invoice.getUnity_price(), "O preço unitário não pode ser negativo, deveria ser 0.0");
    }

    @Test
    void testSetItemDescription() {
        // Alterando a descrição do item
        invoice.SetItemDescription("Nova descrição");
        System.out.println("Testando setItemDescription, nova descrição: " + invoice.getItem_description()); // Print para verificar a nova descrição
        assertEquals("Nova descrição", invoice.getItem_description(), "A descrição do item deveria ser 'Nova descrição'");
    }

    @Test
    void testSetItemId() {
        // Alterando o id do item
        invoice.SetItem(202);
        System.out.println("Testando setItemId, novo id do item: " + invoice.getItem_id()); // Print para verificar o novo id do item
        assertEquals(202, invoice.getItem_id(), "O id do item deveria ser 202");
    }

    @Test
    void testConstructor() {
        // Verificando o comportamento do construtor
        assertNotNull(invoice, "O objeto Invoice não pode ser nulo");
        System.out.println("Testando construtor, id: " + invoice.getId()); // Print para verificar o id
        assertEquals(1, invoice.getId(), "O id deve ser 1");

        assertEquals(101, invoice.getItem_id(), "O id do item deve ser 101");
        assertEquals("Item Teste", invoice.getItem_description(), "A descrição do item deve ser 'Item Teste'");
        assertEquals(2, invoice.getQuantity(), "A quantidade deve ser 2");
        assertEquals(50.0, invoice.getUnity_price(), "O preço unitário deve ser 50.0");
    }
}
