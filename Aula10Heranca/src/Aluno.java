public class Aluno extends Pessoa {

    private String curso;
    private int matricula;

    public void cacenlarMatr(){
        System.out.println("Matricula será cancelada");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
