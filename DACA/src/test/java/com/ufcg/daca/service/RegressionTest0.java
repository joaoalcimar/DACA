import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.ufcg.daca.service.DisponibilizarHorarioServiceImpl disponibilizarHorarioServiceImpl0 = new com.ufcg.daca.service.DisponibilizarHorarioServiceImpl();
        try {
            boolean boolean3 = disponibilizarHorarioServiceImpl0.consultaLocal("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.ufcg.daca.service.DisponibilizarHorarioServiceImpl disponibilizarHorarioServiceImpl0 = new com.ufcg.daca.service.DisponibilizarHorarioServiceImpl();
        try {
            boolean boolean3 = disponibilizarHorarioServiceImpl0.consultaLocal("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.ufcg.daca.service.DisponibilizarHorarioServiceImpl disponibilizarHorarioServiceImpl0 = new com.ufcg.daca.service.DisponibilizarHorarioServiceImpl();
        try {
            boolean boolean4 = disponibilizarHorarioServiceImpl0.consultaHorario("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.List<com.ufcg.daca.model.Tutor> tutorList0 = com.ufcg.daca.service.DefinirTutorServiceImpl.getTutores();
        org.junit.Assert.assertNotNull(tutorList0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.ufcg.daca.service.DisponibilizarHorarioServiceImpl disponibilizarHorarioServiceImpl0 = new com.ufcg.daca.service.DisponibilizarHorarioServiceImpl();
        try {
            boolean boolean3 = disponibilizarHorarioServiceImpl0.consultaLocal("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.ufcg.daca.service.DisponibilizarHorarioServiceImpl disponibilizarHorarioServiceImpl0 = new com.ufcg.daca.service.DisponibilizarHorarioServiceImpl();
        try {
            disponibilizarHorarioServiceImpl0.cadastrarHorario("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.ufcg.daca.service.DisponibilizarHorarioServiceImpl disponibilizarHorarioServiceImpl0 = new com.ufcg.daca.service.DisponibilizarHorarioServiceImpl();
        try {
            disponibilizarHorarioServiceImpl0.cadastrarHorario("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.ufcg.daca.service.CadastrarPedidoAjudaServiceImpl.carregarDados();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.ufcg.daca.service.DisponibilizarHorarioServiceImpl disponibilizarHorarioServiceImpl0 = new com.ufcg.daca.service.DisponibilizarHorarioServiceImpl();
        try {
            disponibilizarHorarioServiceImpl0.cadastrarLocalDeAtendimento("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.ufcg.daca.service.CadastrarPedidoAjudaServiceImpl cadastrarPedidoAjudaServiceImpl0 = new com.ufcg.daca.service.CadastrarPedidoAjudaServiceImpl();
        cadastrarPedidoAjudaServiceImpl0.salvaDados();
        try {
            int int4 = cadastrarPedidoAjudaServiceImpl0.pedirAjudaOnline("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }
}

