package br.com.rp.repository;

import br.com.rp.controller.resource.Cmv;
import br.com.rp.controller.resource.MaisVendidos;
import br.com.rp.controller.resource.MenosVendidos;
import br.com.rp.model.Vendas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendasRepository  extends CrudRepository<Vendas, Long> {
    @Query("SELECT new br.com.rp.controller.resource.MenosVendidos(v.produto.descricao, sum(v.total)) from Vendas v group by v.produto order by sum(total)")
    List<MenosVendidos> getMenosVendidos();
    @Query("SELECT new br.com.rp.controller.resource.MaisVendidos(g.descricao, sum(v.total)) from Vendas v left join v.produto p left join v.produto.grupo g group by g.id")
    List<MaisVendidos> getMaisVendidos();
    @Query("SELECT new br.com.rp.controller.resource.Cmv(monthname(v.meses), sum(v.total)) from Vendas v group by monthname(v.meses), month(v.meses) order by month(v.meses)")
    List<Cmv> getCMV();
}
