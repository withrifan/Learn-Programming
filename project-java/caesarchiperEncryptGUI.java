import javax.swing.JOptionPane;

public class caesarchiperEncryptGUI {
    public static void main(String[] args) {
        // Input pesan asli
        String pesanOri = JOptionPane.showInputDialog(null, "Masukkan pesan Anda:", "Input Pesan",
                JOptionPane.QUESTION_MESSAGE);
        if (pesanOri == null || pesanOri.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pesan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Input kunci enkripsi
        int kunci = 0;
        boolean validKey = false;
        while (!validKey) {
            String kunciStr = JOptionPane.showInputDialog(null, "Masukkan key (angka):", "Input Key",
                    JOptionPane.QUESTION_MESSAGE);
            if (kunciStr == null || kunciStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Key tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                kunci = Integer.parseInt(kunciStr);
                validKey = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Key harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Proses enkripsi
        String pesanAman = "";
        for (int i = 0; i < pesanOri.length(); ++i) {
            char pesanChar = pesanOri.charAt(i);

            // Enkripsi untuk huruf kecil
            if (pesanChar >= 'a' && pesanChar <= 'z') {
                pesanChar = (char) (pesanChar + kunci);

                if (pesanChar > 'z') {
                    pesanChar = (char) (pesanChar - 'z' + 'a' - 1);
                }

                pesanAman += pesanChar;
            }
            // Enkripsi untuk huruf besar
            else if (pesanChar >= 'A' && pesanChar <= 'Z') {
                pesanChar = (char) (pesanChar + kunci);

                if (pesanChar > 'Z') {
                    pesanChar = (char) (pesanChar - 'Z' + 'A' - 1);
                }
                pesanAman += pesanChar;
            }
            // Menambahkan karakter non-huruf tanpa perubahan
            else {
                pesanAman += pesanChar;
            }
        }

        // Tampilkan hasil enkripsi
        JOptionPane.showMessageDialog(null, "Pesan yang sudah terenkripsi :\n" + pesanAman, "Hasil Enkripsi",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
