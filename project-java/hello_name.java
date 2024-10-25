import javax.swing.JOptionPane;

public class hello_name {

    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Masukkan nama anda: ");
        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}