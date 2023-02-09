import javax.swing.JOptionPane;

public class IMC
{
    public static void main(String[] args)
    {
        String firstNumber =
                JOptionPane.showInputDialog("Insira sua altura:");
        String secondNumber=
                JOptionPane.showInputDialog("Insira seu peso:");

        double Altura_pessoa = Double.parseDouble(firstNumber);
        double Peso_pessoa = Double.parseDouble(secondNumber);

        double IMC = Peso_pessoa / ((Altura_pessoa/100)*(Altura_pessoa)/100);
        JOptionPane.showMessageDialog(null,"Seu IMC: "+ IMC+"\n Para mais informações pesquise : tabela IMC", "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}