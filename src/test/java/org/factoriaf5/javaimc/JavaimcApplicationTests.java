package org.factoriaf5.javaimc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaimcApplicationTests {

    @Test
    public void testDelgadezSevera() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(45, 1.75);
        assertEquals("Delgadez severa", result);
    }

    @Test
    public void testDelgadezModerada() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(52, 1.75);
        assertEquals("Delgadez moderada", result);
    }

    @Test
    public void testDelgadezLeve() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(55, 1.75);
        assertEquals("Delgadez leve", result);
    }

    @Test
    public void testPesoNormal() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(65, 1.75);
        assertEquals("Peso normal", result);
    }

    @Test
    public void testSobrepeso() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(80, 1.75);
        assertEquals("Sobrepeso", result);
    }

    @Test
    public void testObesidadLeve() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(95, 1.75);
        assertEquals("Obesidad leve", result);
    }

    @Test
    public void testObesidadModerada() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(115, 1.75);
        assertEquals("Obesidad moderada", result);
    }

    @Test
    public void testObesidadMorbida() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(125, 1.75);
        assertEquals("Obesidad mórbida", result);
    }

    @Test
    public void testFueraDeRango() {
        JavaimcApplication app = new JavaimcApplication();
        String result = app.calculoIMC(0, 0);
        assertEquals("Estás fuera de rango", result);
    }
}
