import javax.swing.JOptionPane;

public class konversi_des_bin {
    public static void main(String[] args) {
        String desin = JOptionPane.showInputDialog("Masukkan angka Desimal: ");

        try {
            int desimal = Integer.parseInt(desin);
            String binary = Integer.toBinaryString(desimal);
            JOptionPane.showMessageDialog(null, "Angka biner dari " + desimal + " adalah " + binary);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Input tidak valid, Harap masukkan angka desimal");
        }
    }
}
