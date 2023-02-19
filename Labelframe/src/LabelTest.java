// Importação da classe necessária para a classe LabelTest
import javax.swing.JFrame;  // janela gráfica

// Classe que cria e exibe a janela com os JLabels da classe Labelframe
public class LabelTest {
    public static void main(String[] args) {
        // Cria uma instância da classe Labelframe
        Labelframe labelFrame = new Labelframe();
        // Define a operação de fechamento da janela
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o tamanho da janela
        labelFrame.setSize(260,180);
        // Torna a janela visível
        labelFrame.setVisible(true);
    }
}
