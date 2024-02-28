// importando bibliotecas
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
/**
 * TextFieldFrame
 */
public class TextFieldFrame extends JFrame {
    private JTextField textField1; // campo de texto com tamanho configurado
    private JTextField textField2; // campo de texto construido com texto
    private JTextField textField3; // compo de texto com texto e tamanho
    private JPasswordField passwordField; // compo senha com texto

    //construtor TextFielFrame adiciona JTextFields a JFrame
    /**
     * 
     */
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout( new FlowLayout()); // configura o layout de frame

        //constrói TextField com 10 colunas
        textField1 = new JTextField(10);
        add(textField1); // adiciona textField ao JFrame

        //constrói campo de Texto com texto padrão
        textField2 = new JTextField("Enter text here" );
        add(textField2);

        //constrói TextField com Texto padrão e 21 colunas
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false); // desativa a edição
        add(textField3); // adiciona textField3 ao JFrame

        // constrói passwordfield com texto padrão
        passwordField = new JPasswordField("Hidden text" );
        add(passwordField);// adiciona passwordField ao JFrame

        //handlers de evento registradores
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener (handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
        // fim do construtor TextFieldFrame
    }

    //class interna private para tratamento de evento
    private class TextFieldHandler implements ActionListener {
        // processa eventos de campo de texto
        public void actionPerformed( ActionEvent event){
            String string = ""; // declara string a ser exibida

            //usuário pressionou enter no JTextField TextField1
            if(event.getSource() == textField1)
            string = String.format("textField1: %s",event.getActionCommand());

            //usuário pressionou Enter no JTextField TextField2
            else if(event.getSource() == textField2)
            string = String.format("textField2: %s", event.getActionCommand());

            //usário pressionou Enter no JTextField TextField3
            else if(event.getSource() == textField3)
            string = String.format("textField3: %s", event.getActionCommand());

            //usuário pressionou Enter no JTextField passwordField
            else if(event.getSource() == passwordField)
            string = String.format("passwordField: %s", event.getActionCommand());

            //exibe o centeúdo de JTextField
            JOptionPane.showMessageDialog(null,string);
        }// fim do método actionPerformed
        
    }// fim da classe TextFielhandler interna private
    
}// fim da classe TextFieldFrame