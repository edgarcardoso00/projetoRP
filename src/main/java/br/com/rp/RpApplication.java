package br.com.rp;

import br.com.rp.model.Grupo;
import br.com.rp.model.Produto;
import br.com.rp.model.Vendas;
import br.com.rp.repository.GrupoRepository;
import br.com.rp.repository.ProdutoRepository;
import br.com.rp.repository.VendasRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.math.BigDecimal;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpApplication.class, args);
	}

	@Bean
	public CommandLineRunner insertDefaultOperationTypes(GrupoRepository grupoRepository, ProdutoRepository produtoRepository, VendasRepository vendasRepository) {

		return (args) -> {

			grupoRepository.saveAll(
					List.of(new Grupo(1L,"prato"), new Grupo(2L,"bebida"), new Grupo(3L,"comida"))
			);

			produtoRepository.saveAll(
					List.of(
							new Produto(1L,"agua",  new BigDecimal("5.00"), new Grupo(2L)),
							new Produto(2L,"leite",  new BigDecimal("6.00"), new Grupo(2L)),
							new Produto(3L,"alface",  new BigDecimal("2.00"), new Grupo(3L)),
							new Produto(4L,"tomate",  new BigDecimal("3.00"), new Grupo(3L))
					)
			);

			vendasRepository.saveAll(
					List.of(
							new Vendas(2L, new Produto(1L), 10L, LocalDate.of(2024, Month.JANUARY, 18).atStartOfDay()),
							new Vendas(3L, new Produto(2L), 8L, LocalDate.of(2024, Month.FEBRUARY, 18).atStartOfDay()),
							new Vendas(4L, new Produto(3L), 7L, LocalDate.of(2024, Month.JULY, 18).atStartOfDay()),
							new Vendas(5L, new Produto(4L), 20L, LocalDate.of(2024, Month.DECEMBER, 18).atStartOfDay()),
							new Vendas(6L, new Produto(4L), 7L, LocalDate.of(2024, Month.JUNE, 18).atStartOfDay()),
							new Vendas(7L, new Produto(3L), 10L, LocalDate.of(2024, Month.APRIL, 18).atStartOfDay()),
							new Vendas(8L, new Produto(2L), 10L, LocalDate.of(2024, Month.DECEMBER, 18).atStartOfDay()),
							new Vendas(9L, new Produto(2L), 10L, LocalDate.of(2024, Month.JANUARY, 18).atStartOfDay()),
							new Vendas(10L, new Produto(4L), 16L, LocalDate.of(2024, Month.AUGUST, 18).atStartOfDay()),
							new Vendas(11L, new Produto(2L), 20L, LocalDate.of(2024, Month.DECEMBER, 18).atStartOfDay()),
							new Vendas(12L, new Produto(3L), 9L, LocalDate.of(2024, Month.JANUARY, 18).atStartOfDay()),
							new Vendas(13L, new Produto(2L), 12L, LocalDate.of(2024, Month.JANUARY, 18).atStartOfDay()),
							new Vendas(14L, new Produto(2L), 10L, LocalDate.of(2024, Month.DECEMBER, 18).atStartOfDay()),
							new Vendas(15L, new Produto(4L), 1L, LocalDate.of(2024, Month.APRIL, 18).atStartOfDay()),
							new Vendas(16L, new Produto(3L), 7L, LocalDate.of(2024, Month.JANUARY, 18).atStartOfDay()),
							new Vendas(17L, new Produto(3L), 10L, LocalDate.of(2024, Month.DECEMBER, 18).atStartOfDay()),
							new Vendas(18L, new Produto(2L), 2L, LocalDate.of(2024, Month.JANUARY, 18).atStartOfDay()),
							new Vendas(19L, new Produto(4L), 40L, LocalDate.of(2024, Month.AUGUST, 18).atStartOfDay()),
							new Vendas(20L, new Produto(3L), 10L, LocalDate.of(2024, Month.DECEMBER, 18).atStartOfDay()),
							new Vendas(21L, new Produto(2L), 5L, LocalDate.of(2024, Month.APRIL, 18).atStartOfDay()),
							new Vendas(22L, new Produto(1L), 20L, LocalDate.of(2024, Month.AUGUST, 18).atStartOfDay()),
							new Vendas(23L, new Produto(3L), 6L, LocalDate.of(2024, Month.JANUARY, 18).atStartOfDay()),
							new Vendas(24L, new Produto(2L), 4L, LocalDate.of(2024, Month.APRIL, 18).atStartOfDay())

					)
			);

		};
	}
}
