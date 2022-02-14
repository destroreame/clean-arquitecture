package br.com.destroreame.escola.dominio.aluno;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    void naoDeveCriarEmailQuandoEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
    }

    @Test
    void DeveCriarEmailQuandoEnderecoCorreto() {
        Email email = new Email("emailValido@gmail.com");
        assertEquals("emailValido@gmail.com", email.getEndereco());
    }
}
