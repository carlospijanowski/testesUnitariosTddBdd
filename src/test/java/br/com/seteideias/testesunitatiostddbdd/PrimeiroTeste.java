package br.com.seteideias.testesunitatiostddbdd;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test(expected = RuntimeException.class)
    public void deveSomar() {
        int numero1 = 10, numero2 = 5;
        Calculadora calculadora = new Calculadora();
        int somaDosNumeros = calculadora.somar(numero1, numero2);
        Assert.assertEquals(15, somaDosNumeros);
    }

    @Test(expected = java.lang.RuntimeException.class)
    public void naoSomaNumerosNegativos() {
        int numero1 = -10, numero2 = -5;
        Calculadora calculadora = new Calculadora();
        calculadora.somar(numero1, numero2);
    }

    public class Calculadora {
        public int somar(int num1, int num2) {
            if (num1 < 0 || num2 < 0) {
                throw new java.lang.RuntimeException("nao somo numeros negativos");
            }
            return num1 + num2;
        }
    }

}
