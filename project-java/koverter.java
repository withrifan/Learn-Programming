import javax.swing.JOptionPane;

public class koverter {
    public static void main(String[] args) {
        while (true) {
            String[] options = { "Biner ke Desimal", "Desimal ke Biner", "Biner ke Heksadesimal", "Biner ke Oktal",
                    "Keluar" };
            int choice = JOptionPane.showOptionDialog(null, "Pilih konversi:", "Kalkulator Konverter",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    String biner = JOptionPane.showInputDialog("Masukkan angka biner:");
                    int desimal = Integer.parseInt(biner, 2);
                    JOptionPane.showMessageDialog(null, "Desimal: " + desimal);
                    break;
                case 1:
                    String desimalStr = JOptionPane.showInputDialog("Masukkan angka desimal:");
                    int desimalInt = Integer.parseInt(desimalStr);
                    String binerResult = Integer.toBinaryString(desimalInt);
                    JOptionPane.showMessageDialog(null, "Biner: " + binerResult);
                    break;
                case 2:
                    String binerToHex = JOptionPane.showInputDialog("Masukkan angka biner:");
                    int desimalFromBiner = Integer.parseInt(binerToHex, 2);
                    String heksadesimal = Integer.toHexString(desimalFromBiner).toUpperCase();
                    JOptionPane.showMessageDialog(null, "Heksadesimal: " + heksadesimal);
                    break;
                case 3:
                    String binerToOctal = JOptionPane.showInputDialog("Masukkan angka biner:");
                    int desimalFromBiner2 = Integer.parseInt(binerToOctal, 2);
                    String oktal = Integer.toOctalString(desimalFromBiner2);
                    JOptionPane.showMessageDialog(null, "Oktal: " + oktal);
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid!");
            }
        }
    }
}
