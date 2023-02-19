// Importações de classes necessárias para a classe Labelframe
import java.awt.FlowLayout;  // layout de fluxo para janelas
import java.util.Objects;  // classe utilitária para trabalhar com referências nulas
import javax.swing.JFrame;  // janela gráfica
import javax.swing.JLabel;  // componente de rótulo de texto
import javax.swing.SwingConstants;  // constantes para alinhamento de texto em componentes
import javax.swing.Icon;  // interface para ícones gráficos
import javax.swing.ImageIcon;  // classe para carregar imagens em um ícone

// Define uma classe que estende JFrame para exibir três JLabels com texto e/ou ícones
public class Labelframe extends JFrame {

    // Construtor da classe
    public Labelframe() {
        // Chama o construtor da classe pai (JFrame) com o título da janela
        super("Testing Jlabel");
        // Define um layout de fluxo para a janela
        setLayout(new FlowLayout());

        // Cria um JLabel com texto e adiciona à janela, definindo um texto de dica de ferramenta para o componente
        JLabel label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);

        // Cria um JLabel com texto e um ícone, adicionando à janela, definindo um texto de dica de ferramenta para o componente
        Icon bug = new ImageIcon(Objects.requireNonNull(getClass().getResource("bug1.png")));
        JLabel label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label 2");
        add(label2);

        // Cria um JLabel com um ícone e texto, posicionando o texto abaixo do ícone, adicionando à janela e definindo um texto de dica de ferramenta para o componente
        JLabel label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
