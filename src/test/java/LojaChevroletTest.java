import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LojaChevroletTest {

    @Test
    void deveRetornarAlunos() {
        LojaChevrolet loja = new LojaChevrolet();
        loja.cadastro("Fulanito", "Silva", 3243131, "Prisma LTZ", 2021, "Branco");
        loja.cadastro("Xeroxvaldo", "Costa", 2311312, "Onix", 2014, "Rosa");
        loja.cadastro("Mac", "Oliveira", 4525233, "Prisma LTZ", 2025, "Azul Oceano");
        loja.cadastro("Linux", "Santos", 4213222, "S10", 2019, "Branco");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Jose', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Maria', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Ana', cidade='Juiz de Fora', uf='MG'}",
                "Cliente{nome='Joao', cidade='Santos Dumont', uf='MG'}");

        assertEquals(saida, loja.obterClientes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Escola escola = new Escola();
        escola.matricular("Jose", "Juiz de Fora", "MG");
        escola.matricular("Maria", "Juiz de Fora", "MG");
        escola.matricular("Ana", "Juiz de Fora", "MG");
        escola.matricular("Joao", "Santos Dumont", "MG");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }

}