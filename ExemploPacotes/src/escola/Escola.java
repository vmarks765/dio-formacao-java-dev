package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Vinícius Júnior");
        felipe.setIdade(8);
        felipe.setSexo("Masculino");

        System.out.println("O aluno " + felipe.getNome() + " é do sexo " + felipe.getSexo() + " e tem " +
                felipe.getIdade() + " anos ");
        //RESULTADO NO CONSOLE
        //O aluno Felipe tem 8 anos
    }
}
