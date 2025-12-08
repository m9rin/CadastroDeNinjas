package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    @GetMapping("/listar")
    public String mostrarTodasMissoes() {
        return "Todas missoes";
    }

    @GetMapping("/listarid")
    public String mostrarMissoesPorId() {
        return "Missoes por ID";
    }

    @PutMapping("/atualizar")
    public String atualizarMissao() {
        return "Missao atualizada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada";
    }
}
