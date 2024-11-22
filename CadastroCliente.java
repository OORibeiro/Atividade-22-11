package ex12.view;
import ex12.model.Cliente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class CadastroCliente extends JFrame {
    private JTextField nomeField, idadeField, emailField;
    private JButton cadastrarButton;
    public CadastroCliente() {
        setTitle("Cadastro de Cliente");
        setLayout(new FlowLayout());
        nomeField = new JTextField(20);
        idadeField = new JTextField(20);
        emailField = new JTextField(20);
        cadastrarButton = new JButton("Cadastrar");
        add(new JLabel("Nome do Cliente:"));
        add(nomeField);
        add(new JLabel("Idade:"));
        add(idadeField);
        add(new JLabel("E-mail:"));
        add(emailField);
        add(cadastrarButton);
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    private void cadastrarCliente() {
        String nome = nomeField.getText();
        String idadeTexto = idadeField.getText();
        String email = emailField.getText();
        if (nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome do cliente não pode ser vazio.");
            return;
        }
        int idade = 0;
        try {
            idade = Integer.parseInt(idadeTexto);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Idade deve ser um número inteiro.");
            return;
        }
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this, "E-mail inválido. Deve conter '@'.");
            return;
        }
        Cliente cliente = new Cliente(nome, idade, email);
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        System.out.println(cliente.toString());
    }
 
    public static void main(String[] args) {
        new CadastroCliente();
    }
}