import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        java.lang.String str4 = tutor0.getStatus();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        boolean boolean17 = ajuda7.isAvaliacao();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        java.lang.String str3 = tutor0.getLocalAtendimento();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        int int9 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        java.lang.String str3 = tutor0.getLocalAtendimento();
        tutor0.setStatus("null - null - 0 - null - null");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        aluno0.setMatricula("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setStatus("Tutor");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
        boolean boolean19 = ajuda7.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno20 = ajuda7.getAluno();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aluno20);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        java.lang.Class<?> wildcardClass20 = ajuda19.getClass();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        java.lang.String str1 = tutor0.getLocalAtendimento();
        tutor0.setNivel("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setTelefone("");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
        ajuda22.setDisciplina("");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        aluno0.setMatricula("");
        java.lang.String str3 = aluno0.getMatricula();
        aluno0.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.getEmail();
        int int8 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setStatus("");
        double double12 = tutor6.getDinheiro();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        java.lang.String str4 = tutor0.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setEmail("hi!");
        java.lang.String str11 = aluno5.noTelToString();
        aluno5.setCodigoCurso((int) '4');
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 - hi!" + "'", str11.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
        java.lang.String str19 = ajuda7.getDia();
        java.lang.String str20 = ajuda7.getHorario();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) (byte) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        int int18 = ajuda7.getId();
        java.lang.String str19 = ajuda7.getDisciplina();
        com.ufcg.daca.model.Aluno aluno20 = ajuda7.getAluno();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Tutor" + "'", str19.equals("Tutor"));
        org.junit.Assert.assertNull(aluno20);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        com.ufcg.daca.model.Tutor tutor8 = null;
        ajuda7.setTutor(tutor8);
        java.lang.String str10 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setDiaDisponivel("hi!");
        tutor6.setProeficiencia((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        aluno0.setMatricula("");
        java.lang.String str3 = aluno0.getMatricula();
        java.lang.String str4 = aluno0.noTelToString();
        aluno0.setTelefone(" -  - 100 - hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + " - null - 0 - null" + "'", str4.equals(" - null - 0 - null"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("hi!", " -  - 0 - hi!", (int) (short) 100, "Tutor", " -  - 0 -  - hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setLocal("Tutor");
        ajuda0.setDia(" -  - 52 - hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        aluno0.setNome(" -  - 0 -  - hi!");
        aluno0.setTelefone(" - null - 0 - null");
        java.lang.String str6 = aluno0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null" + "'", str6.equals("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        java.lang.String str1 = ajuda0.getHorario();
        ajuda0.setLocal(" -  - 100 - hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        tutor10.setLocalAtendimento("hi!");
        tutor10.setNivel("");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        java.lang.String str4 = ajuda0.getHorario();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        aluno0.setNome(" -  - 0 -  - hi!");
        aluno0.setTelefone(" - null - 0 - null");
        java.lang.String str6 = aluno0.getTelefone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " - null - 0 - null" + "'", str6.equals(" - null - 0 - null"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getLocalAtendimento();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        java.lang.String str3 = aluno0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        java.lang.String str3 = tutor0.getDisciplina();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        aluno3.setTelefone("Tutor");
        java.lang.String str14 = aluno3.getEmail();
        java.lang.String str15 = aluno3.toString();
        int int16 = aluno3.getCodigoCurso();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null - null - 0 - Tutor - null" + "'", str15.equals("null - null - 0 - Tutor - null"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
        aluno16.setTelefone("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
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
        java.lang.String str21 = ajuda7.getHorario();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setHorario(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
        ajuda7.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("hi!", "hi!", (int) (byte) 10, "", " -  - 0 - null - null - 0 - null - null", "null - null - 0 - null - null");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("null - null - 0 - null");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        tutor0.setDiaDisponivel("hi!");
        java.lang.String str5 = tutor0.getHorario();
        tutor0.setStatus("null - null - 0 - Tutor - null");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        java.lang.String str1 = tutor0.getLocalAtendimento();
        java.lang.String str2 = tutor0.getMatricula();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        int int23 = ajuda22.getId();
        java.lang.String str24 = ajuda22.getDisciplina();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + " -  - 0 -  - hi!" + "'", str24.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
        int int19 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.String str5 = tutor0.getLocalAtendimento();
        tutor0.setNivel("Tutor");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        tutor8.setHorario(" -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        ajuda26.setId((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 -  - hi!" + "'", str14.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        com.ufcg.daca.model.Tutor tutor8 = null;
        ajuda7.setTutor(tutor8);
        ajuda7.setId((int) (byte) -1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ufcg.daca.model.Ajuda ajuda8 = new com.ufcg.daca.model.Ajuda();
        boolean boolean9 = ajuda8.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno15 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str16 = aluno15.getTelefone();
        java.lang.String str17 = aluno15.toString();
        ajuda8.setAluno(aluno15);
        java.lang.String str19 = aluno15.getEmail();
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor26.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno15, tutor26);
        com.ufcg.daca.model.Tutor tutor30 = new com.ufcg.daca.model.Tutor();
        tutor30.setNivel("null - null - 0 - null - null");
        double double33 = tutor30.getProeficiencia();
        tutor30.setDinheiro(10.0d);
        com.ufcg.daca.model.Ajuda ajuda36 = new com.ufcg.daca.model.Ajuda((int) (short) 10, "Tutor", " -  - 100 - hi!", aluno15, tutor30);
        java.lang.String str37 = aluno15.getTelefone();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 -  - hi!" + "'", str17.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
        java.lang.String str49 = tutor39.getStatus();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        ajuda7.setDisciplina("Tutor");
        int int18 = ajuda7.getId();
        java.lang.String str19 = ajuda7.getDisciplina();
        boolean boolean20 = ajuda7.isAvaliacao();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Tutor" + "'", str19.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null - null - 0 - Tutor - null", "", (int) ' ', " -  - 0 - hi!", " - null - null - 0 - null - 0 -  - hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getTelefone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        tutor20.setLocalAtendimento("");
        java.lang.String str27 = tutor20.getStatus();
        java.lang.String str28 = tutor20.getDisciplina();
        tutor20.setDisciplina(" -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - Tutor - null", (int) (byte) 1, "Tutor", "null - null - 0 - null - null", "null - null - 0 - null - null");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        java.lang.String str20 = tutor10.getNivel();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Tutor" + "'", str20.equals("Tutor"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        int int23 = ajuda22.getId();
        ajuda22.setAvaliacao(true);
        ajuda22.setLocal("hi!");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        com.ufcg.daca.model.Tutor tutor8 = null;
        ajuda7.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor10 = null;
        ajuda7.setTutor(tutor10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor();
        tutor8.setHorario("");
        tutor8.setLocalAtendimento("hi!");
        tutor8.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda15 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno5, tutor8);
        ajuda15.setLocal("null - null - 0 - Tutor - null");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor3 = ajuda0.getTutor();
        ajuda0.setDisciplina("null - null - 0 - null");
        org.junit.Assert.assertNull(tutor3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        com.ufcg.daca.model.Tutor tutor3 = ajuda0.getTutor();
        java.lang.String str4 = ajuda0.getHorario();
        org.junit.Assert.assertNull(tutor3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.Class<?> wildcardClass8 = tutor6.getClass();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        aluno0.setNome("null - null - 0 - null - null");
        java.lang.String str3 = aluno0.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null - null - null - 0 - null - null - 0 - null - null" + "'", str3.equals("null - null - null - 0 - null - null - 0 - null - null"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        aluno0.setNome(" -  - 0 -  - hi!");
        java.lang.String str4 = aluno0.getMatricula();
        aluno0.setTelefone("");
        aluno0.setNome(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        java.lang.Class<?> wildcardClass12 = ajuda7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
        ajuda28.setLocal(" - null - 0 - null");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        tutor0.setDinheiro((-1.0d));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
        com.ufcg.daca.model.Tutor tutor19 = ajuda7.getTutor();
        java.lang.String str20 = ajuda7.getLocal();
        java.lang.String str21 = ajuda7.getDia();
        ajuda7.setHorario(" -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tutor19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        tutor0.setDiaDisponivel("hi!");
        java.lang.String str5 = tutor0.getHorario();
        double double6 = tutor0.getProeficiencia();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        java.lang.String str9 = aluno5.getTelefone();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        com.ufcg.daca.model.Tutor tutor20 = null;
        ajuda19.setTutor(tutor20);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        tutor11.setProeficiencia(0.0d);
        java.lang.String str14 = tutor11.getMatricula();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNivel("Tutor");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno(" -  - 0 - null - null - 0 - null - null", "null - null - null - 0 - null - null - 0 - null - null", (int) (short) 1, "null - null - 0 - null", "null - null - 0 - Tutor - null");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass5 = tutor0.getClass();
        java.lang.String str6 = tutor0.getDiaDisponivel();
        tutor0.setNota(1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        java.lang.String str8 = tutor0.getHorario();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setMatricula("");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setStatus("");
        java.lang.String str12 = tutor6.getDisciplina();
        tutor6.setProeficiencia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        double double20 = tutor12.getDinheiro();
        tutor12.setProeficiencia((int) (short) 100);
        tutor12.setDinheiro((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno(" -  - 0 - null - null - 0 - null - null", "null - null - 0 - Tutor - null", (int) (short) 100, " - null - null - 0 - null - 0 -  - hi!", "Tutor");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        com.ufcg.daca.model.Tutor tutor15 = ajuda7.getTutor();
        tutor15.setDinheiro((double) (-1));
        tutor15.setDiaDisponivel("");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        double double10 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.getMatricula();
        java.lang.String str7 = aluno5.toString();
        aluno5.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str10 = aluno5.noTelToString();
        com.ufcg.daca.model.Aluno aluno16 = null;
        com.ufcg.daca.model.Tutor tutor17 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda18 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno16, tutor17);
        ajuda18.setAvaliacao(false);
        ajuda18.setAvaliacao(false);
        ajuda18.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor31 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str32 = tutor31.getMatricula();
        java.lang.String str33 = tutor31.getDiaDisponivel();
        ajuda18.setTutor(tutor31);
        com.ufcg.daca.model.Ajuda ajuda35 = new com.ufcg.daca.model.Ajuda(100, "", "null - null - 0 - Tutor - null", " -  - 0 - hi!", "null - null - 0 - null - null", aluno5, tutor31);
        aluno5.setEmail(" -  - 0 -  - hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null - null - 0 - null" + "'", str10.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setHorario("hi!");
        double double10 = tutor6.getNota();
        tutor6.setNota((double) 1L);
        tutor6.setProeficiencia(0.0d);
        tutor6.setNota((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getStatus();
        java.lang.String str8 = tutor6.getDisciplina();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        int int11 = ajuda0.getId();
        ajuda0.setLocal("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        double double8 = tutor6.getProeficiencia();
        java.lang.String str9 = tutor6.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        aluno10.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        aluno10.setCodigoCurso(52);
        aluno10.setCodigoCurso((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDisciplina("null - null - 0 - null");
        java.lang.String str6 = tutor0.getStatus();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        tutor20.setLocalAtendimento("");
        java.lang.String str27 = tutor20.getDisciplina();
        java.lang.String str28 = tutor20.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
        java.lang.String str24 = aluno8.getEmail();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + " -  - 0 - hi!" + "'", str23.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setId((int) '4');
        java.lang.String str10 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno21 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str22 = aluno21.getTelefone();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setLocalAtendimento("hi!");
        tutor23.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno21, tutor23);
        aluno21.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        ajuda7.setAluno(aluno21);
        int int34 = aluno21.getCodigoCurso();
        aluno21.setMatricula("null - null - 0 - null - null");
        java.lang.String str37 = aluno21.getMatricula();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null - null - 0 - null - null" + "'", str37.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor9 = ajuda0.getTutor();
        com.ufcg.daca.model.Tutor tutor10 = ajuda0.getTutor();
        ajuda0.setDia("null - null - 0 - null - null");
        ajuda0.setId(0);
        org.junit.Assert.assertNull(tutor9);
        org.junit.Assert.assertNull(tutor10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getLocalAtendimento();
        tutor6.setStatus(" - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDinheiro(0.0d);
        java.lang.Class<?> wildcardClass6 = tutor0.getClass();
        tutor0.setLocalAtendimento(" -  - 100 - hi!");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setMatricula("");
        java.lang.String str8 = aluno5.getMatricula();
        java.lang.String str9 = aluno5.noTelToString();
        aluno5.setCodigoCurso((int) (short) 0);
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setStatus(" -  - 0 -  - hi!");
        double double17 = tutor12.getProeficiencia();
        double double18 = tutor12.getDinheiro();
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) 1, "null - null - 0 - Tutor - null", " - null - null - 0 - null - 0 -  - hi!", "Tutor", "null - null - 0 - null", aluno5, tutor12);
        java.lang.String str20 = aluno5.getTelefone();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " - null - 0 - null" + "'", str9.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setMatricula("");
        java.lang.String str8 = aluno5.getMatricula();
        java.lang.String str9 = aluno5.noTelToString();
        aluno5.setCodigoCurso((int) (short) 0);
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setStatus(" -  - 0 -  - hi!");
        double double17 = tutor12.getProeficiencia();
        double double18 = tutor12.getDinheiro();
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) 1, "null - null - 0 - Tutor - null", " - null - null - 0 - null - 0 -  - hi!", "Tutor", "null - null - 0 - null", aluno5, tutor12);
        ajuda19.setDia(" - null - null - 0 - null - 0 -  - hi!");
        ajuda19.setDia("");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " - null - 0 - null" + "'", str9.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getDisciplina();
        java.lang.String str10 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNota((double) 1L);
        tutor0.setNota((double) (short) 100);
        java.lang.String str8 = tutor0.getHorario();
        tutor0.setNota((double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        com.ufcg.daca.model.Tutor tutor29 = new com.ufcg.daca.model.Tutor();
        tutor29.setNivel("null - null - 0 - null - null");
        double double32 = tutor29.getProeficiencia();
        ajuda28.setTutor(tutor29);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        java.lang.String str14 = ajuda7.getDia();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.getEmail();
        aluno5.setTelefone(" -  - 100 - hi!");
        aluno5.setNome("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
        ajuda7.setId((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(tutor21);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        tutor11.setProeficiencia(0.0d);
        tutor11.setMatricula("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        tutor6.setStatus("null - null - 0 - Tutor - null");
        java.lang.String str11 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNota((double) 1L);
        tutor0.setNota((double) (short) 100);
        java.lang.String str8 = tutor0.getHorario();
        java.lang.String str9 = tutor0.getHorario();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getLocalAtendimento();
        tutor0.setLocalAtendimento(" -  - 0 - hi!");
        java.lang.String str10 = tutor0.getStatus();
        java.lang.String str11 = tutor0.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        int int11 = ajuda0.getId();
        java.lang.String str12 = ajuda0.getHorario();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        tutor0.setMatricula("hi!");
        java.lang.String str12 = tutor0.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        tutor28.setDiaDisponivel("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 -  - hi!" + "'", str15.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + " -  - 0 - hi!" + "'", str19.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        tutor39.setStatus(" -  - 0 - hi!");
        java.lang.String str51 = tutor39.getMatricula();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getLocalAtendimento();
        tutor0.setLocalAtendimento(" -  - 0 - hi!");
        tutor0.setNivel("null - null - null - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        tutor15.setDisciplina("");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        double double5 = tutor0.getDinheiro();
        tutor0.setStatus(" -  - 0 - hi!");
        tutor0.setHorario("null - null - 0 - null - null");
        java.lang.String str10 = tutor0.getDisciplina();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor28 = null;
        ajuda7.setTutor(tutor28);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double7 = tutor6.getNota();
        tutor6.setDinheiro((double) 0.0f);
        tutor6.setNivel(" -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setEmail("null - null - 0 - null - null");
        java.lang.String str9 = aluno5.getEmail();
        java.lang.String str10 = aluno5.noTelToString();
        java.lang.String str11 = aluno5.noTelToString();
        int int12 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null - null - 0 - null - null" + "'", str9.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str10.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str11.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        tutor20.setLocalAtendimento("");
        java.lang.String str27 = tutor20.getStatus();
        java.lang.String str28 = tutor20.getDisciplina();
        java.lang.String str29 = tutor20.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.String str8 = ajuda7.getHorario();
        ajuda7.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        tutor34.setLocalAtendimento("");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        double double8 = tutor6.getNota();
        tutor6.setProeficiencia(0.0d);
        tutor6.setStatus(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        ajuda7.setAvaliacao(false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDisciplina("null - null - 0 - null");
        java.lang.String str6 = tutor0.getLocalAtendimento();
        tutor0.setStatus(" -  - 0 - hi!");
        java.lang.Class<?> wildcardClass9 = tutor0.getClass();
        java.lang.String str10 = tutor0.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        tutor28.setNota((double) (-1L));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 -  - hi!" + "'", str15.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + " -  - 0 - hi!" + "'", str19.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda();
        boolean boolean23 = ajuda22.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno29 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str30 = aluno29.getTelefone();
        java.lang.String str31 = aluno29.toString();
        ajuda22.setAluno(aluno29);
        java.lang.String str33 = aluno29.getEmail();
        com.ufcg.daca.model.Tutor tutor40 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor40.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda43 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno29, tutor40);
        ajuda7.setTutor(tutor40);
        boolean boolean45 = ajuda7.isAvaliacao();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + " -  - 0 -  - hi!" + "'", str31.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        double double10 = tutor6.getProeficiencia();
        tutor6.setProeficiencia((double) 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        double double8 = tutor6.getNota();
        tutor6.setProeficiencia(0.0d);
        tutor6.setNota(0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        tutor6.setMatricula(" -  - 0 - null - null - 0 - null - null");
        tutor6.setDisciplina(" -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        double double20 = tutor12.getDinheiro();
        double double21 = tutor12.getNota();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        int int12 = aluno7.getCodigoCurso();
        java.lang.String str13 = aluno7.getMatricula();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setCodigoCurso((int) '4');
        java.lang.String str11 = aluno5.noTelToString();
        aluno5.setNome(" -  - 100 - hi!");
        aluno5.setMatricula(" -  - 100 - hi!");
        java.lang.String str16 = aluno5.getEmail();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 52 - hi!" + "'", str11.equals(" -  - 52 - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        int int3 = ajuda0.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getHorario();
        double double8 = tutor0.getNota();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getMatricula();
        java.lang.String str8 = tutor0.getStatus();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor9 = ajuda0.getTutor();
        ajuda0.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor12 = ajuda0.getTutor();
        com.ufcg.daca.model.Ajuda ajuda18 = new com.ufcg.daca.model.Ajuda();
        boolean boolean19 = ajuda18.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno25 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str26 = aluno25.getTelefone();
        java.lang.String str27 = aluno25.toString();
        ajuda18.setAluno(aluno25);
        java.lang.String str29 = aluno25.getEmail();
        com.ufcg.daca.model.Tutor tutor36 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor36.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda39 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno25, tutor36);
        ajuda0.setTutor(tutor36);
        org.junit.Assert.assertNull(tutor9);
        org.junit.Assert.assertNull(tutor12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + " -  - 0 -  - hi!" + "'", str27.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        tutor0.setNivel("");
        tutor0.setDisciplina("null - null - 0 - Tutor - null");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        java.lang.String str20 = tutor12.getNivel();
        java.lang.String str21 = tutor12.getNivel();
        tutor12.setProeficiencia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Tutor" + "'", str20.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Tutor" + "'", str21.equals("Tutor"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getMatricula();
        java.lang.String str10 = aluno5.noTelToString();
        java.lang.String str11 = aluno5.getNome();
        int int12 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 100 - hi!" + "'", str10.equals(" -  - 100 - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        ajuda0.setLocal("");
        com.ufcg.daca.model.Aluno aluno13 = ajuda0.getAluno();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNull(aluno13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null - null - null - 0 - null - null - 0 - null - null", " -  - 0 - null - null - 0 - null - null", (int) (short) 0, "null - null - 0 - null - null", "null - null - 0 - null - null");
        java.lang.String str6 = aluno5.getNome();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null - null - null - 0 - null - null - 0 - null - null" + "'", str6.equals("null - null - null - 0 - null - null - 0 - null - null"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        ajuda7.setId((int) (byte) 10);
        ajuda7.setHorario("Tutor");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setStatus("");
        java.lang.String str12 = tutor6.getDisciplina();
        java.lang.String str13 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        java.lang.String str5 = tutor0.getDisciplina();
        tutor0.setNivel(" -  - 0 -  - hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        double double7 = tutor0.getDinheiro();
        tutor0.setStatus(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        java.lang.String str10 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        int int16 = ajuda7.getId();
        int int17 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getTelefone();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.toString();
        int int2 = aluno0.getCodigoCurso();
        aluno0.setNome("null - null - 0 - null - null");
        java.lang.String str5 = aluno0.getEmail();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null - null" + "'", str1.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        double double45 = tutor34.getNota();
        java.lang.String str46 = tutor34.getStatus();
        tutor34.setStatus(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.0d + "'", double45 == 4.0d);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDinheiro(10.0d);
        java.lang.String str6 = tutor0.getMatricula();
        java.lang.String str7 = tutor0.getLocalAtendimento();
        tutor0.setStatus("null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null - null", 0, " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", " -  - 0 - null - null - 0 - null - null", " - null - null - 0 - null - 0 -  - hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        com.ufcg.daca.model.Tutor tutor19 = ajuda7.getTutor();
        tutor19.setProeficiencia((int) '#');
        tutor19.setNivel(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(tutor19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.toString();
        java.lang.String str2 = aluno0.getMatricula();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null - null" + "'", str1.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        com.ufcg.daca.model.Tutor tutor19 = ajuda7.getTutor();
        tutor19.setStatus(" -  - 0 -  - hi!");
        java.lang.String str22 = tutor19.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tutor19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ufcg.daca.model.Ajuda ajuda8 = new com.ufcg.daca.model.Ajuda();
        boolean boolean9 = ajuda8.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno15 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str16 = aluno15.getTelefone();
        java.lang.String str17 = aluno15.toString();
        ajuda8.setAluno(aluno15);
        java.lang.String str19 = aluno15.getEmail();
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor26.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno15, tutor26);
        com.ufcg.daca.model.Tutor tutor30 = new com.ufcg.daca.model.Tutor();
        tutor30.setNivel("null - null - 0 - null - null");
        double double33 = tutor30.getProeficiencia();
        tutor30.setDinheiro(10.0d);
        com.ufcg.daca.model.Ajuda ajuda36 = new com.ufcg.daca.model.Ajuda((int) (short) 10, "Tutor", " -  - 100 - hi!", aluno15, tutor30);
        boolean boolean37 = ajuda36.isAvaliacao();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 -  - hi!" + "'", str17.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        aluno8.setEmail("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 100 - hi!" + "'", str13.equals(" -  - 100 - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        java.lang.String str29 = ajuda28.getDia();
        java.lang.String str30 = ajuda28.getLocal();
        com.ufcg.daca.model.Aluno aluno31 = null;
        ajuda28.setAluno(aluno31);
        ajuda28.setDisciplina(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 - hi!" + "'", str29.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        ajuda26.setLocal("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 -  - hi!" + "'", str14.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor9 = ajuda0.getTutor();
        ajuda0.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor12 = ajuda0.getTutor();
        ajuda0.setLocal(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(tutor9);
        org.junit.Assert.assertNull(tutor12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDisciplina("null - null - 0 - null");
        java.lang.String str6 = tutor0.getLocalAtendimento();
        tutor0.setStatus(" -  - 0 - hi!");
        double double9 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno5.setMatricula("hi!");
        java.lang.String str8 = aluno5.noTelToString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! -  - 0 - hi!" + "'", str8.equals("hi! -  - 0 - hi!"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        java.lang.Class<?> wildcardClass15 = ajuda7.getClass();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null - null - null - 0 - null - null - 0 - null - null", "null - null - 0 -  -  - 0 -  - hi! - null", 0, " -  - 0 -  - hi!", "null - null - 0 - null - null");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        java.lang.String str29 = ajuda28.getDia();
        ajuda28.setDisciplina("hi! -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 - hi!" + "'", str29.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        aluno0.setTelefone(" -  - 0 -  - hi!");
        aluno0.setMatricula("hi!");
        aluno0.setNome("null - null - 0 - null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        double double5 = tutor0.getDinheiro();
        tutor0.setStatus(" -  - 0 - hi!");
        tutor0.setHorario("null - null - 0 - null - null");
        java.lang.String str10 = tutor0.getMatricula();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        tutor16.setDisciplina("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        tutor16.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        tutor39.setNivel(" - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        java.lang.String str8 = ajuda0.getHorario();
        com.ufcg.daca.model.Aluno aluno14 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str15 = aluno14.toString();
        aluno14.setEmail("null - null - 0 - null - null");
        ajuda0.setAluno(aluno14);
        aluno14.setCodigoCurso((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 -  - hi!" + "'", str15.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.noTelToString();
        java.lang.String str2 = aluno0.getEmail();
        java.lang.Class<?> wildcardClass3 = aluno0.getClass();
        int int4 = aluno0.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null" + "'", str1.equals("null - null - 0 - null"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.toString();
        int int2 = aluno0.getCodigoCurso();
        java.lang.String str3 = aluno0.getTelefone();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null - null" + "'", str1.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        java.lang.Class<?> wildcardClass49 = aluno8.getClass();
        aluno8.setTelefone(" -  - 52 - hi!");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        com.ufcg.daca.model.Aluno aluno26 = null;
        ajuda7.setAluno(aluno26);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getLocalAtendimento();
        tutor6.setProeficiencia((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.String str5 = tutor0.getLocalAtendimento();
        tutor0.setNota((double) (byte) 10);
        java.lang.String str8 = tutor0.getDisciplina();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.String str8 = ajuda7.getDia();
        java.lang.String str9 = ajuda7.getHorario();
        int int10 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setId((int) '4');
        java.lang.String str10 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno21 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str22 = aluno21.getTelefone();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setLocalAtendimento("hi!");
        tutor23.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno21, tutor23);
        aluno21.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        ajuda7.setAluno(aluno21);
        int int34 = aluno21.getCodigoCurso();
        java.lang.String str35 = aluno21.toString();
        int int36 = aluno21.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!" + "'", str35.equals(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setLocalAtendimento("Tutor");
        double double10 = tutor6.getProeficiencia();
        tutor6.setDisciplina(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.noTelToString();
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double14 = tutor13.getNota();
        tutor13.setNivel(" -  - 0 -  - hi!");
        tutor13.setDiaDisponivel("hi!");
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda(100, "hi!", "", " -  - 52 - hi!", "null - null - 0 - null", aluno5, tutor13);
        tutor13.setProeficiencia((int) (short) 0);
        java.lang.String str22 = tutor13.getHorario();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null - null - 0 - null" + "'", str6.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        int int23 = ajuda22.getId();
        ajuda22.setAvaliacao(true);
        ajuda22.setDisciplina(" - null - 0 - null");
        int int28 = ajuda22.getId();
        ajuda22.setId((int) '4');
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("");
        tutor0.setNivel(" -  - 0 - null - null - 0 - null - null");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor9 = ajuda0.getTutor();
        ajuda0.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor12 = ajuda0.getTutor();
        ajuda0.setLocal("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        org.junit.Assert.assertNull(tutor9);
        org.junit.Assert.assertNull(tutor12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        java.lang.String str19 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno25 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str26 = aluno25.toString();
        aluno25.setCodigoCurso((int) (short) 100);
        java.lang.String str29 = aluno25.getNome();
        ajuda7.setAluno(aluno25);
        ajuda7.setDisciplina("null - null - 0 - null");
        ajuda7.setLocal(" -  - 100 - hi!");
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        ajuda7.setLocal("Tutor");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(aluno21);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.0d + "'", double31 == 4.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        tutor6.setMatricula("hi!");
        java.lang.String str14 = tutor6.getNivel();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "TOP" + "'", str14.equals("TOP"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.ufcg.daca.model.Ajuda ajuda8 = new com.ufcg.daca.model.Ajuda();
        boolean boolean9 = ajuda8.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno15 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str16 = aluno15.getTelefone();
        java.lang.String str17 = aluno15.toString();
        ajuda8.setAluno(aluno15);
        java.lang.String str19 = aluno15.getEmail();
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor26.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno15, tutor26);
        com.ufcg.daca.model.Tutor tutor30 = new com.ufcg.daca.model.Tutor();
        tutor30.setNivel("null - null - 0 - null - null");
        double double33 = tutor30.getProeficiencia();
        tutor30.setDinheiro(10.0d);
        com.ufcg.daca.model.Ajuda ajuda36 = new com.ufcg.daca.model.Ajuda((int) (short) 10, "Tutor", " -  - 100 - hi!", aluno15, tutor30);
        aluno15.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 -  - hi!" + "'", str17.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        double double8 = tutor6.getNota();
        tutor6.setProeficiencia(0.0d);
        tutor6.setDiaDisponivel("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
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
        aluno8.setMatricula(" -  - 100 - hi!");
        aluno8.setCodigoCurso(1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        double double10 = tutor6.getNota();
        tutor6.setNota((double) 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        tutor0.setLocalAtendimento("Tutor");
        tutor0.setDiaDisponivel(" -  - 52 - hi!");
        double double11 = tutor0.getNota();
        java.lang.String str12 = tutor0.getNivel();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Tutor" + "'", str12.equals("Tutor"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        double double11 = tutor8.getDinheiro();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        java.lang.String str3 = ajuda0.getDia();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        int int16 = ajuda7.getId();
        boolean boolean17 = ajuda7.isAvaliacao();
        ajuda7.setHorario(" - null - 0 - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        ajuda7.setLocal("hi!");
        boolean boolean22 = ajuda7.isAvaliacao();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null - null - 0 -  -  - 0 -  - hi! - null", " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", (int) (byte) 1, "hi!", "null - null - 0 - Tutor - null");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setHorario("Tutor");
        com.ufcg.daca.model.Aluno aluno10 = ajuda7.getAluno();
        java.lang.String str11 = ajuda7.getHorario();
        org.junit.Assert.assertNull(aluno10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Tutor" + "'", str11.equals("Tutor"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        double double10 = tutor6.getProeficiencia();
        tutor6.setProeficiencia(10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.ufcg.daca.model.Ajuda ajuda8 = new com.ufcg.daca.model.Ajuda();
        boolean boolean9 = ajuda8.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno15 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str16 = aluno15.getTelefone();
        java.lang.String str17 = aluno15.toString();
        ajuda8.setAluno(aluno15);
        java.lang.String str19 = aluno15.getEmail();
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor26.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno15, tutor26);
        com.ufcg.daca.model.Tutor tutor30 = new com.ufcg.daca.model.Tutor();
        tutor30.setNivel("null - null - 0 - null - null");
        double double33 = tutor30.getProeficiencia();
        tutor30.setDinheiro(10.0d);
        com.ufcg.daca.model.Ajuda ajuda36 = new com.ufcg.daca.model.Ajuda((int) (short) 10, "Tutor", " -  - 100 - hi!", aluno15, tutor30);
        tutor30.setMatricula("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 -  - hi!" + "'", str17.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        tutor11.setDiaDisponivel(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        java.lang.String str4 = tutor0.getMatricula();
        double double5 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.noTelToString();
        java.lang.String str2 = aluno0.noTelToString();
        aluno0.setTelefone("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null" + "'", str1.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null" + "'", str2.equals("null - null - 0 - null"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        com.ufcg.daca.model.Tutor tutor19 = ajuda7.getTutor();
        ajuda7.setDia(" -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(tutor19);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        int int23 = ajuda22.getId();
        boolean boolean24 = ajuda22.isAvaliacao();
        ajuda22.setHorario(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        double double12 = tutor6.getDinheiro();
        tutor6.setDiaDisponivel("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        double double7 = tutor0.getDinheiro();
        double double8 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.String str5 = tutor0.getLocalAtendimento();
        tutor0.setDisciplina(" - null - 0 - null");
        tutor0.setLocalAtendimento("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setDisciplina("null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass5 = tutor0.getClass();
        java.lang.String str6 = tutor0.getStatus();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        int int6 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        java.lang.Class<?> wildcardClass17 = tutor11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Tutor" + "'", str16.equals("Tutor"));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setHorario("Tutor");
        boolean boolean10 = ajuda7.isAvaliacao();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setDiaDisponivel("Tutor");
        java.lang.Class<?> wildcardClass7 = tutor0.getClass();
        tutor0.setNivel(" - null - 0 - null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        tutor0.setNivel("");
        double double7 = tutor0.getDinheiro();
        java.lang.String str8 = tutor0.getStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        boolean boolean33 = ajuda7.isAvaliacao();
        ajuda7.setId((int) '4');
        ajuda7.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(aluno21);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.0d + "'", double31 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        tutor0.setNivel("");
        double double7 = tutor0.getDinheiro();
        java.lang.String str8 = tutor0.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        boolean boolean19 = ajuda7.isAvaliacao();
        ajuda7.setDia(" -  - 52 - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno5.setNome("null - null - 0 - null");
        java.lang.String str8 = aluno5.toString();
        aluno5.setEmail(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " - null - null - 0 - null - 0 -  - hi!" + "'", str8.equals(" - null - null - 0 - null - 0 -  - hi!"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor9 = new com.ufcg.daca.model.Tutor();
        tutor9.setHorario("");
        tutor9.setProeficiencia((double) 0.0f);
        tutor9.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda16 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno8, tutor9);
        java.lang.String str17 = aluno8.getMatricula();
        aluno8.setNome("hi! -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor20 = null;
        com.ufcg.daca.model.Ajuda ajuda21 = new com.ufcg.daca.model.Ajuda(1, "null - null - 0 - null - null", " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", " -  - 100 - hi!", "Tutor", aluno8, tutor20);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno(" -  - 100 - hi!", "null - null - 0 - null", (int) (short) 100, " -  - 0 - hi!", " -  - 0 - null - null - 0 - null - null");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setHorario(" - null - 0 - null");
        tutor6.setNota((double) (byte) 0);
        java.lang.String str14 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        tutor0.setLocalAtendimento("Tutor");
        tutor0.setDiaDisponivel(" -  - 52 - hi!");
        double double11 = tutor0.getNota();
        tutor0.setProeficiencia(52);
        tutor0.setNivel(" -  - 52 - hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        tutor0.setDiaDisponivel("hi!");
        java.lang.String str5 = tutor0.getHorario();
        tutor0.setDinheiro(0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        java.lang.String str49 = aluno8.getNome();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        tutor0.setLocalAtendimento("Tutor");
        tutor0.setDiaDisponivel(" -  - 52 - hi!");
        double double11 = tutor0.getNota();
        tutor0.setDiaDisponivel(" -  - 0 - null - null - 0 - null - null");
        tutor0.setProeficiencia((int) (byte) 10);
        java.lang.String str16 = tutor0.getDisciplina();
        tutor0.setDinheiro((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null - null - 0 - null - null" + "'", str16.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        com.ufcg.daca.model.Tutor tutor23 = ajuda7.getTutor();
        java.lang.String str24 = tutor23.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(aluno21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tutor23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        com.ufcg.daca.model.Tutor tutor15 = ajuda7.getTutor();
        ajuda7.setId((int) (short) -1);
        java.lang.String str18 = ajuda7.getDia();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        java.lang.String str24 = aluno8.getMatricula();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setEmail("null - null - 0 - null - null");
        java.lang.String str9 = aluno5.getEmail();
        aluno5.setEmail(" - null - 0 - null");
        java.lang.String str12 = aluno5.getNome();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null - null - 0 - null - null" + "'", str9.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.noTelToString();
        java.lang.String str2 = aluno0.noTelToString();
        aluno0.setMatricula("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        aluno0.setTelefone(" - null - 0 - null");
        aluno0.setNome(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null" + "'", str1.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null" + "'", str2.equals("null - null - 0 - null"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        java.lang.String str51 = aluno16.toString();
        java.lang.String str52 = aluno16.getMatricula();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + " -  - 0 -  - hi!" + "'", str18.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + " -  - 0 - hi!" + "'", str22.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + " -  - 0 -  - hi!" + "'", str51.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getStatus();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        java.lang.String str19 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno25 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str26 = aluno25.toString();
        aluno25.setCodigoCurso((int) (short) 100);
        java.lang.String str29 = aluno25.getNome();
        ajuda7.setAluno(aluno25);
        int int31 = aluno25.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setEmail("null - null - 0 - null - null");
        java.lang.String str12 = aluno8.getEmail();
        java.lang.String str13 = aluno8.noTelToString();
        java.lang.String str14 = aluno8.noTelToString();
        aluno8.setTelefone("null - null - 0 - null");
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double24 = tutor23.getNota();
        double double25 = tutor23.getNota();
        double double26 = tutor23.getNota();
        java.lang.String str27 = tutor23.getLocalAtendimento();
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (short) 1, "hi!", "null - null - 0 - Tutor - null", aluno8, tutor23);
        com.ufcg.daca.model.Tutor tutor29 = null;
        ajuda28.setTutor(tutor29);
        ajuda28.setDisciplina("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null - null - 0 - null - null" + "'", str12.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str13.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str14.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.noTelToString();
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double14 = tutor13.getNota();
        tutor13.setNivel(" -  - 0 -  - hi!");
        tutor13.setDiaDisponivel("hi!");
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda(100, "hi!", "", " -  - 52 - hi!", "null - null - 0 - null", aluno5, tutor13);
        aluno5.setTelefone("null - null - null - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null - null - 0 - null" + "'", str6.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        java.lang.String str24 = tutor15.getStatus();
        java.lang.String str25 = tutor15.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
        com.ufcg.daca.model.Tutor tutor31 = ajuda28.getTutor();
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertNotNull(tutor31);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - null - 0 - null - null - 0 - null - null", "null - null - 0 -  -  - 0 -  - hi! - null", (int) 'a', "Tutor", "null - null - 0 - null - null", "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNota((double) 1L);
        double double6 = tutor0.getNota();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        tutor0.setLocalAtendimento("Tutor");
        tutor0.setDiaDisponivel(" -  - 52 - hi!");
        double double11 = tutor0.getNota();
        tutor0.setDiaDisponivel(" -  - 0 - null - null - 0 - null - null");
        double double14 = tutor0.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        tutor0.setMatricula("hi!");
        tutor0.setProeficiencia((int) '#');
        java.lang.String str14 = tutor0.getDiaDisponivel();
        java.lang.String str15 = tutor0.getStatus();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        boolean boolean19 = ajuda7.isAvaliacao();
        int int20 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        tutor54.setNota((double) 100L);
        com.ufcg.daca.model.Ajuda ajuda59 = new com.ufcg.daca.model.Ajuda((int) (short) 100, " - null - 0 - null", "hi!", aluno11, tutor54);
        java.lang.String str60 = aluno11.getTelefone();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 -  - hi!" + "'", str13.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 -  - hi!" + "'", str29.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " -  - 0 - hi!" + "'", str33.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        double double5 = tutor0.getDinheiro();
        tutor0.setStatus(" -  - 0 - hi!");
        tutor0.setHorario("null - null - 0 - null - null");
        double double10 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setCodigoCurso((int) '4');
        java.lang.String str11 = aluno5.getEmail();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setHorario("Tutor");
        ajuda7.setAvaliacao(true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        aluno0.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str5 = aluno0.getNome();
        java.lang.String str6 = aluno0.getNome();
        java.lang.String str7 = aluno0.getMatricula();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        java.lang.String str19 = ajuda7.getHorario();
        java.lang.String str20 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        java.lang.String str12 = aluno3.getMatricula();
        aluno3.setNome("hi! -  - 0 - hi!");
        aluno3.setMatricula("");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        tutor0.setNota((double) 100L);
        tutor0.setProeficiencia((double) (-1L));
        double double7 = tutor0.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        aluno0.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str5 = aluno0.noTelToString();
        aluno0.setNome("hi!");
        aluno0.setTelefone(" -  - 0 -  - hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null - null - 0 - null" + "'", str5.equals("null - null - 0 - null"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        ajuda7.setHorario("hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double7 = tutor6.getDinheiro();
        tutor6.setProeficiencia((double) '#');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        int int7 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        java.lang.String str8 = tutor6.getStatus();
        double double9 = tutor6.getDinheiro();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        com.ufcg.daca.model.Tutor tutor19 = ajuda7.getTutor();
        java.lang.String str20 = tutor19.getStatus();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tutor19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        ajuda7.setLocal("null - null - 0 - Tutor - null");
        com.ufcg.daca.model.Aluno aluno20 = ajuda7.getAluno();
        com.ufcg.daca.model.Aluno aluno26 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str27 = aluno26.toString();
        aluno26.setCodigoCurso((int) (short) 100);
        java.lang.String str30 = aluno26.getMatricula();
        java.lang.String str31 = aluno26.noTelToString();
        ajuda7.setAluno(aluno26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNull(aluno20);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + " -  - 0 -  - hi!" + "'", str27.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + " -  - 100 - hi!" + "'", str31.equals(" -  - 100 - hi!"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.ufcg.daca.model.Aluno aluno6 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor7 = new com.ufcg.daca.model.Tutor();
        tutor7.setHorario("");
        tutor7.setProeficiencia((double) 0.0f);
        tutor7.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda14 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno6, tutor7);
        aluno6.setTelefone("Tutor");
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double24 = tutor23.getNota();
        tutor23.setHorario("hi!");
        com.ufcg.daca.model.Ajuda ajuda27 = new com.ufcg.daca.model.Ajuda(100, "null - null - 0 - Tutor - null", "hi! -  - 0 - hi!", aluno6, tutor23);
        double double28 = tutor23.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        ajuda22.setAluno(aluno36);
        java.lang.String str60 = ajuda22.getDia();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + " -  - 0 -  - hi!" + "'", str38.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + " -  - 0 - hi!" + "'", str42.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor3 = ajuda0.getTutor();
        ajuda0.setId((-1));
        org.junit.Assert.assertNull(tutor3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        double double20 = tutor12.getDinheiro();
        tutor12.setProeficiencia((int) (short) 100);
        java.lang.String str23 = tutor12.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        java.lang.String str23 = ajuda7.getHorario();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        aluno10.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        int int22 = aluno10.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getDisciplina();
        java.lang.String str10 = tutor6.getNivel();
        tutor6.setHorario(" -  - 0 - hi!");
        java.lang.String str13 = tutor6.getLocalAtendimento();
        double double14 = tutor6.getNota();
        tutor6.setProeficiencia((double) '#');
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Tutor" + "'", str10.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        double double10 = tutor6.getDinheiro();
        tutor6.setLocalAtendimento("Tutor");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
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
        tutor28.setProeficiencia((double) 0L);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 100 - hi!" + "'", str13.equals(" -  - 100 - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
        ajuda7.setAvaliacao(true);
        java.lang.String str22 = ajuda7.getDisciplina();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.noTelToString();
        java.lang.String str8 = aluno5.getNome();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 - hi!" + "'", str7.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" -  - 0 -  - hi!", " -  - 0 - hi!", (int) '4', " -  - 52 - hi!", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " - null - 0 - null");
        tutor6.setProeficiencia((double) 100.0f);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        double double5 = tutor0.getProeficiencia();
        tutor0.setDisciplina(" -  - 0 -  - hi!");
        java.lang.String str8 = tutor0.getStatus();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " -  - 0 -  - hi!" + "'", str8.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        java.lang.Class<?> wildcardClass19 = ajuda7.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        com.ufcg.daca.model.Tutor tutor19 = ajuda7.getTutor();
        tutor19.setProeficiencia((int) '#');
        tutor19.setLocalAtendimento("null - null - null - 0 - null - null - 0 - null - null");
        double double24 = tutor19.getProeficiencia();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(tutor19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        aluno0.setNome(" -  - 0 -  - hi!");
        aluno0.setTelefone(" - null - 0 - null");
        aluno0.setMatricula("null - null - 0 - null - null");
        java.lang.String str8 = aluno0.getNome();
        int int9 = aluno0.getCodigoCurso();
        aluno0.setTelefone(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " -  - 0 -  - hi!" + "'", str8.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor();
        tutor8.setHorario("");
        tutor8.setLocalAtendimento("hi!");
        tutor8.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda15 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno5, tutor8);
        boolean boolean16 = ajuda15.isAvaliacao();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.ufcg.daca.model.Aluno aluno15 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno15.setMatricula(" -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor18 = new com.ufcg.daca.model.Tutor();
        tutor18.setNivel("null - null - 0 - null - null");
        double double21 = tutor18.getProeficiencia();
        tutor18.setMatricula("Tutor");
        tutor18.setNivel("hi!");
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((-1), "", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", " - null - null - 0 - null - 0 -  - hi!", aluno15, tutor18);
        int int27 = aluno15.getCodigoCurso();
        com.ufcg.daca.model.Tutor tutor34 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str35 = tutor34.getMatricula();
        java.lang.String str36 = tutor34.getDiaDisponivel();
        tutor34.setProeficiencia(100.0d);
        com.ufcg.daca.model.Ajuda ajuda39 = new com.ufcg.daca.model.Ajuda((int) (byte) 1, " -  - 100 - hi!", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " - null - null - 0 - null - 0 -  - hi!", "", aluno15, tutor34);
        aluno15.setNome("null - null - 0 -  -  - 0 -  - hi! - null");
        java.lang.String str42 = aluno15.getEmail();
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno5.setMatricula("hi!");
        aluno5.setNome("");
        aluno5.setTelefone("null - null - 0 - null - null");
        java.lang.String str12 = aluno5.getTelefone();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null - null - 0 - null - null" + "'", str12.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        tutor54.setNota((double) 100L);
        com.ufcg.daca.model.Ajuda ajuda59 = new com.ufcg.daca.model.Ajuda((int) (short) 100, " - null - 0 - null", "hi!", aluno11, tutor54);
        tutor54.setNivel(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 -  - hi!" + "'", str13.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 -  - hi!" + "'", str29.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " -  - 0 - hi!" + "'", str33.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        tutor34.setNota((double) 1L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        java.lang.String str3 = tutor0.getLocalAtendimento();
        double double4 = tutor0.getNota();
        tutor0.setHorario(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setStatus("");
        tutor6.setDisciplina("Tutor");
        tutor6.setLocalAtendimento("TOP");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        double double5 = tutor0.getDinheiro();
        tutor0.setStatus("null - null - 0 - Tutor - null");
        double double8 = tutor0.getDinheiro();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("null - null - 0 - null");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        java.lang.String str35 = aluno13.getNome();
        java.lang.String str36 = aluno13.noTelToString();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + " -  - 0 -  - hi!" + "'", str15.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + " -  - 0 - hi!" + "'", str19.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + " -  - 0 - hi!" + "'", str36.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        tutor6.setProeficiencia((double) (short) 10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.String str8 = ajuda7.getHorario();
        ajuda7.setHorario("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        tutor11.setProeficiencia(0.0d);
        java.lang.String str14 = tutor11.getHorario();
        double double15 = tutor11.getProeficiencia();
        double double16 = tutor11.getNota();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        double double5 = tutor0.getProeficiencia();
        double double6 = tutor0.getDinheiro();
        double double7 = tutor0.getProeficiencia();
        tutor0.setNivel(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        tutor0.setDinheiro((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        tutor0.setDiaDisponivel("hi!");
        java.lang.String str5 = tutor0.getMatricula();
        java.lang.String str6 = tutor0.getNivel();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Tutor" + "'", str6.equals("Tutor"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getDisciplina();
        java.lang.String str10 = tutor6.getMatricula();
        tutor6.setLocalAtendimento("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setLocal("Tutor");
        ajuda0.setHorario("Tutor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setId((int) (byte) 100);
        ajuda7.setLocal(" -  - 0 -  - hi!");
        ajuda7.setAvaliacao(true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        ajuda50.setDia(" -  - 0 -  - hi!");
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
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setNome("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor();
        tutor8.setHorario("");
        tutor8.setLocalAtendimento("hi!");
        tutor8.setDiaDisponivel("Tutor");
        com.ufcg.daca.model.Ajuda ajuda15 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "", "", "null - null - 0 - null - null", aluno5, tutor8);
        java.lang.String str16 = tutor8.getHorario();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor6.setMatricula("");
        double double9 = tutor6.getNota();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId(100);
        com.ufcg.daca.model.Aluno aluno16 = ajuda7.getAluno();
        ajuda7.setLocal(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!");
        org.junit.Assert.assertNull(aluno16);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        java.lang.String str5 = tutor0.getDisciplina();
        java.lang.String str6 = tutor0.getDiaDisponivel();
        java.lang.String str7 = tutor0.getMatricula();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null - null - 0 - null - null" + "'", str6.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        tutor20.setLocalAtendimento("TOP");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(tutor20);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setMatricula("");
        java.lang.String str8 = aluno5.getMatricula();
        java.lang.String str9 = aluno5.noTelToString();
        aluno5.setCodigoCurso((int) (short) 0);
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setStatus(" -  - 0 -  - hi!");
        double double17 = tutor12.getProeficiencia();
        double double18 = tutor12.getDinheiro();
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) 1, "null - null - 0 - Tutor - null", " - null - null - 0 - null - 0 -  - hi!", "Tutor", "null - null - 0 - null", aluno5, tutor12);
        tutor12.setLocalAtendimento("");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " - null - 0 - null" + "'", str9.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.noTelToString();
        aluno5.setTelefone("");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 - hi!" + "'", str7.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        ajuda7.setAvaliacao(true);
        com.ufcg.daca.model.Aluno aluno26 = new com.ufcg.daca.model.Aluno();
        aluno26.setMatricula("");
        java.lang.String str29 = aluno26.getMatricula();
        java.lang.String str30 = aluno26.noTelToString();
        aluno26.setCodigoCurso((int) (short) 0);
        aluno26.setNome(" - null - 0 - null");
        java.lang.String str35 = aluno26.getEmail();
        ajuda7.setAluno(aluno26);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " - null - 0 - null" + "'", str30.equals(" - null - 0 - null"));
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        boolean boolean2 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor3 = new com.ufcg.daca.model.Tutor();
        tutor3.setHorario("");
        java.lang.String str6 = tutor3.getLocalAtendimento();
        java.lang.String str7 = tutor3.getMatricula();
        ajuda0.setTutor(tutor3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        int int8 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        com.ufcg.daca.model.Tutor tutor15 = ajuda7.getTutor();
        com.ufcg.daca.model.Aluno aluno21 = null;
        com.ufcg.daca.model.Tutor tutor22 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda23 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno21, tutor22);
        ajuda23.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor();
        tutor26.setHorario("");
        tutor26.setLocalAtendimento("hi!");
        ajuda23.setTutor(tutor26);
        int int32 = ajuda23.getId();
        com.ufcg.daca.model.Aluno aluno33 = ajuda23.getAluno();
        boolean boolean34 = ajuda23.isAvaliacao();
        boolean boolean35 = ajuda23.isAvaliacao();
        ajuda23.setAvaliacao(true);
        com.ufcg.daca.model.Aluno aluno48 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str49 = aluno48.getTelefone();
        com.ufcg.daca.model.Tutor tutor50 = new com.ufcg.daca.model.Tutor();
        tutor50.setHorario("");
        tutor50.setLocalAtendimento("hi!");
        tutor50.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda57 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno48, tutor50);
        tutor50.setProeficiencia((double) (short) -1);
        ajuda23.setTutor(tutor50);
        double double61 = tutor50.getNota();
        java.lang.String str62 = tutor50.getStatus();
        ajuda7.setTutor(tutor50);
        tutor50.setProeficiencia((double) (short) 1);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(aluno33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4.0d + "'", double61 == 4.0d);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
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
        int int23 = ajuda22.getId();
        boolean boolean24 = ajuda22.isAvaliacao();
        java.lang.String str25 = ajuda22.getLocal();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        tutor16.setDisciplina("hi!");
        java.lang.String str26 = tutor16.getNivel();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Tutor" + "'", str26.equals("Tutor"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        tutor54.setNota((double) 100L);
        com.ufcg.daca.model.Ajuda ajuda59 = new com.ufcg.daca.model.Ajuda((int) (short) 100, " - null - 0 - null", "hi!", aluno11, tutor54);
        tutor54.setNivel("");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 -  - hi!" + "'", str13.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 -  - hi!" + "'", str29.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " -  - 0 - hi!" + "'", str33.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        tutor11.setLocalAtendimento("TOP");
        tutor11.setDinheiro((double) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        aluno0.setMatricula("");
        java.lang.String str3 = aluno0.getMatricula();
        java.lang.String str4 = aluno0.noTelToString();
        aluno0.setCodigoCurso((int) (short) 0);
        aluno0.setNome(" - null - 0 - null");
        java.lang.String str9 = aluno0.getEmail();
        java.lang.String str10 = aluno0.noTelToString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + " - null - 0 - null" + "'", str4.equals(" - null - 0 - null"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - null - 0 - null - 0 - null" + "'", str10.equals(" -  - null - 0 - null - 0 - null"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        java.lang.String str12 = tutor4.getStatus();
        tutor4.setDisciplina(" - null - null - 0 - null - 0 -  - hi!");
        java.lang.String str15 = tutor4.getMatricula();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        ajuda7.setTutor(tutor10);
        int int16 = ajuda7.getId();
        ajuda7.setHorario("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setHorario("hi!");
        double double10 = tutor6.getNota();
        java.lang.String str11 = tutor6.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getStatus();
        tutor6.setMatricula(" -  - 0 -  - hi!");
        tutor6.setDisciplina(" -  - 0 - hi!");
        tutor6.setNivel("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        java.lang.String str14 = tutor6.getLocalAtendimento();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.getMatricula();
        java.lang.String str7 = aluno5.toString();
        aluno5.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str10 = aluno5.noTelToString();
        com.ufcg.daca.model.Aluno aluno16 = null;
        com.ufcg.daca.model.Tutor tutor17 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda18 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno16, tutor17);
        ajuda18.setAvaliacao(false);
        ajuda18.setAvaliacao(false);
        ajuda18.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor31 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str32 = tutor31.getMatricula();
        java.lang.String str33 = tutor31.getDiaDisponivel();
        ajuda18.setTutor(tutor31);
        com.ufcg.daca.model.Ajuda ajuda35 = new com.ufcg.daca.model.Ajuda(100, "", "null - null - 0 - Tutor - null", " -  - 0 - hi!", "null - null - 0 - null - null", aluno5, tutor31);
        tutor31.setProeficiencia((double) 1.0f);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null - null - 0 - null" + "'", str10.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        tutor11.setNota((double) (byte) -1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDisciplina("null - null - 0 - null");
        java.lang.String str6 = tutor0.getLocalAtendimento();
        tutor0.setStatus(" -  - 0 - hi!");
        java.lang.Class<?> wildcardClass9 = tutor0.getClass();
        tutor0.setDinheiro(0.0d);
        java.lang.String str12 = tutor0.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        java.lang.String str19 = ajuda7.getDia();
        java.lang.String str20 = ajuda7.getDisciplina();
        java.lang.String str21 = ajuda7.getDia();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        double double8 = tutor6.getProeficiencia();
        java.lang.String str9 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno5.setMatricula(" -  - 0 - hi!");
        java.lang.Class<?> wildcardClass8 = aluno5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        aluno5.setMatricula("");
        java.lang.String str8 = aluno5.getMatricula();
        java.lang.String str9 = aluno5.noTelToString();
        aluno5.setCodigoCurso((int) (short) 0);
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setStatus(" -  - 0 -  - hi!");
        double double17 = tutor12.getProeficiencia();
        double double18 = tutor12.getDinheiro();
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) 1, "null - null - 0 - Tutor - null", " - null - null - 0 - null - 0 -  - hi!", "Tutor", "null - null - 0 - null", aluno5, tutor12);
        java.lang.String str20 = tutor12.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " - null - 0 - null" + "'", str9.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        ajuda7.setLocal(" -  - 100 - hi!");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDisciplina("null - null - 0 - null");
        java.lang.String str6 = tutor0.getLocalAtendimento();
        tutor0.setStatus(" -  - 0 - hi!");
        java.lang.String str9 = tutor0.getStatus();
        tutor0.setMatricula("TOP");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 - hi!" + "'", str9.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.String str8 = ajuda7.getDia();
        boolean boolean9 = ajuda7.isAvaliacao();
        java.lang.String str10 = ajuda7.getDisciplina();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno();
        java.lang.String str6 = aluno5.getMatricula();
        java.lang.String str7 = aluno5.toString();
        com.ufcg.daca.model.Aluno aluno13 = new com.ufcg.daca.model.Aluno();
        java.lang.String str14 = aluno13.getMatricula();
        java.lang.String str15 = aluno13.toString();
        aluno13.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str18 = aluno13.noTelToString();
        com.ufcg.daca.model.Aluno aluno24 = null;
        com.ufcg.daca.model.Tutor tutor25 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno24, tutor25);
        ajuda26.setAvaliacao(false);
        ajuda26.setAvaliacao(false);
        ajuda26.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor39 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str40 = tutor39.getMatricula();
        java.lang.String str41 = tutor39.getDiaDisponivel();
        ajuda26.setTutor(tutor39);
        com.ufcg.daca.model.Ajuda ajuda43 = new com.ufcg.daca.model.Ajuda(100, "", "null - null - 0 - Tutor - null", " -  - 0 - hi!", "null - null - 0 - null - null", aluno13, tutor39);
        com.ufcg.daca.model.Ajuda ajuda44 = new com.ufcg.daca.model.Ajuda((int) (short) 1, "Tutor", "null - null - 0 - Tutor - null", " -  - 100 - hi!", " -  - 100 - hi!", aluno5, tutor39);
        java.lang.String str45 = aluno5.getNome();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null - null - 0 - null - null" + "'", str15.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null - null - 0 - null" + "'", str18.equals("null - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        java.lang.String str4 = aluno3.getMatricula();
        aluno3.setNome(" -  - 0 -  - hi!");
        java.lang.String str7 = aluno3.getMatricula();
        aluno3.setTelefone("");
        com.ufcg.daca.model.Aluno aluno15 = null;
        com.ufcg.daca.model.Tutor tutor16 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda17 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno15, tutor16);
        ajuda17.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor20 = new com.ufcg.daca.model.Tutor();
        tutor20.setHorario("");
        tutor20.setLocalAtendimento("hi!");
        ajuda17.setTutor(tutor20);
        int int26 = ajuda17.getId();
        ajuda17.setHorario("hi!");
        java.lang.String str29 = ajuda17.getHorario();
        com.ufcg.daca.model.Tutor tutor36 = new com.ufcg.daca.model.Tutor(" -  - 0 - hi!", "null - null - 0 - null", 0, "hi!", "Tutor", "hi!");
        ajuda17.setTutor(tutor36);
        com.ufcg.daca.model.Ajuda ajuda38 = new com.ufcg.daca.model.Ajuda((int) (short) 10, " - null - null - 0 - null - 0 -  - hi!", " -  - 0 - hi!", aluno3, tutor36);
        java.lang.String str39 = tutor36.getNivel();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Tutor" + "'", str39.equals("Tutor"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getMatricula();
        java.lang.String str10 = aluno5.getEmail();
        aluno5.setNome(" -  - null - 0 - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        tutor54.setNota((double) 100L);
        com.ufcg.daca.model.Ajuda ajuda59 = new com.ufcg.daca.model.Ajuda((int) (short) 100, " - null - 0 - null", "hi!", aluno11, tutor54);
        aluno11.setCodigoCurso((int) (short) -1);
        aluno11.setEmail(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 -  - hi!" + "'", str13.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 -  - hi!" + "'", str29.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + " -  - 0 - hi!" + "'", str33.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        java.lang.String str19 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno25 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str26 = aluno25.toString();
        aluno25.setCodigoCurso((int) (short) 100);
        java.lang.String str29 = aluno25.getNome();
        ajuda7.setAluno(aluno25);
        ajuda7.setDisciplina("null - null - 0 - null");
        ajuda7.setDisciplina(" -  - 0 - hi!");
        com.ufcg.daca.model.Aluno aluno40 = new com.ufcg.daca.model.Aluno(" -  - 100 - hi!", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", 0, "null - null - null - 0 - null - null - 0 - null - null", " - null - null - 0 - null - 0 -  - hi!");
        ajuda7.setAluno(aluno40);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        int int20 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        java.lang.String str4 = aluno3.getMatricula();
        aluno3.setNome(" -  - 0 -  - hi!");
        java.lang.String str7 = aluno3.getMatricula();
        aluno3.setTelefone("");
        com.ufcg.daca.model.Tutor tutor10 = new com.ufcg.daca.model.Tutor();
        tutor10.setHorario("");
        tutor10.setLocalAtendimento("hi!");
        tutor10.setProeficiencia((double) 1L);
        java.lang.String str17 = tutor10.getNivel();
        tutor10.setProeficiencia(10);
        tutor10.setMatricula("hi!");
        com.ufcg.daca.model.Ajuda ajuda22 = new com.ufcg.daca.model.Ajuda((int) (short) -1, "Tutor", "null - null - 0 - Tutor - null", aluno3, tutor10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Tutor" + "'", str17.equals("Tutor"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        aluno3.setTelefone("Tutor");
        java.lang.String str14 = aluno3.getEmail();
        java.lang.String str15 = aluno3.toString();
        aluno3.setCodigoCurso((int) (byte) 100);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null - null - 0 - Tutor - null" + "'", str15.equals("null - null - 0 - Tutor - null"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getMatricula();
        tutor0.setDisciplina(" - null - 0 - null");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        tutor17.setHorario("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Tutor" + "'", str20.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        java.lang.String str19 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno25 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str26 = aluno25.toString();
        aluno25.setCodigoCurso((int) (short) 100);
        java.lang.String str29 = aluno25.getNome();
        ajuda7.setAluno(aluno25);
        ajuda7.setDisciplina("null - null - 0 - null");
        boolean boolean33 = ajuda7.isAvaliacao();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null - null - 0 - null - null" + "'", str17.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDisciplina("null - null - 0 - null");
        java.lang.String str6 = tutor0.getLocalAtendimento();
        tutor0.setStatus(" -  - 0 - hi!");
        java.lang.String str9 = tutor0.getMatricula();
        java.lang.String str10 = tutor0.getNivel();
        tutor0.setNota((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Tutor" + "'", str10.equals("Tutor"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setHorario(" - null - 0 - null");
        tutor6.setProeficiencia((double) (short) 10);
        tutor6.setDisciplina("null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        com.ufcg.daca.model.Tutor tutor8 = null;
        ajuda7.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor10 = ajuda7.getTutor();
        java.lang.String str11 = ajuda7.getDisciplina();
        org.junit.Assert.assertNull(tutor10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        ajuda7.setAvaliacao(false);
        ajuda7.setDisciplina(" -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor9 = ajuda0.getTutor();
        com.ufcg.daca.model.Tutor tutor10 = ajuda0.getTutor();
        int int11 = ajuda0.getId();
        com.ufcg.daca.model.Aluno aluno12 = ajuda0.getAluno();
        org.junit.Assert.assertNull(tutor9);
        org.junit.Assert.assertNull(tutor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(aluno12);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        ajuda7.setLocal("null - null - 0 - Tutor - null");
        ajuda7.setId((int) ' ');
        ajuda7.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setHorario("Tutor");
        com.ufcg.daca.model.Aluno aluno10 = ajuda7.getAluno();
        ajuda7.setId((int) '4');
        ajuda7.setAvaliacao(false);
        org.junit.Assert.assertNull(aluno10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        double double32 = tutor25.getProeficiencia();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "hi!", (int) ' ', "null - null - 0 - Tutor - null", "");
        int int6 = aluno5.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        tutor21.setDinheiro((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        tutor26.setStatus("null - null - 0 -  -  - 0 -  - hi! - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNota((double) 1L);
        java.lang.String str6 = tutor0.getDisciplina();
        tutor0.setDiaDisponivel(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
        java.lang.String str24 = ajuda22.getDia();
        java.lang.String str25 = ajuda22.getHorario();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(aluno23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNota((double) 1L);
        tutor0.setNota((double) (short) 100);
        java.lang.String str8 = tutor0.getMatricula();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setEmail("null - null - 0 - null - null");
        java.lang.String str12 = aluno8.getEmail();
        java.lang.String str13 = aluno8.noTelToString();
        java.lang.String str14 = aluno8.noTelToString();
        aluno8.setTelefone("null - null - 0 - null");
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double24 = tutor23.getNota();
        double double25 = tutor23.getNota();
        double double26 = tutor23.getNota();
        java.lang.String str27 = tutor23.getLocalAtendimento();
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (short) 1, "hi!", "null - null - 0 - Tutor - null", aluno8, tutor23);
        java.lang.String str29 = tutor23.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null - null - 0 - null - null" + "'", str12.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str13.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str14.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setLocalAtendimento(" - null - null - 0 - null - 0 -  - hi!");
        tutor0.setDiaDisponivel(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getMatricula();
        tutor0.setNivel(" -  - 0 -  - hi!");
        double double10 = tutor0.getProeficiencia();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getNome();
        java.lang.String str10 = aluno5.getEmail();
        aluno5.setCodigoCurso((int) 'a');
        java.lang.String str13 = aluno5.getNome();
        aluno5.setCodigoCurso(10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        java.lang.String str51 = aluno16.getTelefone();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + " -  - 0 -  - hi!" + "'", str18.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + " -  - 0 - hi!" + "'", str22.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getMatricula();
        java.lang.String str10 = aluno5.noTelToString();
        java.lang.String str11 = aluno5.getNome();
        java.lang.String str12 = aluno5.getTelefone();
        java.lang.String str13 = aluno5.getMatricula();
        aluno5.setEmail(" -  - 100 - hi!");
        java.lang.String str16 = aluno5.getEmail();
        aluno5.setMatricula("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 100 - hi!" + "'", str10.equals(" -  - 100 - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + " -  - 100 - hi!" + "'", str16.equals(" -  - 100 - hi!"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        aluno10.setEmail(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        aluno10.setTelefone(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.toString();
        aluno10.setCodigoCurso((int) (short) 100);
        java.lang.String str14 = aluno10.getMatricula();
        java.lang.String str15 = aluno10.getEmail();
        com.ufcg.daca.model.Tutor tutor16 = new com.ufcg.daca.model.Tutor();
        tutor16.setNivel("null - null - 0 - null - null");
        double double19 = tutor16.getProeficiencia();
        tutor16.setNota((double) 1L);
        tutor16.setNota((double) (short) 100);
        java.lang.String str24 = tutor16.getHorario();
        java.lang.String str25 = tutor16.getMatricula();
        com.ufcg.daca.model.Ajuda ajuda26 = new com.ufcg.daca.model.Ajuda((int) (byte) 1, " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", " - null - 0 - null", "hi! -  - 0 - hi!", " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", aluno10, tutor16);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 -  - hi!" + "'", str11.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.ufcg.daca.model.Aluno aluno10 = null;
        com.ufcg.daca.model.Tutor tutor11 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda12 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno10, tutor11);
        ajuda12.setId((int) '4');
        java.lang.String str15 = ajuda12.getDia();
        com.ufcg.daca.model.Aluno aluno26 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str27 = aluno26.getTelefone();
        com.ufcg.daca.model.Tutor tutor28 = new com.ufcg.daca.model.Tutor();
        tutor28.setHorario("");
        tutor28.setLocalAtendimento("hi!");
        tutor28.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda35 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno26, tutor28);
        aluno26.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        ajuda12.setAluno(aluno26);
        int int39 = aluno26.getCodigoCurso();
        java.lang.String str40 = aluno26.toString();
        com.ufcg.daca.model.Tutor tutor47 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double48 = tutor47.getNota();
        tutor47.setHorario("hi!");
        double double51 = tutor47.getNota();
        com.ufcg.daca.model.Ajuda ajuda52 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, " -  - 52 - hi!", " - null - 0 - null", "hi! -  - 0 - hi!", " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", aluno26, tutor47);
        aluno26.setCodigoCurso((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!" + "'", str40.equals(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4.0d + "'", double48 == 4.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.0d + "'", double51 == 4.0d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        java.lang.Class<?> wildcardClass6 = ajuda0.getClass();
        java.lang.String str7 = ajuda0.getDia();
        com.ufcg.daca.model.Tutor tutor14 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        ajuda0.setTutor(tutor14);
        int int16 = ajuda0.getId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        tutor0.setMatricula("hi!");
        tutor0.setProeficiencia((int) '#');
        tutor0.setDisciplina("null - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        tutor6.setNota((double) (short) 1);
        tutor6.setProeficiencia((int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        java.lang.String str27 = ajuda26.getHorario();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null - null - 0 - null - null" + "'", str7.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Tutor" + "'", str21.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null" + "'", str27.equals("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        aluno10.setCodigoCurso((int) (short) 1);
        aluno10.setTelefone(" -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getStatus();
        tutor6.setMatricula(" -  - 0 -  - hi!");
        tutor6.setMatricula(" -  - 0 - null - null - 0 - null - null");
        tutor6.setStatus(" -  - 100 - hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        boolean boolean19 = ajuda7.isAvaliacao();
        java.lang.String str20 = ajuda7.getLocal();
        java.lang.String str21 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda();
        boolean boolean30 = ajuda29.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno36 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str37 = aluno36.getTelefone();
        java.lang.String str38 = aluno36.toString();
        ajuda29.setAluno(aluno36);
        java.lang.String str40 = aluno36.getEmail();
        com.ufcg.daca.model.Tutor tutor47 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor47.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda50 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno36, tutor47);
        com.ufcg.daca.model.Tutor tutor51 = new com.ufcg.daca.model.Tutor();
        tutor51.setNivel("null - null - 0 - null - null");
        double double54 = tutor51.getProeficiencia();
        tutor51.setDinheiro(10.0d);
        com.ufcg.daca.model.Ajuda ajuda57 = new com.ufcg.daca.model.Ajuda((int) (short) 10, "Tutor", " -  - 100 - hi!", aluno36, tutor51);
        ajuda7.setAluno(aluno36);
        java.lang.String str59 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + " -  - 0 -  - hi!" + "'", str38.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getNome();
        aluno5.setTelefone("null - null - null - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        java.lang.String str3 = tutor0.getLocalAtendimento();
        tutor0.setDisciplina("null - null - null - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setHorario(" - null - 0 - null");
        tutor6.setNota((double) (byte) 0);
        double double14 = tutor6.getNota();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno5.setNome("null - null - 0 - null");
        java.lang.Class<?> wildcardClass8 = aluno5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getMatricula();
        tutor0.setNivel(" -  - 0 -  - hi!");
        tutor0.setLocalAtendimento(" - null - 0 - null");
        java.lang.String str12 = tutor0.getStatus();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        tutor0.setProeficiencia((double) 1L);
        java.lang.String str7 = tutor0.getNivel();
        tutor0.setProeficiencia(10);
        tutor0.setMatricula("hi!");
        tutor0.setProeficiencia((int) '#');
        java.lang.String str14 = tutor0.getDiaDisponivel();
        double double15 = tutor0.getNota();
        tutor0.setLocalAtendimento(" -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setCodigoCurso((int) (short) 100);
        java.lang.String str12 = aluno8.getNome();
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setStatus("hi!");
        double double16 = tutor13.getProeficiencia();
        com.ufcg.daca.model.Ajuda ajuda17 = new com.ufcg.daca.model.Ajuda((int) (byte) 10, "null - null - 0 -  -  - 0 -  - hi! - null", " -  - 0 - hi!", aluno8, tutor13);
        tutor13.setNivel(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        java.lang.String str20 = tutor13.getHorario();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Tutor tutor9 = ajuda0.getTutor();
        com.ufcg.daca.model.Ajuda ajuda10 = new com.ufcg.daca.model.Ajuda();
        com.ufcg.daca.model.Aluno aluno21 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str22 = aluno21.getTelefone();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setLocalAtendimento("hi!");
        tutor23.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno21, tutor23);
        tutor23.setProeficiencia((double) (short) -1);
        double double33 = tutor23.getProeficiencia();
        ajuda10.setTutor(tutor23);
        ajuda0.setTutor(tutor23);
        org.junit.Assert.assertNull(tutor9);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        tutor12.setHorario("null - null - 0 - null");
        tutor12.setHorario(" -  - 0 - hi!");
        java.lang.String str24 = tutor12.getHorario();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + " -  - 0 - hi!" + "'", str24.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" -  - 100 - hi!", "", (int) (short) -1, "null - null - 0 - Tutor - null", " - null - 0 - null", " -  - 0 -  - hi!");
        tutor6.setStatus("null - null - 0 - Tutor - null");
        tutor6.setDinheiro((double) (byte) 0);
        tutor6.setDiaDisponivel("Tutor");
        double double13 = tutor6.getNota();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("hi!", " -  - 0 -  - hi!", 0, " -  - 0 -  - hi!", "hi!", " -  - 0 -  - hi!");
        java.lang.String str7 = tutor6.getDisciplina();
        java.lang.String str8 = tutor6.getHorario();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " -  - 0 -  - hi!" + "'", str8.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        java.lang.String str3 = aluno0.toString();
        java.lang.String str4 = aluno0.getTelefone();
        java.lang.String str5 = aluno0.getTelefone();
        java.lang.String str6 = aluno0.getTelefone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null - null - 0 - null - null" + "'", str3.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        int int12 = aluno7.getCodigoCurso();
        java.lang.String str13 = aluno7.getNome();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.String str5 = tutor0.getLocalAtendimento();
        tutor0.setNota((double) (byte) 10);
        double double8 = tutor0.getNota();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        tutor6.setStatus("null - null - 0 - Tutor - null");
        tutor6.setStatus("Tutor");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getLocalAtendimento();
        java.lang.String str8 = tutor6.getDisciplina();
        java.lang.String str9 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
        java.lang.String str20 = ajuda7.getHorario();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.toString();
        java.lang.String str2 = aluno0.getEmail();
        aluno0.setTelefone("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null - null" + "'", str1.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        int int7 = aluno5.getCodigoCurso();
        aluno5.setTelefone(" - null - null - 0 - null - 0 -  - hi!");
        java.lang.String str10 = aluno5.getNome();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        com.ufcg.daca.model.Aluno aluno16 = ajuda7.getAluno();
        org.junit.Assert.assertNull(aluno16);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - null - 0 - null - 0 - null", (int) 'a', " -  - 100 - hi!", "null - null - null - 0 - null - null - 0 - null - null", " -  - 52 - hi!");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" -  - 100 - hi!", "", (int) (short) -1, "null - null - 0 - Tutor - null", " - null - 0 - null", " -  - 0 -  - hi!");
        tutor6.setStatus("null - null - 0 - Tutor - null");
        java.lang.String str9 = tutor6.getDisciplina();
        tutor6.setDiaDisponivel("");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setId((int) '4');
        java.lang.String str10 = ajuda7.getDia();
        com.ufcg.daca.model.Aluno aluno21 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str22 = aluno21.getTelefone();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setLocalAtendimento("hi!");
        tutor23.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda30 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno21, tutor23);
        aluno21.setMatricula(" - null - null - 0 - null - 0 -  - hi!");
        ajuda7.setAluno(aluno21);
        int int34 = aluno21.getCodigoCurso();
        aluno21.setMatricula("null - null - 0 - null - null");
        java.lang.String str37 = aluno21.noTelToString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null - null - 0 - null - null -  - 0 - hi!" + "'", str37.equals("null - null - 0 - null - null -  - 0 - hi!"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        boolean boolean33 = ajuda7.isAvaliacao();
        ajuda7.setId((int) '4');
        java.lang.String str36 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(aluno21);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.0d + "'", double31 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getNivel();
        java.lang.String str9 = tutor6.getDisciplina();
        java.lang.String str10 = tutor6.getNivel();
        tutor6.setHorario(" -  - 0 - hi!");
        java.lang.String str13 = tutor6.getHorario();
        java.lang.String str14 = tutor6.getDiaDisponivel();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Tutor" + "'", str10.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 0 - hi!" + "'", str13.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        double double45 = tutor34.getNota();
        java.lang.String str46 = tutor34.getStatus();
        double double47 = tutor34.getDinheiro();
        double double48 = tutor34.getProeficiencia();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.0d + "'", double45 == 4.0d);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        com.ufcg.daca.model.Aluno aluno25 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str26 = aluno25.toString();
        aluno25.setCodigoCurso((int) (short) 100);
        java.lang.String str29 = aluno25.getNome();
        ajuda7.setAluno(aluno25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.String str8 = ajuda7.getDia();
        boolean boolean9 = ajuda7.isAvaliacao();
        ajuda7.setAvaliacao(true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        com.ufcg.daca.model.Aluno aluno29 = ajuda28.getAluno();
        int int30 = aluno29.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertNotNull(aluno29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId((int) (short) -1);
        int int16 = ajuda7.getId();
        ajuda7.setLocal("");
        int int19 = ajuda7.getId();
        ajuda7.setLocal("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        double double10 = tutor6.getNota();
        java.lang.String str11 = tutor6.getMatricula();
        tutor6.setHorario(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        java.lang.String str12 = tutor6.getNivel();
        java.lang.String str13 = tutor6.getDisciplina();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "TOP" + "'", str12.equals("TOP"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        double double7 = tutor0.getProeficiencia();
        java.lang.String str8 = tutor0.getHorario();
        tutor0.setLocalAtendimento(" -  - null - 0 - null - 0 - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str9 = aluno8.toString();
        aluno8.setCodigoCurso((int) (short) 100);
        java.lang.String str12 = aluno8.getNome();
        java.lang.String str13 = aluno8.getEmail();
        aluno8.setMatricula("TOP");
        java.lang.String str16 = aluno8.getTelefone();
        aluno8.setCodigoCurso((int) ' ');
        com.ufcg.daca.model.Aluno aluno27 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str28 = aluno27.toString();
        aluno27.setCodigoCurso((int) (short) 100);
        java.lang.String str31 = aluno27.getNome();
        com.ufcg.daca.model.Tutor tutor32 = new com.ufcg.daca.model.Tutor();
        tutor32.setStatus("hi!");
        double double35 = tutor32.getProeficiencia();
        com.ufcg.daca.model.Ajuda ajuda36 = new com.ufcg.daca.model.Ajuda((int) (byte) 10, "null - null - 0 -  -  - 0 -  - hi! - null", " -  - 0 - hi!", aluno27, tutor32);
        tutor32.setNivel(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda39 = new com.ufcg.daca.model.Ajuda((int) (short) 1, " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", " -  - 0 - null - null - 0 - null - null", aluno8, tutor32);
        java.lang.String str40 = tutor32.getMatricula();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + " -  - 0 -  - hi!" + "'", str28.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno10.setMatricula(" -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setNivel("null - null - 0 - null - null");
        double double16 = tutor13.getProeficiencia();
        tutor13.setMatricula("Tutor");
        tutor13.setNivel("hi!");
        com.ufcg.daca.model.Ajuda ajuda21 = new com.ufcg.daca.model.Ajuda((-1), "", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", " - null - null - 0 - null - 0 -  - hi!", aluno10, tutor13);
        ajuda21.setDisciplina("null - null - 0 -  -  - 0 -  - hi! - null");
        ajuda21.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        double double10 = tutor6.getProeficiencia();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setDinheiro((double) 100.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDiaDisponivel("Tutor");
        java.lang.String str7 = tutor0.getMatricula();
        java.lang.String str8 = tutor0.getDiaDisponivel();
        double double9 = tutor0.getNota();
        tutor0.setHorario(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Tutor" + "'", str8.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
        com.ufcg.daca.model.Tutor tutor38 = new com.ufcg.daca.model.Tutor();
        tutor38.setNivel("null - null - 0 - null - null");
        double double41 = tutor38.getProeficiencia();
        tutor38.setDinheiro(10.0d);
        java.lang.String str44 = tutor38.getMatricula();
        tutor38.setDiaDisponivel("null - null - 0 - null - null -  - 0 - hi!");
        com.ufcg.daca.model.Ajuda ajuda47 = new com.ufcg.daca.model.Ajuda((int) ' ', "null - null - 0 - null", " -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!", " -  - 0 -  - hi!", " - null - 0 - null", aluno37, tutor38);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(aluno22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + " -  - 0 -  - hi!" + "'", str31.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertNotNull(aluno37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        java.lang.Class<?> wildcardClass6 = ajuda0.getClass();
        ajuda0.setDisciplina("");
        java.lang.String str9 = ajuda0.getHorario();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        tutor0.setLocalAtendimento("Tutor");
        tutor0.setDiaDisponivel(" -  - 52 - hi!");
        double double11 = tutor0.getNota();
        tutor0.setProeficiencia(52);
        tutor0.setProeficiencia((double) '4');
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setNota((double) (short) 100);
        java.lang.String str12 = tutor6.getNivel();
        tutor6.setProeficiencia(0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "TOP" + "'", str12.equals("TOP"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.toString();
        java.lang.Class<?> wildcardClass2 = aluno0.getClass();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null - null" + "'", str1.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        java.lang.String str10 = tutor6.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setCodigoCurso((int) '4');
        java.lang.String str11 = aluno5.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 52 -  - hi!" + "'", str11.equals(" -  - 52 -  - hi!"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        ajuda7.setLocal("null - null - 0 - Tutor - null");
        ajuda7.setId((int) ' ');
        ajuda7.setDisciplina(" -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        ajuda11.setDisciplina("Tutor");
        java.lang.String str14 = ajuda11.getLocal();
        ajuda11.setAvaliacao(true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        java.lang.Class<?> wildcardClass8 = tutor6.getClass();
        java.lang.String str9 = tutor6.getLocalAtendimento();
        java.lang.String str10 = tutor6.getStatus();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.ufcg.daca.model.Aluno aluno8 = null;
        com.ufcg.daca.model.Tutor tutor9 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda10 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno8, tutor9);
        ajuda10.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setHorario("");
        tutor13.setLocalAtendimento("hi!");
        ajuda10.setTutor(tutor13);
        com.ufcg.daca.model.Aluno aluno19 = new com.ufcg.daca.model.Aluno();
        java.lang.String str20 = aluno19.toString();
        ajuda10.setAluno(aluno19);
        java.lang.String str22 = aluno19.getNome();
        com.ufcg.daca.model.Tutor tutor23 = new com.ufcg.daca.model.Tutor();
        tutor23.setHorario("");
        tutor23.setLocalAtendimento("hi!");
        tutor23.setProeficiencia((double) 1L);
        tutor23.setDinheiro((double) 1);
        com.ufcg.daca.model.Ajuda ajuda32 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null", " -  - 0 - null - null - 0 - null - null", aluno19, tutor23);
        ajuda32.setAvaliacao(true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null - null - 0 - null - null" + "'", str20.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        aluno10.setNome("");
        aluno10.setTelefone("");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        java.lang.String str1 = ajuda0.getHorario();
        com.ufcg.daca.model.Tutor tutor2 = ajuda0.getTutor();
        java.lang.String str3 = ajuda0.getHorario();
        com.ufcg.daca.model.Tutor tutor4 = ajuda0.getTutor();
        ajuda0.setHorario(" -  - 0 - hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(tutor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(tutor4);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        ajuda0.setHorario(" -  - 0 -  - hi!");
        int int10 = ajuda0.getId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        aluno0.setTelefone(" -  - 0 -  - hi!");
        java.lang.String str5 = aluno0.toString();
        java.lang.String str6 = aluno0.getTelefone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null - null - 0 -  -  - 0 -  - hi! - null" + "'", str5.equals("null - null - 0 -  -  - 0 -  - hi! - null"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno5.setMatricula(" -  - 0 - hi!");
        aluno5.setMatricula(" -  - null - 0 - null - 0 - null");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setAvaliacao(false);
        java.lang.String str16 = ajuda7.getDia();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "hi!", (int) ' ', "null - null - 0 - Tutor - null", "");
        aluno5.setEmail(" - null - 0 - null");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setCodigoCurso((int) '4');
        java.lang.String str11 = aluno5.noTelToString();
        aluno5.setNome(" -  - 100 - hi!");
        aluno5.setMatricula(" -  - 100 - hi!");
        aluno5.setCodigoCurso((int) (byte) 0);
        aluno5.setNome(" -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 52 - hi!" + "'", str11.equals(" -  - 52 - hi!"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        java.lang.String str2 = ajuda0.getDia();
        boolean boolean3 = ajuda0.isAvaliacao();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", (int) (short) 10, " -  - 0 -  - hi!", "hi!");
        aluno10.setMatricula(" -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor13 = new com.ufcg.daca.model.Tutor();
        tutor13.setNivel("null - null - 0 - null - null");
        double double16 = tutor13.getProeficiencia();
        tutor13.setMatricula("Tutor");
        tutor13.setNivel("hi!");
        com.ufcg.daca.model.Ajuda ajuda21 = new com.ufcg.daca.model.Ajuda((-1), "", "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "null - null - 0 - null", " - null - null - 0 - null - 0 -  - hi!", aluno10, tutor13);
        java.lang.String str22 = tutor13.getDisciplina();
        tutor13.setProeficiencia((int) (short) 1);
        double double25 = tutor13.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        ajuda0.setHorario(" -  - 0 -  - hi!");
        java.lang.String str10 = ajuda0.getLocal();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getNome();
        aluno5.setEmail("null - null - 0 - Tutor - null");
        aluno5.setNome(" -  - null - 0 - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        ajuda22.setAluno(aluno36);
        java.lang.String str60 = ajuda22.getHorario();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + " -  - 0 -  - hi!" + "'", str38.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + " -  - 0 - hi!" + "'", str42.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setEmail("null - null - 0 - null - null");
        java.lang.String str9 = aluno5.getEmail();
        java.lang.String str10 = aluno5.noTelToString();
        java.lang.String str11 = aluno5.noTelToString();
        aluno5.setEmail("null - null - 0 -  -  - 0 -  - hi! - null");
        aluno5.setNome(" -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null - null - 0 - null - null" + "'", str9.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str10.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str11.equals(" -  - 0 - null - null - 0 - null - null"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        com.ufcg.daca.model.Aluno aluno4 = ajuda0.getAluno();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(aluno4);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.Class<?> wildcardClass5 = tutor0.getClass();
        java.lang.String str6 = tutor0.getDiaDisponivel();
        tutor0.setNivel(" - null - 0 - null");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        java.lang.String str7 = ajuda0.getDisciplina();
        com.ufcg.daca.model.Aluno aluno8 = ajuda0.getAluno();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(aluno8);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        tutor0.setDiaDisponivel("null - null - 0 - null - null");
        java.lang.String str5 = tutor0.getDisciplina();
        java.lang.String str6 = tutor0.getNivel();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Tutor" + "'", str6.equals("Tutor"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        int int11 = ajuda0.getId();
        ajuda0.setDia(" -  - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        tutor26.setDisciplina(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        tutor26.setProeficiencia((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        aluno3.setTelefone("Tutor");
        java.lang.String str14 = aluno3.getEmail();
        aluno3.setNome("null - null - 0 - null - null");
        java.lang.String str17 = aluno3.getMatricula();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
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
        ajuda7.setLocal(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        tutor26.setStatus(" -  - 52 - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        java.lang.String str26 = tutor20.getMatricula();
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        java.lang.String str12 = tutor4.getDiaDisponivel();
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setMatricula("Tutor");
        tutor0.setMatricula("null - null - 0 - null");
        tutor0.setDinheiro((double) 100);
        tutor0.setHorario(" -  - 52 - hi!");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        aluno0.setCodigoCurso((int) (short) 0);
        java.lang.String str5 = aluno0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null - null - 0 - null - null" + "'", str5.equals("null - null - 0 - null - null"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
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
        com.ufcg.daca.model.Tutor tutor19 = ajuda7.getTutor();
        java.lang.String str20 = ajuda7.getLocal();
        java.lang.String str21 = ajuda7.getHorario();
        java.lang.String str22 = ajuda7.getLocal();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tutor19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        double double10 = tutor6.getNota();
        tutor6.setStatus(" -  - 100 - hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        java.lang.String str29 = ajuda28.getDia();
        ajuda28.setHorario("null - null - 0 - null - null");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " -  - 0 - hi!" + "'", str29.equals(" -  - 0 - hi!"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.getTelefone();
        com.ufcg.daca.model.Tutor tutor12 = new com.ufcg.daca.model.Tutor();
        tutor12.setHorario("");
        tutor12.setLocalAtendimento("hi!");
        tutor12.setProeficiencia((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda19 = new com.ufcg.daca.model.Ajuda((int) (short) -1, " -  - 0 -  - hi!", "Tutor", " -  - 0 -  - hi!", "", aluno10, tutor12);
        java.lang.String str20 = tutor12.getNivel();
        java.lang.String str21 = tutor12.getNivel();
        tutor12.setStatus(" -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Tutor" + "'", str20.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Tutor" + "'", str21.equals("Tutor"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        java.lang.String str8 = aluno5.getMatricula();
        aluno5.setEmail("hi!");
        java.lang.String str11 = aluno5.getTelefone();
        java.lang.String str12 = aluno5.getTelefone();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        java.lang.String str12 = aluno3.getMatricula();
        aluno3.setNome("hi! -  - 0 - hi!");
        int int15 = aluno3.getCodigoCurso();
        aluno3.setTelefone(" -  - null - 0 - null - 0 - null");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        double double7 = tutor0.getProeficiencia();
        tutor0.setHorario("null - null - 0 - Tutor - null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        ajuda7.setId(100);
        int int16 = ajuda7.getId();
        ajuda7.setDia("Tutor");
        ajuda7.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        ajuda0.setHorario("null - null - 0 - null - null -  - 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
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
        aluno8.setMatricula("null - null - null - 0 - null - null - 0 - null - null");
        aluno8.setMatricula("null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null");
        java.lang.String str29 = aluno8.getEmail();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + " -  - 0 - hi!" + "'", str14.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        aluno7.setMatricula("null - null - 0 - Tutor - null");
        java.lang.String str14 = aluno7.getNome();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setStatus("hi!");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDinheiro(0.0d);
        double double6 = tutor0.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setDinheiro(10.0d);
        java.lang.String str6 = tutor0.getMatricula();
        tutor0.setDisciplina(" -  - 0 -  - hi!");
        java.lang.String str9 = tutor0.getNivel();
        java.lang.String str10 = tutor0.getMatricula();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        ajuda0.setAvaliacao(true);
        ajuda0.setLocal("Tutor");
        com.ufcg.daca.model.Aluno aluno7 = ajuda0.getAluno();
        boolean boolean8 = ajuda0.isAvaliacao();
        org.junit.Assert.assertNull(aluno7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" -  - 100 - hi!", "", (int) (short) -1, "null - null - 0 - Tutor - null", " - null - 0 - null", " -  - 0 -  - hi!");
        tutor6.setStatus("null - null - 0 - Tutor - null");
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setNivel(" -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        double double5 = tutor0.getProeficiencia();
        double double6 = tutor0.getDinheiro();
        double double7 = tutor0.getProeficiencia();
        tutor0.setNivel(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        java.lang.String str10 = tutor0.getStatus();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
        aluno8.setNome(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        java.lang.String str1 = tutor0.getStatus();
        java.lang.String str2 = tutor0.getHorario();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
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
        ajuda28.setHorario("");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.getTelefone();
        java.lang.String str7 = aluno5.toString();
        aluno5.setMatricula(" - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " -  - 0 -  - hi!" + "'", str7.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        com.ufcg.daca.model.Tutor tutor11 = ajuda0.getTutor();
        ajuda0.setHorario(" - null - null - 0 - null - 0 -  - hi!");
        ajuda0.setHorario(" -  - null - 0 - null - 0 - null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(tutor11);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setProeficiencia((double) 0.0f);
        tutor0.setDisciplina("null - null - 0 - null - null");
        tutor0.setLocalAtendimento("Tutor");
        tutor0.setDiaDisponivel(" -  - 52 - hi!");
        double double11 = tutor0.getNota();
        java.lang.String str12 = tutor0.getStatus();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        double double3 = tutor0.getProeficiencia();
        tutor0.setNota((double) 1L);
        tutor0.setNota((double) (short) 100);
        java.lang.String str8 = tutor0.getHorario();
        java.lang.String str9 = tutor0.getMatricula();
        java.lang.String str10 = tutor0.getNivel();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "TOP" + "'", str10.equals("TOP"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        java.lang.String str12 = tutor4.getStatus();
        tutor4.setDisciplina(" - null - null - 0 - null - 0 -  - hi!");
        tutor4.setStatus("null - null - null - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("TOP", " -  - null - 0 - null - 0 - null", (int) (byte) -1, " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        ajuda7.setDisciplina("null - null - 0 - null");
        java.lang.String str20 = ajuda7.getDia();
        int int21 = ajuda7.getId();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aluno17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.ufcg.daca.model.Aluno aluno8 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno8.setMatricula("hi!");
        aluno8.setNome("");
        aluno8.setTelefone("null - null - 0 - null - null");
        java.lang.String str15 = aluno8.getNome();
        com.ufcg.daca.model.Aluno aluno21 = null;
        com.ufcg.daca.model.Tutor tutor22 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda23 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno21, tutor22);
        ajuda23.setAvaliacao(false);
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor();
        tutor26.setHorario("");
        tutor26.setLocalAtendimento("hi!");
        ajuda23.setTutor(tutor26);
        tutor26.setLocalAtendimento("hi!");
        tutor26.setMatricula("null - null - 0 - null - null");
        double double36 = tutor26.getProeficiencia();
        com.ufcg.daca.model.Ajuda ajuda37 = new com.ufcg.daca.model.Ajuda(52, "null - null - 0 - null - null -  - 0 - hi!", " -  - 52 -  - hi!", aluno8, tutor26);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setLocalAtendimento("hi!");
        java.lang.String str5 = tutor0.getLocalAtendimento();
        java.lang.String str6 = tutor0.getNivel();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Tutor" + "'", str6.equals("Tutor"));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        java.lang.String str18 = aluno3.getNome();
        aluno3.setNome(" - null - null - 0 - null - 0 -  - hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 - hi!" + "'", str17.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno(" - null - 0 - null", "null - null - 0 - null - null", (int) (byte) 1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", "");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.getMatricula();
        java.lang.String str2 = aluno0.toString();
        java.lang.String str3 = aluno0.toString();
        java.lang.String str4 = aluno0.getTelefone();
        java.lang.String str5 = aluno0.getTelefone();
        aluno0.setEmail("null - null - null - 0 - null - null - 0 - null - null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null - null - 0 - null - null" + "'", str2.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null - null - 0 - null - null" + "'", str3.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double7 = tutor6.getNota();
        tutor6.setNivel(" -  - 0 -  - hi!");
        tutor6.setHorario(" - null - 0 - null");
        java.lang.String str12 = tutor6.getLocalAtendimento();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        aluno10.setMatricula("hi!");
        aluno10.setNome("");
        com.ufcg.daca.model.Tutor tutor21 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double22 = tutor21.getNota();
        tutor21.setHorario("hi!");
        double double25 = tutor21.getNota();
        tutor21.setNota((double) 1L);
        com.ufcg.daca.model.Ajuda ajuda28 = new com.ufcg.daca.model.Ajuda((int) (byte) -1, "null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null", " -  - 52 - hi!", " -  - 0 - hi!", "hi!", aluno10, tutor21);
        ajuda28.setId((int) ' ');
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("null - null - 0 - null", "", 1, "null - null - 0 - null - null", " -  - 0 - hi!", "null - null - 0 - null - null");
        double double7 = tutor6.getNota();
        double double8 = tutor6.getProeficiencia();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setHorario("");
        tutor0.setStatus(" -  - 0 -  - hi!");
        double double5 = tutor0.getProeficiencia();
        java.lang.String str6 = tutor0.getHorario();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getNivel();
        tutor6.setDisciplina("");
        tutor6.setMatricula(" -  - 0 - null - null - 0 - null - null");
        tutor6.setDinheiro((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        java.lang.String str6 = ajuda0.getDia();
        ajuda0.setAvaliacao(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.toString();
        aluno10.setCodigoCurso((int) (short) 100);
        aluno10.setMatricula("null - null - 0 - null - null");
        java.lang.String str16 = aluno10.getMatricula();
        com.ufcg.daca.model.Tutor tutor17 = new com.ufcg.daca.model.Tutor();
        tutor17.setHorario("");
        tutor17.setLocalAtendimento("hi!");
        tutor17.setProeficiencia((double) 1L);
        java.lang.String str24 = tutor17.getNivel();
        tutor17.setDiaDisponivel(" - null - null - 0 - null - 0 -  - hi!");
        com.ufcg.daca.model.Ajuda ajuda27 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "", "null - null - null - 0 - null - null - 0 - null - null", "null - null - 0 - Tutor - null", " -  - 52 -  - hi!", aluno10, tutor17);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 -  - hi!" + "'", str11.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null - null - 0 - null - null" + "'", str16.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Tutor" + "'", str24.equals("Tutor"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.ufcg.daca.model.Aluno aluno5 = null;
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor();
        com.ufcg.daca.model.Ajuda ajuda7 = new com.ufcg.daca.model.Ajuda((int) '#', "hi!", "hi!", "", "", aluno5, tutor6);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(false);
        ajuda7.setAvaliacao(true);
        java.lang.String str14 = ajuda7.getLocal();
        com.ufcg.daca.model.Tutor tutor15 = ajuda7.getTutor();
        ajuda7.setId((int) (short) -1);
        java.lang.String str18 = ajuda7.getHorario();
        java.lang.String str19 = ajuda7.getHorario();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor(" - null - null - 0 - null - 0 -  - hi!", " -  - 0 - null - null - 0 - null - null", (int) (short) 10, "hi! -  - 0 - hi!", "", "null - null - null - 0 - null - null - 0 - null - null");
        java.lang.String str7 = tutor6.getNivel();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Tutor" + "'", str7.equals("Tutor"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        ajuda0.setHorario("");
        com.ufcg.daca.model.Tutor tutor3 = ajuda0.getTutor();
        java.lang.String str4 = ajuda0.getDia();
        java.lang.String str5 = ajuda0.getHorario();
        java.lang.String str6 = ajuda0.getDia();
        org.junit.Assert.assertNull(tutor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setCodigoCurso((int) (short) 100);
        java.lang.String str9 = aluno5.getNome();
        java.lang.String str10 = aluno5.getEmail();
        aluno5.setMatricula("TOP");
        java.lang.String str13 = aluno5.getTelefone();
        aluno5.setCodigoCurso((int) ' ');
        java.lang.String str16 = aluno5.getEmail();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.ufcg.daca.model.Aluno aluno3 = new com.ufcg.daca.model.Aluno();
        com.ufcg.daca.model.Tutor tutor4 = new com.ufcg.daca.model.Tutor();
        tutor4.setHorario("");
        tutor4.setProeficiencia((double) 0.0f);
        tutor4.setDisciplina("null - null - 0 - null - null");
        com.ufcg.daca.model.Ajuda ajuda11 = new com.ufcg.daca.model.Ajuda((int) (byte) 100, "Tutor", " -  - 0 -  - hi!", aluno3, tutor4);
        aluno3.setTelefone("Tutor");
        java.lang.String str14 = aluno3.getEmail();
        java.lang.String str15 = aluno3.toString();
        java.lang.String str16 = aluno3.getNome();
        java.lang.String str17 = aluno3.getTelefone();
        aluno3.setTelefone(" -  - 0 - null - null - 0 - null - null - null - null - null - 0 - null - null - 0 - null - null - 0 - null - null - 0 - null - null - null - null - 0 - null - null");
        aluno3.setNome(" -  - 52 - hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null - null - 0 - Tutor - null" + "'", str15.equals("null - null - 0 - Tutor - null"));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Tutor" + "'", str17.equals("Tutor"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.ufcg.daca.model.Tutor tutor0 = new com.ufcg.daca.model.Tutor();
        tutor0.setNivel("null - null - 0 - null - null");
        tutor0.setLocalAtendimento("Tutor");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setEmail("null - null - 0 - null - null");
        java.lang.String str9 = aluno5.getEmail();
        java.lang.String str10 = aluno5.noTelToString();
        java.lang.String str11 = aluno5.getNome();
        java.lang.String str12 = aluno5.getMatricula();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null - null - 0 - null - null" + "'", str9.equals("null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 - null - null - 0 - null - null" + "'", str10.equals(" -  - 0 - null - null - 0 - null - null"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno7 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str8 = aluno7.getTelefone();
        java.lang.String str9 = aluno7.toString();
        ajuda0.setAluno(aluno7);
        java.lang.String str11 = aluno7.getEmail();
        java.lang.String str12 = aluno7.toString();
        aluno7.setEmail(" -  - 100 - hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + " -  - 0 -  - hi!" + "'", str12.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        java.lang.Class<?> wildcardClass49 = aluno8.getClass();
        java.lang.String str50 = aluno8.getEmail();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " -  - 0 -  - hi!" + "'", str10.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + " -  - 0 -  - hi!" + "'", str26.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + " -  - 0 - hi!" + "'", str30.equals(" -  - 0 - hi!"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno(" -  - 0 - null - null - 0 - null - null", "null - null - 0 - null - null", (int) ' ', " - null - null - 0 - null - 0 -  - hi! -  - 0 -  - hi!", "hi! -  - 0 - hi!");
        aluno5.setEmail("null - null - 0 -  -  - 0 -  - hi! - null");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.ufcg.daca.model.Ajuda ajuda8 = new com.ufcg.daca.model.Ajuda();
        boolean boolean9 = ajuda8.isAvaliacao();
        com.ufcg.daca.model.Aluno aluno15 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str16 = aluno15.getTelefone();
        java.lang.String str17 = aluno15.toString();
        ajuda8.setAluno(aluno15);
        java.lang.String str19 = aluno15.getEmail();
        com.ufcg.daca.model.Tutor tutor26 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        tutor26.setMatricula("");
        com.ufcg.daca.model.Ajuda ajuda29 = new com.ufcg.daca.model.Ajuda((int) (byte) 0, "Tutor", "Tutor", " -  - 0 - hi!", "Tutor", aluno15, tutor26);
        com.ufcg.daca.model.Tutor tutor30 = new com.ufcg.daca.model.Tutor();
        tutor30.setNivel("null - null - 0 - null - null");
        double double33 = tutor30.getProeficiencia();
        tutor30.setDinheiro(10.0d);
        com.ufcg.daca.model.Ajuda ajuda36 = new com.ufcg.daca.model.Ajuda((int) (short) 10, "Tutor", " -  - 100 - hi!", aluno15, tutor30);
        java.lang.String str37 = aluno15.getMatricula();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + " -  - 0 -  - hi!" + "'", str17.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        com.ufcg.daca.model.Tutor tutor8 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        double double9 = tutor8.getNota();
        ajuda0.setTutor(tutor8);
        tutor8.setStatus("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        ajuda0.setDia("hi!");
        ajuda0.setDisciplina(" -  - 0 -  - hi!");
        com.ufcg.daca.model.Aluno aluno8 = ajuda0.getAluno();
        java.lang.String str9 = ajuda0.getDisciplina();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(aluno8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        tutor20.setProeficiencia((double) 10.0f);
        tutor20.setNivel(" -  - null - 0 - null - 0 - null");
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        com.ufcg.daca.model.Aluno aluno35 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str36 = aluno35.toString();
        aluno35.setCodigoCurso((int) (short) 100);
        java.lang.String str39 = aluno35.getNome();
        java.lang.String str40 = aluno35.getEmail();
        ajuda29.setAluno(aluno35);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " - null - 0 - null" + "'", str10.equals(" - null - 0 - null"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + " -  - 0 -  - hi!" + "'", str36.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.ufcg.daca.model.Aluno aluno5 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str6 = aluno5.toString();
        aluno5.setEmail("null - null - 0 - null - null");
        aluno5.setMatricula(" -  - 100 - hi!");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " -  - 0 -  - hi!" + "'", str6.equals(" -  - 0 -  - hi!"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.ufcg.daca.model.Aluno aluno0 = new com.ufcg.daca.model.Aluno();
        java.lang.String str1 = aluno0.noTelToString();
        java.lang.String str2 = aluno0.getEmail();
        aluno0.setMatricula("null - null - 0 -  -  - 0 -  - hi! - null");
        int int5 = aluno0.getCodigoCurso();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - null - 0 - null" + "'", str1.equals("null - null - 0 - null"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
        ajuda7.setLocal("Tutor");
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(tutor15);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        com.ufcg.daca.model.Tutor tutor29 = new com.ufcg.daca.model.Tutor(" -  - 100 - hi!", "", (int) (short) -1, "null - null - 0 - Tutor - null", " - null - 0 - null", " -  - 0 -  - hi!");
        tutor29.setStatus("null - null - 0 - Tutor - null");
        tutor29.setDinheiro((double) (byte) 0);
        ajuda7.setTutor(tutor29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.ufcg.daca.model.Ajuda ajuda0 = new com.ufcg.daca.model.Ajuda();
        boolean boolean1 = ajuda0.isAvaliacao();
        ajuda0.setAvaliacao(true);
        boolean boolean4 = ajuda0.isAvaliacao();
        ajuda0.setHorario(" -  - 0 - hi!");
        com.ufcg.daca.model.Tutor tutor7 = ajuda0.getTutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(tutor7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        ajuda36.setAvaliacao(true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " -  - 0 -  - hi!" + "'", str9.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " -  - 100 - hi!" + "'", str13.equals(" -  - 100 - hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.ufcg.daca.model.Tutor tutor6 = new com.ufcg.daca.model.Tutor("", "", 0, "hi!", "", "");
        java.lang.String str7 = tutor6.getMatricula();
        java.lang.String str8 = tutor6.getDiaDisponivel();
        java.lang.String str9 = tutor6.getNivel();
        tutor6.setStatus("");
        java.lang.String str12 = tutor6.getDisciplina();
        tutor6.setStatus("TOP");
        java.lang.String str15 = tutor6.getStatus();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Tutor" + "'", str9.equals("Tutor"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "TOP" + "'", str15.equals("TOP"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.ufcg.daca.model.Aluno aluno10 = new com.ufcg.daca.model.Aluno("", "", (int) (short) 0, "", "hi!");
        java.lang.String str11 = aluno10.toString();
        aluno10.setEmail("null - null - 0 - null - null");
        com.ufcg.daca.model.Tutor tutor14 = new com.ufcg.daca.model.Tutor();
        tutor14.setHorario("");
        tutor14.setLocalAtendimento("hi!");
        tutor14.setProeficiencia((double) 1L);
        java.lang.String str21 = tutor14.getMatricula();
        java.lang.String str22 = tutor14.getNivel();
        com.ufcg.daca.model.Ajuda ajuda23 = new com.ufcg.daca.model.Ajuda((int) 'a', " -  - 0 - hi! - null -  -  - 0 -  - hi! - 0 -  - null - 0 - null - null - 10 - hi!", " -  - null - 0 - null - 0 - null", " - null - 0 - null", " - null - 0 - null", aluno10, tutor14);
        aluno10.setCodigoCurso(32);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " -  - 0 -  - hi!" + "'", str11.equals(" -  - 0 -  - hi!"));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Tutor" + "'", str22.equals("Tutor"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        boolean boolean33 = ajuda7.isAvaliacao();
        ajuda7.setId((int) '4');
        ajuda7.setId(0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(aluno21);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.0d + "'", double31 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }
}

