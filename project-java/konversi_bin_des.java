import javax.swing.JOptionPane;

public class konversi_bin_des {
    public static void main(String[] args) {
        String binin = JOptionPane.showInputDialog("Masukkan angka biner: ");

        try {
            int desimal = Integer.parseInt(binin, 2);
            JOptionPane.showMessageDialog(null, "Angka Desimal dari Biner: " + binin + " adalah " + desimal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid");
        }
    }
}
