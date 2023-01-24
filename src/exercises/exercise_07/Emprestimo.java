package exercises.exercise_07;
import java.util.HashMap;
import exercises.exercise_07.Livro;
import exercises.exercise_07.Pessoa;

public class Emprestimo {
    String pessoa;
    String livro;

    public Emprestimo(String pessoa, String livro) {
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "pessoa=" + pessoa + ", livro=" + livro + '}';
    }

}
