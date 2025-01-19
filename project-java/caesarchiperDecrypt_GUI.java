import javax.swing.JOptionPane;

public class caesarchiperDecrypt_GUI {

    public static void main(String[] args) {
        // Input pesan enkripsi
        String pesanAman = JOptionPane.showInputDialog(null, "Masukkan pesan enkripsi:", "Input Pesan Enkripsi",
                JOptionPane.QUESTION_MESSAGE);
        if (pesanAman == null || pesanAman.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pesan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Input kunci enkripsi
        int kunci = 0;
        boolean validKey = false;
        while (!validKey) {
            String kunciStr = JOptionPane.showInputDialog(null, "Masukkan kunci (angka):", "Input Kunci",
                    JOptionPane.QUESTION_MESSAGE);
            if (kunciStr == null || kunciStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kunci tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                kunci = Integer.parseInt(kunciStr);
                validKey = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Kunci harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Proses dekripsi
        String pesanOri = "";
        for (int i = 0; i < pesanAman.length(); ++i) {
            char pesanChar = pesanAman.charAt(i);

            // Dekripsi untuk huruf kecil
            if (pesanChar >= 'a' && pesanChar <= 'z') {
                pesanChar = (char) (pesanChar - kunci);

                if (pesanChar < 'a') {
                    pesanChar = (char) (pesanChar + 'z' - 'a' + 1);
                }
                pesanOri += pesanChar;
            }
            // Dekripsi untuk huruf besar
            else if (pesanChar >= 'A' && pesanChar <= 'Z') {
                pesanChar = (char) (pesanChar - kunci);

                if (pesanChar < 'A') {
                    pesanChar = (char) (pesanChar + 'Z' - 'A' + 1);
                }
                pesanOri += pesanChar;
            }
            // Menambahkan karakter non-huruf tanpa perubahan
            else {
                pesanOri += pesanChar;
            }
        }

        // Tampilkan hasil dekripsi
        JOptionPane.showMessageDialog(null, "Pesan asli setelah dekripsi:\n" + pesanOri, "Hasil Dekripsi",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
