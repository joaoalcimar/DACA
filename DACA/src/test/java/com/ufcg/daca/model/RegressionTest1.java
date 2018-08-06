import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno5.setCodigoCurso(100);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        int int18 = ajuda7.getId();
        ajuda7.setDia("hi!");
        com.ufcg.daca.model.Aluno aluno21 = ajuda7.getAluno();
        ajuda7.setDisciplina("null - null - 0 - null");
        com.ufcg.daca.model.Tutor tutor30 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double31 = tutor30.getNota();
        ajuda7.setTutor(tutor30);
        tutor30.setDinheiro((double) 100L);
        tutor30.setLocalAtendimento(" - null - 0 - null");
        tutor30.setProeficiencia(0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(aluno21);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.0d + "'", double31 == 4.0d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno8.setMatricula("hi!");
        aluno8.setNome("");
        aluno8.setTelefone("null - null - 0 - null - null");
        java.lang.String str15 = aluno8.getEmail();
        com.ufcg.daca.model.Tutor tutor16 = new com.ufcg.daca.model.Tutor();
        tutor16.setStatus("hi!");
        double double19 = tutor16.getProeficiencia();
        tutor16.setDinheiro(0.0d);
        java.lang.Class<?> wildcardClass22 = tutor16.getClass();
        com.ufcg.daca.model.Ajuda ajuda23 = new com.ufcg.daca.model.Ajuda((int) (byte) 10, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", aluno8, tutor16);
        tutor16.setHorario("");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        int int18 = ajuda7.getId();
        ajuda7.setHorario("hi!");
        ajuda7.setDia("null - null - 0 - Tutor - null");
        com.ufcg.daca.model.Aluno aluno28 = null;
        com.ufcg.daca.model.Tutor tutor29 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno28, tutor29);
        ajuda30.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor33 = new com.ufcg.daca.model.Tutor();
        tutor33.setHorario("");
        tutor33.setLocalAtendimento("hi!");
        ajuda30.setTutor(tutor33);
        int int39 = ajuda30.getId();
        com.ufcg.daca.model.Aluno aluno40 = ajuda30.getAluno();
        java.lang.Class<?> wildcardClass41 = ajuda30.getClass();
        com.ufcg.daca.model.Aluno aluno47 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str48 = aluno47.getTelefone();
        java.lang.String str49 = aluno47.toString();
        java.lang.String str50 = aluno47.getMatricula();
        aluno47.setEmail("hi!");
        ajuda30.setAluno(aluno47);
        java.lang.String str54 = aluno47.getMatricula();
        java.lang.String str55 = aluno47.noTelToString();
        ajuda7.setAluno(aluno47);
        java.lang.String str57 = ajuda7.getHorario();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(aluno40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + " -  - 0 -  - hi!" + "'", str49.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + " -  - 0 - hi!" + "'", str55.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        com.ufcg.daca.model.Aluno aluno13 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str14 = aluno13.getTelefone();
        java.lang.String str15 = aluno13.toString();
        java.lang.String str16 = aluno13.getMatricula();
        aluno13.setEmail("hi!");
        java.lang.String str19 = aluno13.noTelToString();
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor();
        tutor20.setHorario("");
        tutor20.setProeficiencia((double) 0.0f);
        tutor20.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda27 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno13, tutor20);
        com.ufcg.daca.model.Tutor tutor28 = new com.ufcg.daca.model.Tutor();
        tutor28.setHorario("");
        tutor28.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass33 = tutor28.getClass();
        com.ufcg.daca.model.Ajuda ajuda34 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno13, tutor28);
        aluno13.setEmail(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 -  - hi!" + "'", str15.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + " -  - 0 - hi!" + "'", str19.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        java.lang.String str7 = ajuda0.getDisciplina();
        java.lang.String str8 = ajuda0.getDia();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setMatricula("hi!");
        java.lang.String str11 = aluno5.getEmail();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno10.setMatricula(" -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setNivel("null - null - 0 - null - null");
        double double16 = tutor13.getProeficiencia();
        tutor13.setMatricula("Tutor");
        tutor13.setNivel("hi!");
        com.ufcg.daca.model.Ajuda ajuda21 = new com.ufcg.daca.model.Ajuda((-1), "", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", " - null - null - 0 - null - 0 -  - hi!", aluno10, tutor13);
        java.lang.String str22 = aluno10.noTelToString();
        java.lang.Class<?> wildcardClass23 = aluno10.getClass();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + " -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!" + "'", str22.equals(" -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        int int18 = ajuda7.getId();
        ajuda7.setHorario("hi!");
        ajuda7.setDia("null - null - 0 - Tutor - null");
        ajuda7.setDisciplina(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" - null - null - 0 - null - 0 -  - hi!", " -  - 0 - null - null - 0 - null - null", (int) (short) 10, "hi! -  - 0 - hi!", "", "null - null - null - 0 - null - null - 0 - null - null");
        tutor6.setMatricula("TOP");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getLocalAtendimento();
        tutor0.setHorario("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setLocal("Tutor");
        ajuda0.setDia(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        aluno0.setNome(" -  - 0 -  - hi!");
        aluno0.setTelefone(" - null - 0 - null");
        java.lang.String str6 = aluno0.getMatricula();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        com.ufcg.daca.model.Ajuda ajuda5 = new com.ufcg.daca.model.Ajuda();
        boolean boolean6 = ajuda5.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno12 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str13 = aluno12.getTelefone();
        java.lang.String str14 = aluno12.toString();
        ajuda5.setAluno(aluno12);
        java.lang.String str16 = aluno12.getEmail();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor23.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno12, tutor23);
        java.lang.String str27 = aluno12.noTelToString();
        aluno12.setNome("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 -  - hi!" + "'", str14.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + " -  - 0 - hi!" + "'", str27.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        ajuda7.setId(10);
        java.lang.String str20 = ajuda7.getDia();
        ajuda7.setId((int) (byte) 0);
        ajuda7.setLocal(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" -  - 100 - hi!", "", (int) (short) -1, "null - null - 0 - Tutor - null", " - null - 0 - null", " -  - 0 -  - hi!");
        tutor6.setStatus("null - null - 0 - Tutor - null");
        java.lang.String str9 = tutor6.getDisciplina();
        tutor6.setHorario(" -  - 52 - hi!");
        tutor6.setLocalAtendimento("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        com.ufcg.daca.model.Aluno aluno14 = ajuda7.getAluno();
        ajuda7.setId((int) (byte) 0);
        ajuda7.setDia("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        org.junit.Assert.assertNull(aluno14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        aluno7.setEmail("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        java.lang.String str14 = aluno7.getNome();
        aluno7.setEmail("null - null - 0 - null");
        java.lang.String str17 = aluno7.getTelefone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setStatus("");
        java.lang.String str12 = tutor6.getDisciplina();
        tutor6.setMatricula("null - null - null - 0 - null - null - 0 - null - null");
        java.lang.String str15 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        com.ufcg.daca.model.Aluno aluno16 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str17 = aluno16.getTelefone();
        java.lang.String str18 = aluno16.toString();
        java.lang.String str19 = aluno16.getMatricula();
        aluno16.setEmail("hi!");
        java.lang.String str22 = aluno16.noTelToString();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setProeficiencia((double) 0.0f);
        tutor23.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno16, tutor23);
        com.ufcg.daca.model.Tutor tutor31 = new com.ufcg.daca.model.Tutor();
        tutor31.setHorario("");
        tutor31.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass36 = tutor31.getClass();
        com.ufcg.daca.model.Ajuda ajuda37 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno16, tutor31);
        java.lang.String str38 = aluno16.getNome();
        com.ufcg.daca.model.Tutor tutor45 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double46 = tutor45.getNota();
        tutor45.setNivel(" -  - 0 -  - hi!");
        java.lang.String str49 = tutor45.getHorario();
        com.ufcg.daca.model.Ajuda ajuda50 = new com.ufcg.daca.model.Ajuda((int) (short) 100, "null - null - 0 - null", " -  - 0 - null - null - 0 - null - null", aluno16, tutor45);
        ajuda50.setDia(" -  - 0 - null - null - 0 - null - null");
        ajuda50.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + " -  - 0 -  - hi!" + "'", str18.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + " -  - 0 - hi!" + "'", str22.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        tutor10.setLocalAtendimento("hi!");
        tutor10.setMatricula("null - null - 0 - null - null");
        double double20 = tutor10.getProeficiencia();
        java.lang.String str21 = tutor10.getHorario();
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setHorario("Tutor");
        ajuda7.setDisciplina(" - null - null - 0 - null - 0 -  - hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        java.lang.String str18 = ajuda7.getDisciplina();
        java.lang.String str19 = ajuda7.getHorario();
        com.ufcg.daca.model.Tutor tutor20 = ajuda7.getTutor();
        tutor20.setDinheiro((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(tutor20);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        aluno3.setTelefone("Tutor");
        java.lang.String str14 = aluno3.getEmail();
        aluno3.setEmail(" -  - 0 - hi!");
        java.lang.String str17 = aluno3.getEmail();
        aluno3.setMatricula("null - null - 0 - Tutor - null");
        java.lang.Class<?> wildcardClass20 = aluno3.getClass();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 - hi!" + "'", str17.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        tutor6.setMatricula("hi!");
        tutor6.setLocalAtendimento(" -  - 100 - hi!");
        tutor6.setProeficiencia((int) (byte) 10);
        tutor6.setNivel("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) 'a', "null - null - 0 - Tutor - null", " - null - 0 - null", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        tutor6.setStatus("Tutor");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNota((double) 1L);
        tutor0.setLocalAtendimento(" -  - 52 - hi!");
        java.lang.String str8 = tutor0.getDiaDisponivel();
        double double9 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno(" -  - 0 - hi!", "null - null - null - 0 - null - null - 0 - null - null", (int) (short) -1, " -  - 0 -  - hi!", "hi! -  - 0 - hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno10.setMatricula(" -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setNivel("null - null - 0 - null - null");
        double double16 = tutor13.getProeficiencia();
        tutor13.setMatricula("Tutor");
        tutor13.setNivel("hi!");
        com.ufcg.daca.model.Ajuda ajuda21 = new com.ufcg.daca.model.Ajuda((-1), "", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", " - null - null - 0 - null - 0 -  - hi!", aluno10, tutor13);
        tutor13.setHorario("TOP");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setHorario(" - null - 0 - null");
        tutor6.setHorario("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        double double10 = tutor0.getProeficiencia();
        java.lang.String str11 = tutor0.getHorario();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        java.lang.String str12 = ajuda7.getLocal();
        com.ufcg.daca.model.Tutor tutor13 = ajuda7.getTutor();
        ajuda7.setLocal(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(tutor13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        com.ufcg.daca.model.Aluno aluno20 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str21 = aluno20.toString();
        aluno20.setEmail("null - null - 0 - null - null");
        java.lang.String str24 = aluno20.getEmail();
        java.lang.String str25 = aluno20.noTelToString();
        java.lang.String str26 = aluno20.noTelToString();
        aluno20.setTelefone("null - null - 0 - null");
        int int29 = aluno20.getCodigoCurso();
        ajuda7.setAluno(aluno20);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + " -  - 0 -  - hi!" + "'", str21.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null - null - 0 - null - null" + "'", str24.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str25.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str26.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda();
        boolean boolean12 = ajuda11.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno18 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str19 = aluno18.getTelefone();
        java.lang.String str20 = aluno18.toString();
        ajuda11.setAluno(aluno18);
        java.lang.String str22 = aluno18.getEmail();
        com.ufcg.daca.model.Tutor tutor29 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor29.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda32 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno18, tutor29);
        com.ufcg.daca.model.Tutor tutor33 = new com.ufcg.daca.model.Tutor();
        tutor33.setNivel("null - null - 0 - null - null");
        double double36 = tutor33.getProeficiencia();
        tutor33.setDinheiro(10.0d);
        com.ufcg.daca.model.Ajuda ajuda39 = new com.ufcg.daca.model.Ajuda((int) (short) 10, "Tutor", " -  - 100 - hi!", aluno18, tutor33);
        com.ufcg.daca.model.Tutor tutor46 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double47 = tutor46.getNota();
        tutor46.setHorario("hi!");
        double double50 = tutor46.getNota();
        tutor46.setNota((double) 1L);
        tutor46.setProeficiencia((double) (byte) 0);
        com.ufcg.daca.model.Ajuda ajuda55 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "hi! -  - 0 - hi!", " -  - 0 - hi!", aluno18, tutor46);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + " -  - 0 -  - hi!" + "'", str20.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4.0d + "'", double47 == 4.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.0d + "'", double50 == 4.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getDisciplina();
        java.lang.String str10 = tutor6.getNivel();
        tutor6.setHorario(" -  - 0 - hi!");
        java.lang.String str13 = tutor6.getLocalAtendimento();
        java.lang.Class<?> wildcardClass14 = tutor6.getClass();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Tutor" + "'", str10.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        ajuda28.setHorario(" - null - null - 0 - null - 0 -  - hi!");
        ajuda28.setLocal(" -  - 0 - null - null - 0 - null - null");
        java.lang.String str33 = ajuda28.getHorario();
        com.ufcg.daca.model.Tutor tutor40 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double41 = tutor40.getNota();
        tutor40.setHorario("hi!");
        double double44 = tutor40.getNota();
        tutor40.setNota((double) 1L);
        tutor40.setNota((double) 1L);
        ajuda28.setTutor(tutor40);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " - null - null - 0 - null - 0 -  - hi!" + "'", str33.equals(" - null - null - 0 - null - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.0d + "'", double44 == 4.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        double double5 = tutor0.getDinheiro();
        tutor0.setLocalAtendimento("hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        boolean boolean18 = ajuda7.isAvaliacao();
        ajuda7.setDisciplina(" - null - 0 - null");
        java.lang.String str21 = ajuda7.getDia();
        java.lang.String str22 = ajuda7.getDia();
        ajuda7.setId((int) (byte) 0);
        java.lang.String str25 = ajuda7.getHorario();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.getMatricula();
        java.lang.String str7 = aluno5.toString();
        aluno5.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str10 = aluno5.getNome();
        com.ufcg.daca.model.Tutor tutor11 = new com.ufcg.daca.model.Tutor();
        tutor11.setStatus("hi!");
        double double14 = tutor11.getProeficiencia();
        tutor11.setDinheiro(0.0d);
        java.lang.Class<?> wildcardClass17 = tutor11.getClass();
        java.lang.String str18 = tutor11.getHorario();
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda(0, " -  - 0 -  - hi!", " - null - 0 - null", "hi!", "null - null - null - 0 - null - null - 0 - null - null", aluno5, tutor11);
        ajuda19.setDisciplina("null - null - 0 - null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        double double8 = tutor6.getProeficiencia();
        tutor6.setProeficiencia((double) (byte) 10);
        java.lang.String str11 = tutor6.getNivel();
        tutor6.setProeficiencia(10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Tutor" + "'", str11.equals("Tutor"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        java.lang.String str7 = ajuda0.getDisciplina();
        com.ufcg.daca.model.Aluno aluno13 = null;
        com.ufcg.daca.model.Tutor tutor14 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda15 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno13, tutor14);
        ajuda15.setAvaliacao(false);
        ajuda15.setAvaliacao(false);
        ajuda15.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor28 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str29 = tutor28.getMatricula();
        java.lang.String str30 = tutor28.getDiaDisponivel();
        ajuda15.setTutor(tutor28);
        java.lang.String str32 = tutor28.getLocalAtendimento();
        tutor28.setLocalAtendimento("");
        ajuda0.setTutor(tutor28);
        tutor28.setLocalAtendimento(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        aluno3.setMatricula("");
        java.lang.String str6 = aluno3.getMatricula();
        java.lang.String str7 = aluno3.noTelToString();
        java.lang.String str8 = aluno3.getMatricula();
        int int9 = aluno3.getCodigoCurso();
        com.ufcg.daca.model.Aluno aluno20 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str21 = aluno20.getTelefone();
        com.ufcg.daca.model.Tutor tutor22 = new com.ufcg.daca.model.Tutor();
        tutor22.setHorario("");
        tutor22.setLocalAtendimento("hi!");
        tutor22.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno20, tutor22);
        java.lang.String str30 = tutor22.getNivel();
        double double31 = tutor22.getDinheiro();
        com.ufcg.daca.model.Ajuda ajuda32 = new com.ufcg.daca.model.Ajuda((int) (short) 0, " -  - 52 -  - hi!", " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", aluno3, tutor22);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " - null - 0 - null" + "'", str7.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Tutor" + "'", str30.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        int int18 = ajuda7.getId();
        ajuda7.setDia("hi!");
        com.ufcg.daca.model.Tutor tutor21 = ajuda7.getTutor();
        java.lang.String str22 = tutor21.getStatus();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(tutor21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setCodigoCurso((int) (short) 100);
        java.lang.String str12 = aluno8.getNome();
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setStatus("hi!");
        double double16 = tutor13.getProeficiencia();
        com.ufcg.daca.model.Ajuda ajuda17 = new com.ufcg.daca.model.Ajuda((int) (byte) 10, "null - null - 0 -  -  - 0 -  - hi! - null", " -  - 0 - hi!", aluno8, tutor13);
        tutor13.setNivel(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        java.lang.String str20 = tutor13.getMatricula();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        com.ufcg.daca.model.Aluno aluno13 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str14 = aluno13.getTelefone();
        java.lang.String str15 = aluno13.toString();
        java.lang.String str16 = aluno13.getMatricula();
        aluno13.setEmail("hi!");
        java.lang.String str19 = aluno13.noTelToString();
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor();
        tutor20.setHorario("");
        tutor20.setProeficiencia((double) 0.0f);
        tutor20.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda27 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno13, tutor20);
        com.ufcg.daca.model.Tutor tutor28 = new com.ufcg.daca.model.Tutor();
        tutor28.setHorario("");
        tutor28.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass33 = tutor28.getClass();
        com.ufcg.daca.model.Ajuda ajuda34 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno13, tutor28);
        tutor28.setDiaDisponivel(" - null - 0 - null");
        tutor28.setDiaDisponivel("null - null - null - 0 - null - null - 0 - null - null");
        tutor28.setDinheiro(0.0d);
        tutor28.setDinheiro((double) 10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 -  - hi!" + "'", str15.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + " -  - 0 - hi!" + "'", str19.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setCodigoCurso((int) (short) 100);
        java.lang.String str12 = aluno8.getNome();
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setStatus("hi!");
        double double16 = tutor13.getProeficiencia();
        com.ufcg.daca.model.Ajuda ajuda17 = new com.ufcg.daca.model.Ajuda((int) (byte) 10, "null - null - 0 -  -  - 0 -  - hi! - null", " -  - 0 - hi!", aluno8, tutor13);
        java.lang.String str18 = tutor13.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        aluno0.setMatricula("");
        java.lang.String str3 = aluno0.getMatricula();
        java.lang.String str4 = aluno0.noTelToString();
        aluno0.setCodigoCurso((int) (short) 0);
        java.lang.String str7 = aluno0.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + " - null - 0 - null" + "'", str4.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " - null - 0 - null - null" + "'", str7.equals(" - null - 0 - null - null"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        tutor0.setLocalAtendimento("");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        ajuda0.setHorario(" -  - 0 -  - hi!");
        java.lang.String str10 = ajuda0.getDia();
        com.ufcg.daca.model.Aluno aluno11 = ajuda0.getAluno();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aluno11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        ajuda28.setHorario(" - null - null - 0 - null - 0 -  - hi!");
        ajuda28.setLocal(" -  - 0 - null - null - 0 - null - null");
        java.lang.String str33 = ajuda28.getHorario();
        com.ufcg.daca.model.Tutor tutor34 = new com.ufcg.daca.model.Tutor();
        tutor34.setHorario("");
        tutor34.setLocalAtendimento("hi!");
        double double39 = tutor34.getDinheiro();
        tutor34.setStatus(" -  - 0 - hi!");
        ajuda28.setTutor(tutor34);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " - null - null - 0 - null - 0 -  - hi!" + "'", str33.equals(" - null - null - 0 - null - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str21 = tutor20.getMatricula();
        java.lang.String str22 = tutor20.getDiaDisponivel();
        ajuda7.setTutor(tutor20);
        java.lang.String str24 = tutor20.getLocalAtendimento();
        java.lang.String str25 = tutor20.getMatricula();
        double double26 = tutor20.getDinheiro();
        java.lang.String str27 = tutor20.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null - null - null - 0 - null - null - 0 - null - null", " -  - 0 - null - null - 0 - null - null", (int) (short) 0, "null - null - 0 - null - null", "null - null - 0 - null - null");
        java.lang.String str6 = aluno5.toString();
        java.lang.String str7 = aluno5.getMatricula();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null" + "'", str6.equals(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str7.equals(" -  - 0 - null - null - 0 - null - null"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getLocalAtendimento();
        tutor0.setLocalAtendimento(" -  - 0 - hi!");
        java.lang.String str10 = tutor0.getStatus();
        java.lang.Class<?> wildcardClass11 = tutor0.getClass();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        int int29 = ajuda28.getId();
        ajuda28.setAvaliacao(true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor();
        tutor8.setHorario("");
        tutor8.setLocalAtendimento("hi!");
        tutor8.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda15 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno5, tutor8);
        ajuda15.setLocal(" -  - 100 - hi!");
        com.ufcg.daca.model.Aluno aluno18 = ajuda15.getAluno();
        boolean boolean19 = ajuda15.isAvaliacao();
        org.junit.Assert.assertNotNull(aluno18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double7 = tutor6.getDinheiro();
        tutor6.setMatricula(" -  - 0 -  - hi!");
        double double10 = tutor6.getNota();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor9 = ajuda0.getTutor();
        java.lang.String str10 = ajuda0.getHorario();
        com.ufcg.daca.model.Tutor tutor11 = new com.ufcg.daca.model.Tutor();
        tutor11.setStatus("hi!");
        tutor11.setDiaDisponivel("null - null - 0 - null - null");
        java.lang.String str16 = tutor11.getDisciplina();
        ajuda0.setTutor(tutor11);
        org.junit.Assert.assertNull(tutor9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setDiaDisponivel("hi!");
        double double10 = tutor0.getProeficiencia();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        java.lang.Class<?> wildcardClass18 = ajuda7.getClass();
        com.ufcg.daca.model.Aluno aluno24 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str25 = aluno24.getTelefone();
        java.lang.String str26 = aluno24.toString();
        java.lang.String str27 = aluno24.getMatricula();
        aluno24.setEmail("hi!");
        ajuda7.setAluno(aluno24);
        java.lang.String str31 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno32 = ajuda7.getAluno();
        ajuda7.setId((int) (byte) 1);
        com.ufcg.daca.model.Aluno aluno35 = ajuda7.getAluno();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNotNull(aluno32);
        org.junit.Assert.assertNotNull(aluno35);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getNome();
        aluno5.setCodigoCurso((-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", " -  - 52 - hi!", 0, "null - null - 0 - null", " - null - 0 - null");
        java.lang.String str6 = aluno5.getMatricula();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 52 - hi!" + "'", str6.equals(" -  - 52 - hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.getMatricula();
        aluno5.setNome(" -  - 0 -  - hi!");
        java.lang.String str9 = aluno5.getMatricula();
        com.ufcg.daca.model.Tutor tutor16 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor16.setMatricula("");
        double double19 = tutor16.getProeficiencia();
        com.ufcg.daca.model.Ajuda ajuda20 = new com.ufcg.daca.model.Ajuda(1, " -  - 100 - hi!", "null - null - 0 - null", " - null - 0 - null", " -  - 0 - null - null - 0 - null - null", aluno5, tutor16);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass5 = tutor0.getClass();
        java.lang.String str6 = tutor0.getDiaDisponivel();
        java.lang.String str7 = tutor0.getDiaDisponivel();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.Class<?> wildcardClass8 = tutor6.getClass();
        java.lang.String str9 = tutor6.getLocalAtendimento();
        tutor6.setProeficiencia((int) (byte) -1);
        tutor6.setDisciplina(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno5.setMatricula("hi!");
        aluno5.setNome("");
        aluno5.setTelefone("null - null - 0 - null - null");
        java.lang.String str12 = aluno5.getEmail();
        aluno5.setEmail(" -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!");
        java.lang.String str15 = aluno5.getNome();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        tutor0.setDiaDisponivel("hi!");
        java.lang.String str5 = tutor0.getDisciplina();
        tutor0.setStatus("hi! -  - 0 - hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        double double3 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        com.ufcg.daca.model.Aluno aluno13 = new com.ufcg.daca.model.Aluno();
        aluno13.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor16 = new com.ufcg.daca.model.Tutor();
        tutor16.setHorario("");
        tutor16.setLocalAtendimento("hi!");
        tutor16.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda23 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno13, tutor16);
        java.lang.String str24 = aluno13.getMatricula();
        com.ufcg.daca.model.Tutor tutor25 = new com.ufcg.daca.model.Tutor();
        tutor25.setHorario("");
        tutor25.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass30 = tutor25.getClass();
        tutor25.setHorario(" -  - 0 -  - hi!");
        com.ufcg.daca.model.Ajuda ajuda33 = new com.ufcg.daca.model.Ajuda((-1), " - null - 0 - null", "null - null - 0 - null - null", aluno13, tutor25);
        com.ufcg.daca.model.Tutor tutor34 = new com.ufcg.daca.model.Tutor();
        tutor34.setHorario("");
        tutor34.setLocalAtendimento("hi!");
        tutor34.setProeficiencia((double) 1L);
        java.lang.String str41 = tutor34.getLocalAtendimento();
        tutor34.setLocalAtendimento(" -  - 0 - hi!");
        double double44 = tutor34.getProeficiencia();
        com.ufcg.daca.model.Ajuda ajuda45 = new com.ufcg.daca.model.Ajuda((int) '#', " -  - 0 - hi!", " -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!", " -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!", " -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!", aluno13, tutor34);
        aluno13.setEmail(" - null - 0 - null");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getLocalAtendimento();
        tutor0.setLocalAtendimento(" -  - 0 - hi!");
        java.lang.String str10 = tutor0.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        com.ufcg.daca.model.Tutor tutor15 = ajuda7.getTutor();
        ajuda7.setId((int) (short) -1);
        ajuda7.setAvaliacao(false);
        java.lang.String str20 = ajuda7.getHorario();
        com.ufcg.daca.model.Aluno aluno26 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno26.setMatricula("hi!");
        aluno26.setNome("");
        aluno26.setTelefone("null - null - 0 - null - null");
        java.lang.String str33 = aluno26.getMatricula();
        ajuda7.setAluno(aluno26);
        java.lang.String str35 = ajuda7.getHorario();
        ajuda7.setLocal("");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getLocalAtendimento();
        tutor6.setMatricula("TOP");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        com.ufcg.daca.model.Ajuda ajuda5 = new com.ufcg.daca.model.Ajuda();
        boolean boolean6 = ajuda5.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno12 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str13 = aluno12.getTelefone();
        java.lang.String str14 = aluno12.toString();
        ajuda5.setAluno(aluno12);
        java.lang.String str16 = aluno12.getEmail();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor23.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno12, tutor23);
        tutor23.setDisciplina("null - null - null - 0 - null - null - 0 - null - null");
        double double29 = tutor23.getNota();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 -  - hi!" + "'", str14.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = ajuda0.getDia();
        java.lang.String str12 = ajuda0.getDia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        java.lang.Class<?> wildcardClass18 = ajuda7.getClass();
        java.lang.String str19 = ajuda7.getDia();
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        double double8 = tutor6.getNota();
        double double9 = tutor6.getNota();
        java.lang.String str10 = tutor6.getDisciplina();
        double double11 = tutor6.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        java.lang.String str4 = aluno3.noTelToString();
        java.lang.String str5 = aluno3.noTelToString();
        aluno3.setMatricula("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        aluno3.setTelefone(" - null - 0 - null");
        java.lang.String str10 = aluno3.getTelefone();
        com.ufcg.daca.model.Tutor tutor17 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double18 = tutor17.getNota();
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda(0, " - null - 0 - null", "null - null - 0 - null", aluno3, tutor17);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null - null - 0 - null" + "'", str4.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null - null - 0 - null" + "'", str5.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " - null - 0 - null" + "'", str10.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        ajuda7.setAvaliacao(true);
        ajuda7.setAvaliacao(true);
        ajuda7.setAvaliacao(true);
        java.lang.String str23 = ajuda7.getHorario();
        int int24 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        ajuda0.setHorario(" -  - 0 -  - hi!");
        java.lang.String str10 = ajuda0.getDia();
        com.ufcg.daca.model.Tutor tutor17 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str18 = tutor17.getMatricula();
        java.lang.String str19 = tutor17.getDiaDisponivel();
        java.lang.String str20 = tutor17.getNivel();
        double double21 = tutor17.getNota();
        java.lang.String str22 = tutor17.getMatricula();
        ajuda0.setTutor(tutor17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Tutor" + "'", str20.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setEmail("null - null - 0 - null - null");
        java.lang.String str9 = aluno5.getEmail();
        java.lang.String str10 = aluno5.noTelToString();
        java.lang.String str11 = aluno5.noTelToString();
        aluno5.setTelefone("null - null - 0 - null");
        aluno5.setCodigoCurso((int) (byte) 10);
        aluno5.setNome("null - null - null - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null - null - 0 - null - null" + "'", str9.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str10.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str11.equals(" -  - 0 - null - null - 0 - null - null"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        com.ufcg.daca.model.Aluno aluno16 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str17 = aluno16.getTelefone();
        java.lang.String str18 = aluno16.toString();
        java.lang.String str19 = aluno16.getMatricula();
        aluno16.setEmail("hi!");
        java.lang.String str22 = aluno16.noTelToString();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setProeficiencia((double) 0.0f);
        tutor23.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno16, tutor23);
        com.ufcg.daca.model.Tutor tutor31 = new com.ufcg.daca.model.Tutor();
        tutor31.setHorario("");
        tutor31.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass36 = tutor31.getClass();
        com.ufcg.daca.model.Ajuda ajuda37 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno16, tutor31);
        java.lang.String str38 = aluno16.getNome();
        com.ufcg.daca.model.Tutor tutor45 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double46 = tutor45.getNota();
        tutor45.setNivel(" -  - 0 -  - hi!");
        java.lang.String str49 = tutor45.getHorario();
        com.ufcg.daca.model.Ajuda ajuda50 = new com.ufcg.daca.model.Ajuda((int) (short) 100, "null - null - 0 - null", " -  - 0 - null - null - 0 - null - null", aluno16, tutor45);
        ajuda50.setDia(" -  - 0 - null - null - 0 - null - null");
        ajuda50.setDisciplina("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + " -  - 0 -  - hi!" + "'", str18.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + " -  - 0 - hi!" + "'", str22.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setId((int) '4');
        int int10 = ajuda7.getId();
        com.ufcg.daca.model.Tutor tutor17 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str18 = tutor17.getMatricula();
        java.lang.String str19 = tutor17.getDiaDisponivel();
        java.lang.String str20 = tutor17.getNivel();
        tutor17.setStatus("");
        java.lang.String str23 = tutor17.getStatus();
        ajuda7.setTutor(tutor17);
        java.lang.String str25 = tutor17.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Tutor" + "'", str20.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setDiaDisponivel("null - null - null - 0 - null - null - 0 - null - null");
        java.lang.String str12 = tutor6.getHorario();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        ajuda7.setHorario("hi!");
        java.lang.String str19 = ajuda7.getHorario();
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor(" -  - 0 - hi!", "null - null - 0 - null", 0, "hi!", "Tutor", "hi!");
        ajuda7.setTutor(tutor26);
        ajuda7.setId((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        ajuda7.setHorario("hi!");
        java.lang.String str19 = ajuda7.getHorario();
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor(" -  - 0 - hi!", "null - null - 0 - null", 0, "hi!", "Tutor", "hi!");
        ajuda7.setTutor(tutor26);
        java.lang.String str28 = tutor26.getStatus();
        double double29 = tutor26.getNota();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        com.ufcg.daca.model.Tutor tutor15 = ajuda7.getTutor();
        ajuda7.setId((int) (short) -1);
        com.ufcg.daca.model.Tutor tutor18 = new com.ufcg.daca.model.Tutor();
        tutor18.setNivel("null - null - 0 - null - null");
        double double21 = tutor18.getProeficiencia();
        tutor18.setNota((double) 1L);
        java.lang.String str24 = tutor18.getDisciplina();
        ajuda7.setTutor(tutor18);
        int int26 = ajuda7.getId();
        ajuda7.setDisciplina("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        com.ufcg.daca.model.Aluno aluno10 = null;
        com.ufcg.daca.model.Tutor tutor11 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda12 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno10, tutor11);
        ajuda12.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor15 = new com.ufcg.daca.model.Tutor();
        tutor15.setHorario("");
        tutor15.setLocalAtendimento("hi!");
        ajuda12.setTutor(tutor15);
        int int21 = ajuda12.getId();
        com.ufcg.daca.model.Aluno aluno22 = ajuda12.getAluno();
        java.lang.Class<?> wildcardClass23 = ajuda12.getClass();
        com.ufcg.daca.model.Aluno aluno29 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str30 = aluno29.getTelefone();
        java.lang.String str31 = aluno29.toString();
        java.lang.String str32 = aluno29.getMatricula();
        aluno29.setEmail("hi!");
        ajuda12.setAluno(aluno29);
        java.lang.String str36 = ajuda12.getDia();
        com.ufcg.daca.model.Aluno aluno37 = ajuda12.getAluno();
        java.lang.String str38 = aluno37.noTelToString();
        com.ufcg.daca.model.Aluno aluno44 = new com.ufcg.daca.model.Aluno();
        java.lang.String str45 = aluno44.getMatricula();
        java.lang.String str46 = aluno44.toString();
        aluno44.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str49 = aluno44.noTelToString();
        com.ufcg.daca.model.Aluno aluno55 = null;
        com.ufcg.daca.model.Tutor tutor56 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda57 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno55, tutor56);
        ajuda57.setAvaliacao(false);
        ajuda57.setAvaliacao(false);
        ajuda57.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor70 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str71 = tutor70.getMatricula();
        java.lang.String str72 = tutor70.getDiaDisponivel();
        ajuda57.setTutor(tutor70);
        com.ufcg.daca.model.Ajuda ajuda74 = new com.ufcg.daca.model.Ajuda(100, "", "null - null - 0 - Tutor - null", " -  - 0 - hi!", "null - null - 0 - null - null", aluno44, tutor70);
        tutor70.setNivel(" -  - 0 -  - hi!");
        com.ufcg.daca.model.Ajuda ajuda77 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 - hi!", " -  - 0 - hi!", " -  - 0 - hi!", " - null - 0 - null - null", aluno37, tutor70);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(aluno22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + " -  - 0 -  - hi!" + "'", str31.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertNotNull(aluno37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + " -  - 0 - hi!" + "'", str38.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "null - null - 0 - null - null" + "'", str46.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "null - null - 0 - null" + "'", str49.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        java.lang.String str12 = aluno7.getTelefone();
        java.lang.String str13 = aluno7.noTelToString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 - hi!" + "'", str13.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.toString();
        aluno10.setCodigoCurso((int) (short) 100);
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor(" -  - 52 - hi!", "", (int) '#', " -  - 0 -  - hi!", "null - null - 0 - Tutor - null", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        java.lang.String str21 = tutor20.getDiaDisponivel();
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda((int) (byte) 1, " - null - 0 - null - null", "", "TOP", " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", aluno10, tutor20);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 -  - hi!" + "'", str11.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null - null - 0 - Tutor - null" + "'", str21.equals("null - null - 0 - Tutor - null"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor();
        tutor8.setHorario("");
        tutor8.setLocalAtendimento("hi!");
        tutor8.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda15 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno5, tutor8);
        java.lang.String str16 = aluno5.getMatricula();
        java.lang.String str17 = aluno5.getTelefone();
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        aluno0.setMatricula("null - null - 0 - Tutor - null");
        java.lang.String str3 = aluno0.getTelefone();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        tutor0.setMatricula("hi!");
        tutor0.setProeficiencia((int) '#');
        java.lang.String str14 = tutor0.getDiaDisponivel();
        java.lang.String str15 = tutor0.getHorario();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        double double7 = tutor0.getProeficiencia();
        java.lang.String str8 = tutor0.getNivel();
        tutor0.setNota((double) 1L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        boolean boolean4 = ajuda0.isAvaliacao();
        java.lang.String str5 = ajuda0.getDisciplina();
        boolean boolean6 = ajuda0.isAvaliacao();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        double double8 = tutor6.getNota();
        double double9 = tutor6.getNota();
        java.lang.String str10 = tutor6.getLocalAtendimento();
        tutor6.setLocalAtendimento(" - null - 0 - null");
        tutor6.setHorario(" - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        com.ufcg.daca.model.Aluno aluno11 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str12 = aluno11.getTelefone();
        java.lang.String str13 = aluno11.toString();
        com.ufcg.daca.model.Aluno aluno27 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str28 = aluno27.getTelefone();
        java.lang.String str29 = aluno27.toString();
        java.lang.String str30 = aluno27.getMatricula();
        aluno27.setEmail("hi!");
        java.lang.String str33 = aluno27.noTelToString();
        com.ufcg.daca.model.Tutor tutor34 = new com.ufcg.daca.model.Tutor();
        tutor34.setHorario("");
        tutor34.setProeficiencia((double) 0.0f);
        tutor34.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda41 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno27, tutor34);
        com.ufcg.daca.model.Tutor tutor42 = new com.ufcg.daca.model.Tutor();
        tutor42.setHorario("");
        tutor42.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass47 = tutor42.getClass();
        com.ufcg.daca.model.Ajuda ajuda48 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno27, tutor42);
        tutor42.setDiaDisponivel(" - null - 0 - null");
        com.ufcg.daca.model.Ajuda ajuda51 = new com.ufcg.daca.model.Ajuda((int) ' ', "null - null - 0 - null", " -  - 0 - hi!", aluno11, tutor42);
        aluno11.setMatricula(" -  - 100 - hi!");
        com.ufcg.daca.model.Tutor tutor54 = new com.ufcg.daca.model.Tutor();
        tutor54.setNivel("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda57 = new com.ufcg.daca.model.Ajuda(10, " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", " -  - null - 0 - null - 0 - null", aluno11, tutor54);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 -  - hi!" + "'", str13.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 -  - hi!" + "'", str29.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " -  - 0 - hi!" + "'", str33.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        ajuda7.setLocal("null - null - 0 - null");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        java.lang.String str6 = ajuda0.getLocal();
        boolean boolean7 = ajuda0.isAvaliacao();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        java.lang.String str4 = tutor0.getMatricula();
        tutor0.setDisciplina("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId(100);
        int int16 = ajuda7.getId();
        ajuda7.setDia("Tutor");
        boolean boolean19 = ajuda7.isAvaliacao();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        com.ufcg.daca.model.Ajuda ajuda5 = new com.ufcg.daca.model.Ajuda();
        boolean boolean6 = ajuda5.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno12 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str13 = aluno12.getTelefone();
        java.lang.String str14 = aluno12.toString();
        ajuda5.setAluno(aluno12);
        java.lang.String str16 = aluno12.getEmail();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor23.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno12, tutor23);
        java.lang.String str27 = aluno12.getNome();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 -  - hi!" + "'", str14.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        com.ufcg.daca.model.Aluno aluno11 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str12 = aluno11.getTelefone();
        java.lang.String str13 = aluno11.toString();
        java.lang.String str14 = aluno11.getMatricula();
        aluno11.setEmail("hi!");
        java.lang.String str17 = aluno11.noTelToString();
        com.ufcg.daca.model.Tutor tutor18 = new com.ufcg.daca.model.Tutor();
        tutor18.setHorario("");
        tutor18.setProeficiencia((double) 0.0f);
        tutor18.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda25 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno11, tutor18);
        com.ufcg.daca.model.Aluno aluno26 = ajuda25.getAluno();
        aluno26.setMatricula(" -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor35 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double36 = tutor35.getDinheiro();
        com.ufcg.daca.model.Ajuda ajuda37 = new com.ufcg.daca.model.Ajuda((int) 'a', "null - null - null - 0 - null - null - 0 - null - null", " -  - 100 - hi!", aluno26, tutor35);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 -  - hi!" + "'", str13.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 - hi!" + "'", str17.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(aluno26);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        ajuda0.setHorario(" -  - 0 -  - hi!");
        com.ufcg.daca.model.Aluno aluno10 = ajuda0.getAluno();
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(aluno10);
        org.junit.Assert.assertNull(tutor11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setId((int) '4');
        java.lang.String str10 = ajuda7.getDia();
        ajuda7.setHorario("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        com.ufcg.daca.model.Aluno aluno11 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str12 = aluno11.getTelefone();
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setHorario("");
        tutor13.setLocalAtendimento("hi!");
        tutor13.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda20 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno11, tutor13);
        tutor13.setProeficiencia((double) (short) -1);
        double double23 = tutor13.getProeficiencia();
        ajuda0.setTutor(tutor13);
        tutor13.setProeficiencia((double) 10L);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        com.ufcg.daca.model.Aluno aluno16 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str17 = aluno16.getTelefone();
        java.lang.String str18 = aluno16.toString();
        java.lang.String str19 = aluno16.getMatricula();
        aluno16.setEmail("hi!");
        java.lang.String str22 = aluno16.noTelToString();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setProeficiencia((double) 0.0f);
        tutor23.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno16, tutor23);
        com.ufcg.daca.model.Tutor tutor31 = new com.ufcg.daca.model.Tutor();
        tutor31.setHorario("");
        tutor31.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass36 = tutor31.getClass();
        com.ufcg.daca.model.Ajuda ajuda37 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno16, tutor31);
        java.lang.String str38 = aluno16.getNome();
        com.ufcg.daca.model.Tutor tutor45 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double46 = tutor45.getNota();
        tutor45.setNivel(" -  - 0 -  - hi!");
        java.lang.String str49 = tutor45.getHorario();
        com.ufcg.daca.model.Ajuda ajuda50 = new com.ufcg.daca.model.Ajuda((int) (short) 100, "null - null - 0 - null", " -  - 0 - null - null - 0 - null - null", aluno16, tutor45);
        tutor45.setStatus("null - null - null - 0 - null - null - 0 - null - null");
        java.lang.String str53 = tutor45.getMatricula();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + " -  - 0 -  - hi!" + "'", str18.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + " -  - 0 - hi!" + "'", str22.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setProeficiencia(4.0d);
        double double12 = tutor6.getNota();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        java.lang.String str18 = ajuda7.getDisciplina();
        com.ufcg.daca.model.Aluno aluno27 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str28 = aluno27.getTelefone();
        java.lang.String str29 = aluno27.toString();
        java.lang.String str30 = aluno27.getMatricula();
        aluno27.setEmail("hi!");
        java.lang.String str33 = aluno27.noTelToString();
        com.ufcg.daca.model.Tutor tutor34 = new com.ufcg.daca.model.Tutor();
        tutor34.setHorario("");
        tutor34.setProeficiencia((double) 0.0f);
        tutor34.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda41 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno27, tutor34);
        com.ufcg.daca.model.Aluno aluno42 = ajuda41.getAluno();
        aluno42.setMatricula(" -  - 0 - hi!");
        aluno42.setNome(" -  - 0 -  - hi!");
        ajuda7.setAluno(aluno42);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 -  - hi!" + "'", str29.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " -  - 0 - hi!" + "'", str33.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(aluno42);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double7 = tutor6.getNota();
        java.lang.String str8 = tutor6.getLocalAtendimento();
        tutor6.setMatricula(" - null - 0 - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null - null - 0 - null - null" + "'", str8.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor();
        tutor8.setHorario("");
        tutor8.setLocalAtendimento("hi!");
        tutor8.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda15 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno5, tutor8);
        ajuda15.setLocal(" -  - 100 - hi!");
        com.ufcg.daca.model.Aluno aluno18 = ajuda15.getAluno();
        int int19 = ajuda15.getId();
        org.junit.Assert.assertNotNull(aluno18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getLocalAtendimento();
        tutor6.setMatricula("Tutor");
        java.lang.String str12 = tutor6.getNivel();
        java.lang.String str13 = tutor6.getMatricula();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Tutor" + "'", str12.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Tutor" + "'", str13.equals("Tutor"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        int int29 = aluno10.getCodigoCurso();
        aluno10.setEmail(" -  - 52 - hi!");
        aluno10.setMatricula("");
        java.lang.Class<?> wildcardClass34 = aluno10.getClass();
        aluno10.setNome("");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", " -  - 0 - null - null - 0 - null - null", (int) (short) 1, " -  - 0 - hi!", "null - null - null - 0 - null - null - 0 - null - null", "null - null - 0 -  -  - 0 -  - hi! - null");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        java.lang.Class<?> wildcardClass18 = ajuda7.getClass();
        com.ufcg.daca.model.Aluno aluno24 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str25 = aluno24.getTelefone();
        java.lang.String str26 = aluno24.toString();
        java.lang.String str27 = aluno24.getMatricula();
        aluno24.setEmail("hi!");
        ajuda7.setAluno(aluno24);
        java.lang.String str31 = aluno24.getMatricula();
        java.lang.String str32 = aluno24.getNome();
        java.lang.Class<?> wildcardClass33 = aluno24.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        ajuda11.setDisciplina("Tutor");
        java.lang.String str14 = ajuda11.getLocal();
        int int15 = ajuda11.getId();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        com.ufcg.daca.model.Aluno aluno11 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str12 = aluno11.getTelefone();
        java.lang.String str13 = aluno11.toString();
        java.lang.String str14 = aluno11.getMatricula();
        aluno11.setEmail("hi!");
        java.lang.String str17 = aluno11.noTelToString();
        com.ufcg.daca.model.Tutor tutor18 = new com.ufcg.daca.model.Tutor();
        tutor18.setHorario("");
        tutor18.setProeficiencia((double) 0.0f);
        tutor18.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda25 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno11, tutor18);
        com.ufcg.daca.model.Aluno aluno31 = null;
        com.ufcg.daca.model.Tutor tutor32 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda33 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno31, tutor32);
        ajuda33.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor36 = new com.ufcg.daca.model.Tutor();
        tutor36.setHorario("");
        tutor36.setLocalAtendimento("hi!");
        ajuda33.setTutor(tutor36);
        tutor36.setLocalAtendimento("hi!");
        com.ufcg.daca.model.Ajuda ajuda44 = new com.ufcg.daca.model.Ajuda(100, "null - null - 0 - null - null", "null - null - null - 0 - null - null - 0 - null - null", aluno11, tutor36);
        java.lang.Class<?> wildcardClass45 = tutor36.getClass();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 -  - hi!" + "'", str13.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 - hi!" + "'", str17.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        tutor6.setProeficiencia(100.0d);
        java.lang.String str11 = tutor6.getMatricula();
        java.lang.String str12 = tutor6.getHorario();
        tutor6.setNivel(" - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno();
        java.lang.String str9 = aluno8.getMatricula();
        aluno8.setNome(" -  - 0 -  - hi!");
        java.lang.String str12 = aluno8.getMatricula();
        aluno8.setTelefone("");
        com.ufcg.daca.model.Aluno aluno20 = null;
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno20, tutor21);
        ajuda22.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor25 = new com.ufcg.daca.model.Tutor();
        tutor25.setHorario("");
        tutor25.setLocalAtendimento("hi!");
        ajuda22.setTutor(tutor25);
        int int31 = ajuda22.getId();
        ajuda22.setHorario("hi!");
        java.lang.String str34 = ajuda22.getHorario();
        com.ufcg.daca.model.Tutor tutor41 = new com.ufcg.daca.model.Tutor(" -  - 0 - hi!", "null - null - 0 - null", 0, "hi!", "Tutor", "hi!");
        ajuda22.setTutor(tutor41);
        com.ufcg.daca.model.Ajuda ajuda43 = new com.ufcg.daca.model.Ajuda((int) (short) 10, " - null - null - 0 - null - 0 -  - hi!", " -  - 0 - hi!", aluno8, tutor41);
        com.ufcg.daca.model.Aluno aluno54 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str55 = aluno54.getTelefone();
        com.ufcg.daca.model.Tutor tutor56 = new com.ufcg.daca.model.Tutor();
        tutor56.setHorario("");
        tutor56.setLocalAtendimento("hi!");
        tutor56.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda63 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno54, tutor56);
        tutor56.setProeficiencia((double) (short) -1);
        tutor56.setDiaDisponivel(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda68 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "null - null - 0 -  -  - 0 -  - hi! - null", "Tutor", " -  - 0 - hi!", aluno8, tutor56);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.getTelefone();
        java.lang.String str10 = aluno8.toString();
        java.lang.String str11 = aluno8.getMatricula();
        aluno8.setEmail("hi!");
        java.lang.String str14 = aluno8.noTelToString();
        com.ufcg.daca.model.Tutor tutor15 = new com.ufcg.daca.model.Tutor();
        tutor15.setHorario("");
        tutor15.setProeficiencia((double) 0.0f);
        tutor15.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno8, tutor15);
        aluno8.setNome("");
        aluno8.setCodigoCurso((int) 'a');
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setEmail("null - null - 0 - null - null");
        java.lang.String str9 = aluno5.getEmail();
        java.lang.String str10 = aluno5.noTelToString();
        java.lang.String str11 = aluno5.noTelToString();
        aluno5.setTelefone("null - null - 0 - null");
        aluno5.setCodigoCurso((int) (byte) 10);
        aluno5.setNome("");
        java.lang.String str18 = aluno5.getTelefone();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null - null - 0 - null - null" + "'", str9.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str10.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str11.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null - null - 0 - null" + "'", str18.equals("null - null - 0 - null"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        java.lang.String str12 = ajuda7.getLocal();
        ajuda7.setId((-1));
        com.ufcg.daca.model.Tutor tutor15 = new com.ufcg.daca.model.Tutor();
        tutor15.setHorario("");
        tutor15.setProeficiencia((double) 0.0f);
        tutor15.setDiaDisponivel("Tutor");
        java.lang.String str22 = tutor15.getMatricula();
        java.lang.String str23 = tutor15.getDiaDisponivel();
        double double24 = tutor15.getNota();
        double double25 = tutor15.getNota();
        ajuda7.setTutor(tutor15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Tutor" + "'", str23.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getStatus();
        tutor6.setMatricula(" -  - 0 -  - hi!");
        tutor6.setHorario(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        tutor0.setLocalAtendimento(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!");
        double double9 = tutor0.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        boolean boolean18 = ajuda7.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno19 = ajuda7.getAluno();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aluno19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getMatricula();
        java.lang.String str8 = tutor0.getMatricula();
        tutor0.setNivel("null - null - null - 0 - null - null - 0 - null - null");
        java.lang.String str11 = tutor0.getStatus();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass5 = tutor0.getClass();
        java.lang.String str6 = tutor0.getDiaDisponivel();
        tutor0.setHorario("");
        tutor0.setDinheiro(0.0d);
        java.lang.String str11 = tutor0.getStatus();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        tutor11.setProeficiencia(0.0d);
        java.lang.String str14 = tutor11.getHorario();
        double double15 = tutor11.getProeficiencia();
        java.lang.String str16 = tutor11.getNivel();
        tutor11.setMatricula("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Tutor" + "'", str16.equals("Tutor"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        int int16 = ajuda7.getId();
        ajuda7.setLocal("");
        boolean boolean19 = ajuda7.isAvaliacao();
        ajuda7.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        double double1 = tutor0.getProeficiencia();
        java.lang.String str2 = tutor0.getStatus();
        double double3 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("hi!", "", (int) (byte) 1, "", "null - null - 0 - null - null", " -  - 0 -  - hi!");
        tutor6.setDisciplina(" -  - 100 - hi!");
        double double9 = tutor6.getProeficiencia();
        java.lang.String str10 = tutor6.getMatricula();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.String str5 = tutor0.getLocalAtendimento();
        tutor0.setStatus("");
        tutor0.setDinheiro(4.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setDiaDisponivel(" - null - null - 0 - null - 0 -  - hi!");
        tutor0.setNivel("null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        com.ufcg.daca.model.Aluno aluno6 = new com.ufcg.daca.model.Aluno();
        aluno6.setMatricula("");
        java.lang.String str9 = aluno6.getMatricula();
        java.lang.String str10 = aluno6.noTelToString();
        aluno6.setCodigoCurso((int) (short) 0);
        com.ufcg.daca.model.Tutor tutor19 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double20 = tutor19.getNota();
        tutor19.setNivel(" -  - 0 -  - hi!");
        tutor19.setHorario(" - null - 0 - null");
        tutor19.setProeficiencia((double) (short) 10);
        com.ufcg.daca.model.Ajuda ajuda27 = new com.ufcg.daca.model.Ajuda(10, " -  - 0 - hi!", " -  - 0 - null - null - 0 - null - null", aluno6, tutor19);
        com.ufcg.daca.model.Tutor tutor28 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda((int) (byte) 10, " -  - null - 0 - null - 0 - null", "null - null - 0 - Tutor - null", aluno6, tutor28);
        tutor28.setDinheiro((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " - null - 0 - null" + "'", str10.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        tutor12.setProeficiencia((double) (short) -1);
        tutor12.setDinheiro((double) 100.0f);
        tutor12.setDisciplina("Tutor");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        com.ufcg.daca.model.Aluno aluno10 = null;
        com.ufcg.daca.model.Tutor tutor11 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda12 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno10, tutor11);
        ajuda12.setAvaliacao(false);
        ajuda12.setAvaliacao(false);
        ajuda12.setAvaliacao(true);
        java.lang.String str19 = ajuda12.getLocal();
        com.ufcg.daca.model.Tutor tutor20 = ajuda12.getTutor();
        ajuda12.setId((int) (short) -1);
        ajuda12.setAvaliacao(false);
        java.lang.String str25 = ajuda12.getHorario();
        com.ufcg.daca.model.Aluno aluno31 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno31.setMatricula("hi!");
        aluno31.setNome("");
        aluno31.setTelefone("null - null - 0 - null - null");
        java.lang.String str38 = aluno31.getMatricula();
        ajuda12.setAluno(aluno31);
        com.ufcg.daca.model.Tutor tutor40 = new com.ufcg.daca.model.Tutor();
        tutor40.setHorario("");
        tutor40.setLocalAtendimento("hi!");
        tutor40.setProeficiencia((double) 1L);
        java.lang.String str47 = tutor40.getNivel();
        tutor40.setDiaDisponivel(" - null - null - 0 - null - 0 -  - hi!");
        tutor40.setDiaDisponivel("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda52 = new com.ufcg.daca.model.Ajuda((int) (short) 10, " -  - null - 0 - null - 0 - null", " -  - 52 - hi!", " - null - 0 - null", "", aluno31, tutor40);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(tutor20);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Tutor" + "'", str47.equals("Tutor"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.getTelefone();
        java.lang.String str10 = aluno8.toString();
        com.ufcg.daca.model.Aluno aluno24 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str25 = aluno24.getTelefone();
        java.lang.String str26 = aluno24.toString();
        java.lang.String str27 = aluno24.getMatricula();
        aluno24.setEmail("hi!");
        java.lang.String str30 = aluno24.noTelToString();
        com.ufcg.daca.model.Tutor tutor31 = new com.ufcg.daca.model.Tutor();
        tutor31.setHorario("");
        tutor31.setProeficiencia((double) 0.0f);
        tutor31.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda38 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno24, tutor31);
        com.ufcg.daca.model.Tutor tutor39 = new com.ufcg.daca.model.Tutor();
        tutor39.setHorario("");
        tutor39.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass44 = tutor39.getClass();
        com.ufcg.daca.model.Ajuda ajuda45 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno24, tutor39);
        tutor39.setDiaDisponivel(" - null - 0 - null");
        com.ufcg.daca.model.Ajuda ajuda48 = new com.ufcg.daca.model.Ajuda((int) ' ', "null - null - 0 - null", " -  - 0 - hi!", aluno8, tutor39);
        com.ufcg.daca.model.Aluno aluno49 = ajuda48.getAluno();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(aluno49);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.String str5 = tutor0.getLocalAtendimento();
        tutor0.setNota((double) 32);
        java.lang.String str8 = tutor0.getNivel();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "TOP" + "'", str8.equals("TOP"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getDisciplina();
        java.lang.String str10 = tutor6.getNivel();
        tutor6.setHorario(" -  - 0 - hi!");
        java.lang.String str13 = tutor6.getHorario();
        tutor6.setNivel("null - null - 0 -  -  - 0 -  - hi! - null");
        java.lang.Class<?> wildcardClass16 = tutor6.getClass();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Tutor" + "'", str10.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 - hi!" + "'", str13.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        tutor10.setLocalAtendimento("hi!");
        tutor10.setMatricula("null - null - 0 - null - null");
        java.lang.String str20 = tutor10.getLocalAtendimento();
        java.lang.String str21 = tutor10.getDisciplina();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" -  - 100 - hi!", "", (int) (short) -1, "null - null - 0 - Tutor - null", " - null - 0 - null", " -  - 0 -  - hi!");
        tutor6.setStatus("null - null - 0 - Tutor - null");
        tutor6.setDinheiro((double) (byte) 0);
        tutor6.setDiaDisponivel("Tutor");
        java.lang.String str13 = tutor6.getStatus();
        tutor6.setNivel("hi! -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null - null - 0 - Tutor - null" + "'", str13.equals("null - null - 0 - Tutor - null"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "null - null - 0 - Tutor - null", 100, "Tutor", " -  - 0 -  - hi!", "null - null - 0 - Tutor - null");
        tutor6.setHorario("null - null - null - 0 - null - null - 0 - null - null");
        java.lang.String str9 = tutor6.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null - null - 0 - Tutor - null" + "'", str9.equals("null - null - 0 - Tutor - null"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getHorario();
        tutor0.setDinheiro((double) '#');
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.getTelefone();
        java.lang.String str10 = aluno8.toString();
        java.lang.String str11 = aluno8.getMatricula();
        aluno8.setEmail("hi!");
        java.lang.String str14 = aluno8.noTelToString();
        com.ufcg.daca.model.Tutor tutor15 = new com.ufcg.daca.model.Tutor();
        tutor15.setHorario("");
        tutor15.setProeficiencia((double) 0.0f);
        tutor15.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno8, tutor15);
        com.ufcg.daca.model.Aluno aluno23 = ajuda22.getAluno();
        aluno23.setMatricula(" -  - 0 - hi!");
        java.lang.String str26 = aluno23.getNome();
        java.lang.String str27 = aluno23.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(aluno23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + " -  - 0 - hi! -  - 0 -  - hi!" + "'", str27.equals(" -  - 0 - hi! -  - 0 -  - hi!"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" - null - null - 0 - null - 0 -  - hi!", " -  - 0 - null - null - 0 - null - null", (int) (short) 10, "hi! -  - 0 - hi!", "", "null - null - null - 0 - null - null - 0 - null - null");
        tutor6.setProeficiencia(32);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        double double10 = tutor0.getProeficiencia();
        tutor0.setProeficiencia(0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        java.lang.String str12 = tutor6.getDisciplina();
        double double13 = tutor6.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        ajuda7.setLocal(" -  - 0 -  - hi!");
        ajuda7.setHorario("null - null - null - 0 - null - null - 0 - null - null");
        ajuda7.setId((int) '#');
        ajuda7.setHorario(" -  - 52 - hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.noTelToString();
        java.lang.String str8 = aluno5.getEmail();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 - hi!" + "'", str7.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setEmail("null - null - 0 - null - null");
        java.lang.String str12 = aluno8.getEmail();
        java.lang.String str13 = aluno8.noTelToString();
        java.lang.String str14 = aluno8.noTelToString();
        aluno8.setTelefone("null - null - 0 - null");
        java.lang.String str17 = aluno8.getTelefone();
        com.ufcg.daca.model.Tutor tutor24 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double25 = tutor24.getNota();
        tutor24.setNivel(" -  - 0 -  - hi!");
        tutor24.setNota((double) (short) 100);
        tutor24.setMatricula("hi!");
        com.ufcg.daca.model.Ajuda ajuda32 = new com.ufcg.daca.model.Ajuda((int) (short) 100, " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", "null - null - 0 - null - null", aluno8, tutor24);
        aluno8.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null - null - 0 - null - null" + "'", str12.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str13.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str14.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null" + "'", str17.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor3 = ajuda0.getTutor();
        com.ufcg.daca.model.Tutor tutor4 = ajuda0.getTutor();
        org.junit.Assert.assertNull(tutor3);
        org.junit.Assert.assertNull(tutor4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        aluno0.setTelefone(" -  - 0 -  - hi!");
        aluno0.setMatricula(" -  - 52 - hi!");
        aluno0.setTelefone("hi!");
        java.lang.String str9 = aluno0.getNome();
        aluno0.setCodigoCurso(52);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        com.ufcg.daca.model.Aluno aluno13 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str14 = aluno13.getTelefone();
        java.lang.String str15 = aluno13.toString();
        java.lang.String str16 = aluno13.getMatricula();
        aluno13.setEmail("hi!");
        java.lang.String str19 = aluno13.noTelToString();
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor();
        tutor20.setHorario("");
        tutor20.setProeficiencia((double) 0.0f);
        tutor20.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda27 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno13, tutor20);
        com.ufcg.daca.model.Tutor tutor28 = new com.ufcg.daca.model.Tutor();
        tutor28.setHorario("");
        tutor28.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass33 = tutor28.getClass();
        com.ufcg.daca.model.Ajuda ajuda34 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno13, tutor28);
        ajuda34.setDisciplina(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 -  - hi!" + "'", str15.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + " -  - 0 - hi!" + "'", str19.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        java.lang.Class<?> wildcardClass18 = ajuda7.getClass();
        ajuda7.setId(0);
        java.lang.String str21 = ajuda7.getDisciplina();
        java.lang.String str22 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        tutor6.setMatricula("hi!");
        java.lang.String str14 = tutor6.getMatricula();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        ajuda28.setHorario(" - null - null - 0 - null - 0 -  - hi!");
        ajuda28.setLocal(" -  - 0 - null - null - 0 - null - null");
        java.lang.String str33 = ajuda28.getHorario();
        ajuda28.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " - null - null - 0 - null - 0 -  - hi!" + "'", str33.equals(" - null - null - 0 - null - 0 -  - hi!"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        ajuda7.setHorario("hi!");
        ajuda7.setLocal("null - null - 0 - null - null -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        com.ufcg.daca.model.Aluno aluno11 = ajuda0.getAluno();
        aluno11.setCodigoCurso((int) '4');
        aluno11.setEmail(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertNotNull(aluno11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        com.ufcg.daca.model.Aluno aluno6 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor7 = new com.ufcg.daca.model.Tutor();
        tutor7.setHorario("");
        tutor7.setProeficiencia((double) 0.0f);
        tutor7.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda14 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno6, tutor7);
        aluno6.setTelefone("Tutor");
        java.lang.String str17 = aluno6.getTelefone();
        com.ufcg.daca.model.Aluno aluno23 = null;
        com.ufcg.daca.model.Tutor tutor24 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda25 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno23, tutor24);
        java.lang.Class<?> wildcardClass26 = tutor24.getClass();
        java.lang.String str27 = tutor24.getLocalAtendimento();
        tutor24.setProeficiencia((int) (byte) -1);
        tutor24.setHorario(" - null - null - 0 - null - 0 -  - hi!");
        com.ufcg.daca.model.Ajuda ajuda32 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "", "", aluno6, tutor24);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Tutor" + "'", str17.equals("Tutor"));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        boolean boolean18 = ajuda7.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno24 = null;
        com.ufcg.daca.model.Tutor tutor25 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno24, tutor25);
        java.lang.Class<?> wildcardClass27 = tutor25.getClass();
        java.lang.String str28 = tutor25.getLocalAtendimento();
        tutor25.setProeficiencia((double) (-1.0f));
        ajuda7.setTutor(tutor25);
        java.lang.String str32 = ajuda7.getDisciplina();
        ajuda7.setLocal(" -  - 52 -  - hi!");
        com.ufcg.daca.model.Tutor tutor35 = ajuda7.getTutor();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(tutor35);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.getTelefone();
        java.lang.String str10 = aluno8.toString();
        java.lang.String str11 = aluno8.getMatricula();
        aluno8.setEmail("hi!");
        java.lang.String str14 = aluno8.noTelToString();
        com.ufcg.daca.model.Tutor tutor15 = new com.ufcg.daca.model.Tutor();
        tutor15.setHorario("");
        tutor15.setProeficiencia((double) 0.0f);
        tutor15.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno8, tutor15);
        java.lang.String str23 = aluno8.noTelToString();
        aluno8.setTelefone("hi!");
        java.lang.String str26 = aluno8.noTelToString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + " -  - 0 - hi!" + "'", str23.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 - hi!" + "'", str26.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str21 = tutor20.getMatricula();
        java.lang.String str22 = tutor20.getDiaDisponivel();
        ajuda7.setTutor(tutor20);
        java.lang.String str24 = tutor20.getLocalAtendimento();
        java.lang.String str25 = tutor20.getDisciplina();
        java.lang.Class<?> wildcardClass26 = tutor20.getClass();
        java.lang.String str27 = tutor20.getNivel();
        tutor20.setHorario("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Tutor" + "'", str27.equals("Tutor"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        java.lang.String str5 = tutor0.getStatus();
        tutor0.setDisciplina(" -  - null - 0 - null - 0 - null");
        tutor0.setHorario("Tutor");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        java.lang.String str12 = aluno7.getTelefone();
        aluno7.setTelefone(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        java.lang.String str15 = aluno7.noTelToString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 - hi!" + "'", str15.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        aluno3.setTelefone("Tutor");
        java.lang.String str14 = aluno3.getEmail();
        aluno3.setEmail(" -  - 0 - hi!");
        aluno3.setEmail("");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        boolean boolean18 = ajuda7.isAvaliacao();
        boolean boolean19 = ajuda7.isAvaliacao();
        ajuda7.setAvaliacao(true);
        com.ufcg.daca.model.Aluno aluno32 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str33 = aluno32.getTelefone();
        com.ufcg.daca.model.Tutor tutor34 = new com.ufcg.daca.model.Tutor();
        tutor34.setHorario("");
        tutor34.setLocalAtendimento("hi!");
        tutor34.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda41 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno32, tutor34);
        tutor34.setProeficiencia((double) (short) -1);
        ajuda7.setTutor(tutor34);
        tutor34.setDinheiro((double) 100.0f);
        tutor34.setNota((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("hi! -  - 0 - hi!", " - null - 0 - null - null", 32, "", "null - null - 0 - Tutor - null");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.getMatricula();
        java.lang.String str7 = aluno5.toString();
        aluno5.setTelefone(" -  - 0 -  - hi!");
        aluno5.setMatricula(" -  - 52 - hi!");
        com.ufcg.daca.model.Tutor tutor18 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str19 = tutor18.getMatricula();
        java.lang.String str20 = tutor18.getDiaDisponivel();
        java.lang.String str21 = tutor18.getNivel();
        double double22 = tutor18.getNota();
        java.lang.String str23 = tutor18.getMatricula();
        tutor18.setLocalAtendimento("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "null - null - 0 - null", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", " -  - 0 -  - hi!", aluno5, tutor18);
        ajuda26.setDisciplina(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Tutor" + "'", str21.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        java.lang.String str12 = aluno7.getTelefone();
        java.lang.String str13 = aluno7.getEmail();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        tutor6.setNivel("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno(" - null - null - 0 - null - 0 -  - hi!", " -  - null - 0 - null - 0 - null", (int) (byte) -1, "hi! -  - 0 - hi!", "null - null - 0 - null - null");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.getTelefone();
        java.lang.String str10 = aluno8.toString();
        java.lang.String str11 = aluno8.getMatricula();
        aluno8.setCodigoCurso((int) '4');
        java.lang.String str14 = aluno8.noTelToString();
        aluno8.setNome(" -  - 100 - hi!");
        aluno8.setMatricula(" -  - 100 - hi!");
        java.lang.String str19 = aluno8.getTelefone();
        com.ufcg.daca.model.Aluno aluno36 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str37 = aluno36.getTelefone();
        java.lang.String str38 = aluno36.toString();
        java.lang.String str39 = aluno36.getMatricula();
        aluno36.setEmail("hi!");
        java.lang.String str42 = aluno36.noTelToString();
        com.ufcg.daca.model.Tutor tutor43 = new com.ufcg.daca.model.Tutor();
        tutor43.setHorario("");
        tutor43.setProeficiencia((double) 0.0f);
        tutor43.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda50 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno36, tutor43);
        com.ufcg.daca.model.Tutor tutor51 = new com.ufcg.daca.model.Tutor();
        tutor51.setHorario("");
        tutor51.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass56 = tutor51.getClass();
        com.ufcg.daca.model.Ajuda ajuda57 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno36, tutor51);
        java.lang.String str58 = aluno36.getNome();
        com.ufcg.daca.model.Tutor tutor65 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double66 = tutor65.getNota();
        tutor65.setNivel(" -  - 0 -  - hi!");
        java.lang.String str69 = tutor65.getHorario();
        com.ufcg.daca.model.Ajuda ajuda70 = new com.ufcg.daca.model.Ajuda((int) (short) 100, "null - null - 0 - null", " -  - 0 - null - null - 0 - null - null", aluno36, tutor65);
        tutor65.setStatus("null - null - null - 0 - null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda73 = new com.ufcg.daca.model.Ajuda(52, " -  - 0 - hi! -  - 0 -  - hi!", "", aluno8, tutor65);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 52 - hi!" + "'", str14.equals(" -  - 52 - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + " -  - 0 -  - hi!" + "'", str38.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + " -  - 0 - hi!" + "'", str42.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 4.0d + "'", double66 == 4.0d);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        int int18 = ajuda7.getId();
        ajuda7.setDia("hi!");
        com.ufcg.daca.model.Aluno aluno21 = ajuda7.getAluno();
        boolean boolean22 = ajuda7.isAvaliacao();
        java.lang.String str23 = ajuda7.getDisciplina();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(aluno21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Tutor" + "'", str23.equals("Tutor"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setStatus("");
        double double12 = tutor6.getNota();
        java.lang.String str13 = tutor6.getHorario();
        tutor6.setLocalAtendimento("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getMatricula();
        java.lang.String str10 = aluno5.noTelToString();
        aluno5.setNome(" -  - 0 - null - null - 0 - null - null");
        aluno5.setTelefone(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 100 - hi!" + "'", str10.equals(" -  - 100 - hi!"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        double double5 = tutor0.getProeficiencia();
        double double6 = tutor0.getDinheiro();
        java.lang.String str7 = tutor0.getLocalAtendimento();
        java.lang.String str8 = tutor0.getNivel();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        ajuda7.setId((int) (byte) 10);
        com.ufcg.daca.model.Aluno aluno16 = null;
        ajuda7.setAluno(aluno16);
        com.ufcg.daca.model.Aluno aluno28 = null;
        com.ufcg.daca.model.Tutor tutor29 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno28, tutor29);
        ajuda30.setId((int) '4');
        java.lang.String str33 = ajuda30.getDia();
        com.ufcg.daca.model.Aluno aluno44 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str45 = aluno44.getTelefone();
        com.ufcg.daca.model.Tutor tutor46 = new com.ufcg.daca.model.Tutor();
        tutor46.setHorario("");
        tutor46.setLocalAtendimento("hi!");
        tutor46.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda53 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno44, tutor46);
        aluno44.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        ajuda30.setAluno(aluno44);
        int int57 = aluno44.getCodigoCurso();
        com.ufcg.daca.model.Tutor tutor64 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double65 = tutor64.getNota();
        double double66 = tutor64.getNota();
        tutor64.setProeficiencia(0.0d);
        com.ufcg.daca.model.Ajuda ajuda69 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", "Tutor", "null - null - 0 - Tutor - null", " -  - 52 - hi!", aluno44, tutor64);
        ajuda7.setAluno(aluno44);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4.0d + "'", double65 == 4.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 4.0d + "'", double66 == 4.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno();
        aluno8.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor11 = new com.ufcg.daca.model.Tutor();
        tutor11.setHorario("");
        tutor11.setLocalAtendimento("hi!");
        tutor11.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda18 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno8, tutor11);
        java.lang.String str19 = aluno8.getMatricula();
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor();
        tutor20.setHorario("");
        tutor20.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass25 = tutor20.getClass();
        tutor20.setHorario(" -  - 0 -  - hi!");
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((-1), " - null - 0 - null", "null - null - 0 - null - null", aluno8, tutor20);
        tutor20.setDinheiro((double) '#');
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        double double12 = tutor6.getDinheiro();
        tutor6.setMatricula(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        java.lang.String str15 = tutor6.getDiaDisponivel();
        tutor6.setDiaDisponivel("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.Class<?> wildcardClass8 = tutor6.getClass();
        java.lang.String str9 = tutor6.getLocalAtendimento();
        tutor6.setProeficiencia((int) (byte) -1);
        java.lang.String str12 = tutor6.getDiaDisponivel();
        tutor6.setNivel("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        ajuda7.setHorario("hi!");
        java.lang.String str19 = ajuda7.getDia();
        int int20 = ajuda7.getId();
        ajuda7.setId(1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDisciplina("null - null - 0 - null");
        java.lang.String str6 = tutor0.getLocalAtendimento();
        tutor0.setProeficiencia((int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.toString();
        aluno10.setEmail("null - null - 0 - null - null");
        java.lang.String str14 = aluno10.getEmail();
        java.lang.String str15 = aluno10.noTelToString();
        java.lang.String str16 = aluno10.noTelToString();
        com.ufcg.daca.model.Tutor tutor17 = null;
        com.ufcg.daca.model.Ajuda ajuda18 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, " -  - 0 -  - hi!", " -  - null - 0 - null - 0 - null", "null - null - 0 - null", " - null - 0 - null - null", aluno10, tutor17);
        java.lang.String str19 = ajuda18.getDia();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 -  - hi!" + "'", str11.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null - null - 0 - null - null" + "'", str14.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str15.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str16.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null - null - 0 - null" + "'", str19.equals("null - null - 0 - null"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        double double12 = tutor4.getProeficiencia();
        java.lang.String str13 = tutor4.getDisciplina();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null - null - 0 - null - null" + "'", str13.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        ajuda0.setHorario(" -  - 0 -  - hi!");
        java.lang.String str10 = ajuda0.getDia();
        ajuda0.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        com.ufcg.daca.model.Aluno aluno16 = new com.ufcg.daca.model.Aluno();
        java.lang.String str17 = aluno16.toString();
        ajuda7.setAluno(aluno16);
        ajuda7.setId((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.getTelefone();
        java.lang.String str10 = aluno8.toString();
        java.lang.String str11 = aluno8.getMatricula();
        aluno8.setEmail("hi!");
        java.lang.String str14 = aluno8.noTelToString();
        com.ufcg.daca.model.Tutor tutor15 = new com.ufcg.daca.model.Tutor();
        tutor15.setHorario("");
        tutor15.setProeficiencia((double) 0.0f);
        tutor15.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno8, tutor15);
        java.lang.String str23 = aluno8.noTelToString();
        java.lang.String str24 = aluno8.getNome();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + " -  - 0 - hi!" + "'", str23.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" -  - 52 - hi!", " -  - 0 - hi!", (int) ' ', "null - null - 0 - null - null", "null - null - null - 0 - null - null - 0 - null - null", " -  - 0 - hi!");
        tutor6.setProeficiencia((double) 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        java.lang.String str10 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setEmail("hi!");
        java.lang.String str11 = aluno5.toString();
        java.lang.String str12 = aluno5.getTelefone();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 -  - hi!" + "'", str11.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.getTelefone();
        java.lang.String str10 = aluno8.toString();
        java.lang.String str11 = aluno8.getMatricula();
        aluno8.setEmail("hi!");
        java.lang.String str14 = aluno8.noTelToString();
        com.ufcg.daca.model.Tutor tutor15 = new com.ufcg.daca.model.Tutor();
        tutor15.setHorario("");
        tutor15.setProeficiencia((double) 0.0f);
        tutor15.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno8, tutor15);
        double double23 = tutor15.getProeficiencia();
        double double24 = tutor15.getProeficiencia();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setCodigoCurso((int) (short) 100);
        java.lang.String str12 = aluno8.getMatricula();
        java.lang.String str13 = aluno8.noTelToString();
        java.lang.String str14 = aluno8.getNome();
        java.lang.String str15 = aluno8.getTelefone();
        com.ufcg.daca.model.Aluno aluno26 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str27 = aluno26.getTelefone();
        com.ufcg.daca.model.Tutor tutor28 = new com.ufcg.daca.model.Tutor();
        tutor28.setHorario("");
        tutor28.setLocalAtendimento("hi!");
        tutor28.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda35 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno26, tutor28);
        com.ufcg.daca.model.Ajuda ajuda36 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, " - null - null - 0 - null - 0 -  - hi!", " -  - 0 - null - null - 0 - null - null", aluno8, tutor28);
        ajuda36.setDisciplina("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 100 - hi!" + "'", str13.equals(" -  - 100 - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        tutor12.setHorario("null - null - 0 - null");
        java.lang.Class<?> wildcardClass22 = tutor12.getClass();
        java.lang.String str23 = tutor12.getMatricula();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        java.lang.Class<?> wildcardClass18 = ajuda7.getClass();
        com.ufcg.daca.model.Aluno aluno24 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str25 = aluno24.getTelefone();
        java.lang.String str26 = aluno24.toString();
        java.lang.String str27 = aluno24.getMatricula();
        aluno24.setEmail("hi!");
        ajuda7.setAluno(aluno24);
        java.lang.String str31 = aluno24.getMatricula();
        java.lang.String str32 = aluno24.getNome();
        aluno24.setNome("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Aluno aluno17 = ajuda7.getAluno();
        ajuda7.setId(10);
        ajuda7.setDia("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.Class<?> wildcardClass8 = tutor6.getClass();
        java.lang.String str9 = tutor6.getLocalAtendimento();
        tutor6.setProeficiencia((int) (byte) -1);
        tutor6.setHorario(" - null - null - 0 - null - 0 -  - hi!");
        java.lang.String str14 = tutor6.getDisciplina();
        tutor6.setDiaDisponivel(" -  - 0 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        com.ufcg.daca.model.Aluno aluno16 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str17 = aluno16.getTelefone();
        java.lang.String str18 = aluno16.toString();
        java.lang.String str19 = aluno16.getMatricula();
        aluno16.setEmail("hi!");
        java.lang.String str22 = aluno16.noTelToString();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setProeficiencia((double) 0.0f);
        tutor23.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda(1, " -  - 0 -  - hi!", " -  - 0 -  - hi!", aluno16, tutor23);
        com.ufcg.daca.model.Tutor tutor31 = new com.ufcg.daca.model.Tutor();
        tutor31.setHorario("");
        tutor31.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass36 = tutor31.getClass();
        com.ufcg.daca.model.Ajuda ajuda37 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " -  - 0 -  - hi!", " -  - 0 - hi!", "null - null - 0 - null - null", "null - null - 0 - null - null", aluno16, tutor31);
        java.lang.String str38 = aluno16.getNome();
        com.ufcg.daca.model.Tutor tutor45 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double46 = tutor45.getNota();
        tutor45.setNivel(" -  - 0 -  - hi!");
        java.lang.String str49 = tutor45.getHorario();
        com.ufcg.daca.model.Ajuda ajuda50 = new com.ufcg.daca.model.Ajuda((int) (short) 100, "null - null - 0 - null", " -  - 0 - null - null - 0 - null - null", aluno16, tutor45);
        ajuda50.setDia(" -  - 0 - null - null - 0 - null - null");
        java.lang.String str53 = ajuda50.getLocal();
        ajuda50.setHorario(" -  - 52 - hi!");
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + " -  - 0 -  - hi!" + "'", str18.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + " -  - 0 - hi!" + "'", str22.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.getMatricula();
        java.lang.String str7 = aluno5.toString();
        aluno5.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str10 = aluno5.getNome();
        com.ufcg.daca.model.Tutor tutor11 = new com.ufcg.daca.model.Tutor();
        tutor11.setStatus("hi!");
        double double14 = tutor11.getProeficiencia();
        tutor11.setDinheiro(0.0d);
        java.lang.Class<?> wildcardClass17 = tutor11.getClass();
        java.lang.String str18 = tutor11.getHorario();
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda(0, " -  - 0 -  - hi!", " - null - 0 - null", "hi!", "null - null - null - 0 - null - null - 0 - null - null", aluno5, tutor11);
        java.lang.String str20 = tutor11.getStatus();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setEmail("hi!");
        java.lang.String str11 = aluno5.noTelToString();
        java.lang.String str12 = aluno5.getMatricula();
        int int13 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 - hi!" + "'", str11.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }
}

