import javax.swing.JOptionPane;

public class konversi_bilangan {
    public static void main(String[] args) {
        String[] options = { "Biner ke Desimal", "Desimal ke Biner", "Biner ke Oktal", "Oktal ke Biner",
                "Biner ke Heksadesimal", "Heksadesimal ke Biner" };

        while (true) {
            int pilihan = JOptionPane.showOptionDialog(null, "Pilih jenis konversi:", "Konverter Bilangan",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (pilihan == -1) { // Jika Cancel ditekan
                break; // Keluar dari loop dan mengakhiri program
            }

            switch (pilihan) {
                case 0:
                    convertBinaryToDecimal();
                    break;
                case 1:
                    convertDecimalToBinary();
                    break;
                case 2:
                    convertBinaryToOctal();
                    break;
                case 3:
                    convertOctalToBinary();
                    break;
                case 4:
                    convertBinaryToHex();
                    break;
                case 5:
                    convertHexToBinary();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static void convertBinaryToDecimal() {
        String input = JOptionPane.showInputDialog("Masukkan angka biner:");
        if (input == null)
            return; // Jika Cancel ditekan, kembali ke menu utama

        try {
            int decimal = Integer.parseInt(input, 2);
            JOptionPane.showMessageDialog(null, "Angka desimal dari " + input + " adalah: " + decimal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Harap masukkan angka biner yang benar.");
        }
    }

    private static void convertDecimalToBinary() {
        String input = JOptionPane.showInputDialog("Masukkan angka desimal:");
        if (input == null)
            return; // Jika Cancel ditekan, kembali ke menu utama

        try {
            int decimal = Integer.parseInt(input);
            String binary = Integer.toBinaryString(decimal);
            JOptionPane.showMessageDialog(null, "Angka biner dari " + decimal + " adalah: " + binary);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Harap masukkan angka desimal yang benar.");
        }
    }

    private static void convertBinaryToOctal() {
        String input = JOptionPane.showInputDialog("Masukkan angka biner:");
        if (input == null)
            return; // Jika Cancel ditekan, kembali ke menu utama

        try {
            int decimal = Integer.parseInt(input, 2);
            String octal = Integer.toOctalString(decimal);
            JOptionPane.showMessageDialog(null, "Angka oktal dari " + input + " adalah: " + octal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Harap masukkan angka biner yang benar.");
        }
    }

    private static void convertOctalToBinary() {
        String input = JOptionPane.showInputDialog("Masukkan angka oktal:");
        if (input == null)
            return; // Jika Cancel ditekan, kembali ke menu utama

        try {
            int decimal = Integer.parseInt(input, 8);
            String binary = Integer.toBinaryString(decimal);
            JOptionPane.showMessageDialog(null, "Angka biner dari " + input + " adalah: " + binary);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Harap masukkan angka oktal yang benar.");
        }
    }

    private static void convertBinaryToHex() {
        String input = JOptionPane.showInputDialog("Masukkan angka biner:");
        if (input == null)
            return; // Jika Cancel ditekan, kembali ke menu utama

        try {
            int hex = Integer.parseInt(input, 2);
            String heksadesimal = Integer.toHexString(hex).toUpperCase();
            JOptionPane.showMessageDialog(null, "Angka heksadesimal dari " + input + " adalah: " + heksadesimal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Harap masukkan angka biner yang benar.");
        }
    }

    private static void convertHexToBinary() {
        String input = JOptionPane.showInputDialog("Masukkan angka Heksadesimal:");
        if (input == null)
            return; // Jika Cancel ditekan, kembali ke menu utama

        try {
            int decimal = Integer.parseInt(input, 16);
            String binary = Integer.toBinaryString(decimal);
            JOptionPane.showMessageDialog(null, "Angka biner dari " + input + " adalah: " + binary);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Harap masukkan angka Heksadesimal yang benar.");
        }
    }
}
