import javax.swing.JOptionPane;

public class aula6Ex1 {
    
public static void main ( String args[] ) {

        double valorProduto, valorVenda;
        String mensagem;

JOptionPane.showMessageDialog(null, "*** Valor de venda dos produtos ***");
valorProduto = Double.parseDouble(JOptionPane.showInputDialog( "Digite o valor do produto adquirido: "));

if (valorProduto < 20) {

    valorVenda = (valorProduto * 45)/100;

    mensagem = " O valor de venda do produto é  " + (valorProduto + valorVenda); 

}

else {

    valorVenda = (valorProduto * 30)/100;

    mensagem = " O valor de venda do produto é  " + (valorProduto + valorVenda);

}

JOptionPane.showMessageDialog(null, mensagem);
System.exit(0);

}
}
