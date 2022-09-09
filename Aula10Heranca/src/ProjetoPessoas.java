public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

      p1.setNome("Artur");
      p2.setNome("César");
      p3.setNome("Gonçalves");
      p4.setNome("Moreira");

      p4.setSexo("M");
      p3.setSexo("F");
      p2.setIdade(18);

      p2.setCurso("Informática");
      p4.setSalario(2500.57F);
      p1.setIdade(19);
      p1.fazerAniver();

     // p1.receberAumento(550.20F);
     // p2.mudarTrabalho();
     // p2.cancelarMatri();



        System.out.println(p1.detalhes());
        System.out.println(p2.detalhes());
        System.out.println(p3.detalhes());
        System.out.println(p4.detalhes());
    }
}
