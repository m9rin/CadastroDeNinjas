package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/mostrarninjas")
    public String mostrarTodosNinjas() {
        return "Todos os ninjas";
    }

    @GetMapping("mostrarninjasid")
    public String mostrarNinjasPorId() {
        return "Ninjas por ID";
    }

    @PutMapping("/atualizar")
    public String atualizarNinja() {
        return "Ninja atualizado";
    }

    @DeleteMapping("/deletar")
    public String deletarNinja() {
        return "Ninja deletado";
    }
}

