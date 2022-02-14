package br.com.destroreame.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    void naoDeveCriarTelefoneQuandoDDDInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "23123123"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "23123123"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "23123123"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("122", "23123123"));
    }

    @Test
    void naoDeveCriarTelefoneQuandoNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("19", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("19", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("19", "1"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("19", "23312312312312"));
    }

    @Test
    void DeveCriarTelefoneQuandoDDDeNumeroCorreto() {

        String ddd = "19";

        String numero = "32331925";
        Telefone fixo = new Telefone(ddd, numero);
        assertEquals(ddd, fixo.getDdd());
        assertEquals(numero, fixo.getNumero());

        numero = "992516339";
        Telefone celular = new Telefone(ddd, numero);
        assertEquals(ddd, celular.getDdd());
        assertEquals(numero, celular.getNumero());
    }
}
