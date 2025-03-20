package lp2.exercicios_fixacao_java;

import lp2.exercicios_fixacao_java.ex2.Invoice;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosFixacaoJavaApplication {

	public static void main(String[] args) {

		// cria objeto Invoice
		Invoice invoice = new Invoice(1, 101, "Item A", 5, 20.0);

		// Printa no terminal oque foi cadastrado
		System.out.println("Item ID: " + invoice.getItem_id());
		System.out.println("Descrição: " + invoice.getItem_description());
		System.out.println("Quantidade: " + invoice.getQuantity());
		System.out.println("Preço unitário: " + invoice.getUnity_price());
		System.out.println("Valor total da fatura: " + invoice.getInvoiceAmount());

		// Testando setters
		invoice.SetItem(102);
		invoice.SetItemDescription("Item B");
		invoice.SetQuantity(10);
		invoice.SetUnityPrice(15.0);

		// Printa no terminal oque foi modificação
		System.out.println("\nApós modificações:");
		System.out.println("Item ID: " + invoice.getItem_id());
		System.out.println("Descrição: " + invoice.getItem_description());
		System.out.println("Quantidade: " + invoice.getQuantity());
		System.out.println("Preço unitário: " + invoice.getUnity_price());
		System.out.println("Valor total da fatura: " + invoice.getInvoiceAmount());
	}
}
