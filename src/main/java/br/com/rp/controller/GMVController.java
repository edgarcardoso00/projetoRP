package br.com.rp.controller;

import br.com.rp.controller.resource.Cmv;
import br.com.rp.controller.resource.MaisVendidos;
import br.com.rp.controller.resource.MenosVendidos;
import br.com.rp.repository.VendasRepository;
import br.com.rp.service.CmvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graficos")
public class GMVController {
    @Autowired
    private CmvService cmvService;
    @GetMapping("/cmv")
    public ResponseEntity<List<Cmv>> getCmv() {
        var teste = cmvService.getCmv();

        return ResponseEntity
                .ok()
                .body(teste);
    }

    @GetMapping("/maisvendidos")
    public ResponseEntity<List<MaisVendidos>> getMaisVendidos() {
        var teste = cmvService.getMaisVendidos();

        return ResponseEntity
                .ok()
                .body(teste);
    }

    @GetMapping("/menosvendidos")
    public ResponseEntity<List<MenosVendidos>> getMenosVendidos() {
        var teste = cmvService.getMenosVendidos();

        return ResponseEntity
                .ok()
                .body(teste);
    }
}
