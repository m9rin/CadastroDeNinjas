package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    @PostMapping("/criar")
    public MissaoDTO criarMissao(@RequestBody MissaoDTO missao) {
        return missaoService.criarMissao(missao);
    }

    @GetMapping("/listar")
    public List<MissaoDTO> listarMissoes() {
        return missaoService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissaoDTO listarMissaoPorId(@PathVariable Long id) {
        return missaoService.listarMissaoPorId(id);
    }

    @PutMapping("/atualizar/{id}")
    public MissaoDTO atualizarMissao(@PathVariable Long id, @RequestBody MissaoDTO missaoAtualizada) {
        return missaoService.atualizarMissao(id, missaoAtualizada);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
        missaoService.deletarMissao(id);
    }
}
