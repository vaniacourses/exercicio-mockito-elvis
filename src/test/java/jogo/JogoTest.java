package jogo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JogoTest {
    
    private Jogo jogo;
    private Jogador jogador;
    private Dado dado1;
    private Dado dado2;

    @BeforeEach
        public void inicializa() {
        jogador = mock(Jogador.class);
        dado1 = mock(Dado.class);
        dado2 = mock(Dado.class);
        jogo = new Jogo(jogador, dado1, dado2);
    }

	
	@Test
    @DisplayName("")
	public void testSomaDoisNumeros() {
        when(dado1.numero()).thenReturn(1);
        when(dado2.numero()).thenReturn(6);
        when(jogador.lancar(dado1,dado2)).thenReturn(7);

        Assertions.assertEquals(true,jogo.jogo());
    }

	
}
