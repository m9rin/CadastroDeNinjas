package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listarid")
    public String mostrarNinjasPorId() {
        return "Ninjas por ID";
    }

    @PutMapping("/atualizarid")
    public String atualizarNinja() {
        return "Ninja atualizado";
    }

    @DeleteMapping("/deletar")
    public String deletarNinja() {
        return "Ninja deletado";
    }
}

