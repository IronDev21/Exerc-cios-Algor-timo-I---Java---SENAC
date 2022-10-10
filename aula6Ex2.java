import javax.swing.JOptionPane;

public class aula6Ex2 {

    public static void controle() {
        
        String nome = JOptionPane.showInputDialog(null, "Qual é seu nome? ");
        String idade = JOptionPane.showInputDialog(null, "Quantos anos você tem? ");

        double x = Double.parseDouble(idade);
        int y = (int) x;
        String msg;

        if (y < 10) {

            msg = "O plano de saúde para " + nome + " custa R$30,00";

        } else if (y > 10 && y <= 29) {

            msg = "O plano de saúde para " + nome + " custa R$60,00";

        } else if (y > 29 && y <= 49) {

            msg = "O plano de saúde para " + nome + " custa R$120,00";

        } else if (y > 45 && y <= 59) {

            msg = "O plano de saúde para " + nome + " custa R$150,00";

        } else if (y > 59 && y <= 65) {

            msg = "O plano de saúde para " + nome + " custa R$250,00";

        } else {

            msg = "O plano de saúde para " + nome + " custa R$400,00";
        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args) {
        controle();
    }
}