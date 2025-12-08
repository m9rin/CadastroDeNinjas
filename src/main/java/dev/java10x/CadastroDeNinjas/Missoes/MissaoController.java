package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissaoController {

    @GetMapping("/missao")
    public String missao() {
        return "Essa é a rota de missao";
    }

    @PostMapping("/criarmissao")
    public String criarMissao() {
        return "Missao criada";
    }

    @GetMapping("/mostrartodasmissoes")
    public String mostrarTodasMissoes() {
        return "Todas missoes";
    }

    @GetMapping("/mostrarmissoesid")
    public String mostrarMissoesPorId() {
        return "Missoes por ID";
    }

    @PutMapping("/atualizarmissao")
    public String atualizarMissao() {
        return "Missao atualizada";
    }

    @DeleteMapping("/deletarmissao")
    public String deletarMissao() {
        return "Missao deletada";
    }
}
