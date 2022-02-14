package br.com.destroreame.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    void naoDeveCriarCpfQuandoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Cpf(""));
        assertThrows(IllegalArgumentException.class, () -> new Cpf(null));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("123/233.414-12"));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("123.233.41412"));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("123.23.414-12"));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("12.233.414-12"));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("12.233.4551-12"));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("12.233.4551-1"));
    }

    @Test
    void DeveCriarCpfQuandoCorreto() {
        Cpf cpf = new Cpf("123.233.414-12");
        assertEquals("123.233.414-12", cpf.getNumero());
    }
}
