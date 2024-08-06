package br.com.rp.service;

import br.com.rp.controller.resource.Cmv;
import br.com.rp.controller.resource.MaisVendidos;
import br.com.rp.controller.resource.MenosVendidos;
import br.com.rp.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmvService {

    @Autowired
    private VendasRepository vendasRepository;
    public List<Cmv> getCmv() {
        var teste = vendasRepository.getCMV();
        System.out.println(teste);

        return teste;
    }

    public List<MaisVendidos> getMaisVendidos() {
        var teste = vendasRepository.getMaisVendidos();
        System.out.println(teste);

        return teste;
    }

    public List<MenosVendidos> getMenosVendidos() {
        var teste = vendasRepository.getMenosVendidos();
        System.out.println(teste);

        return teste;
    }

}
