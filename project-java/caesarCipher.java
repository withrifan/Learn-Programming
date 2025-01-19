import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class caesarCipher {

    public static void main(String[] args) {
        caesarCipher app = new caesarCipher();
        app.run();
    }

    // Method utama untuk menjalankan aplikasi
    private void run() {
        while (true) { // Loop untuk kembali ke menu utama
            int choice = showMenu();
            if (choice == JOptionPane.CLOSED_OPTION) {
                showInfoMessage("Operasi dibatalkan.");
                return;
            }

            String pesan = getInputMessage();
            if (pesan == null) {
                continue; // Kembali ke menu utama jika pengguna membatalkan
            }

            int kunci = getKey();
            if (kunci == -1) {
                continue; // Kembali ke menu utama jika pengguna membatalkan
            }

            String hasil;
            if (choice == 0) {
                hasil = encrypt(pesan, kunci); // Pilihan Enkripsi
            } else {
                hasil = decrypt(pesan, kunci); // Pilihan Dekripsi
            }

            showResult(hasil);
        }
    }

    // Menampilkan menu pilihan enkripsi atau dekripsi
    private int showMenu() {
        String[] options = { "Enkripsi", "Dekripsi" };
        return JOptionPane.showOptionDialog(null, "Pilih operasi yang ingin dilakukan", "Caesar Cipher",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }

    // Mengambil input pesan dari pengguna
    private String getInputMessage() {
        String pesan = JOptionPane.showInputDialog(null, "Masukkan pesan Anda:", "Input Pesan",
                JOptionPane.QUESTION_MESSAGE);
        if (pesan == null || pesan.trim().isEmpty()) {
            if (pesan == null) {
                showInfoMessage("Input pesan dibatalkan. Kembali ke menu utama.");
            } else {
                showErrorMessage("Pesan tidak boleh kosong!");
            }
            return null; // Kembali ke menu utama
        }
        return pesan;
    }

    // Mengambil input kunci dari pengguna
    private int getKey() {
        while (true) {
            String kunciStr = JOptionPane.showInputDialog(null, "Masukkan kunci (angka) Anda:", "Input Kunci",
                    JOptionPane.QUESTION_MESSAGE);

            if (kunciStr == null || kunciStr.trim().isEmpty()) {
                if (kunciStr == null) {
                    showInfoMessage("Input kunci dibatalkan. Kembali ke menu utama.");
                } else {
                    showErrorMessage("Kunci tidak boleh kosong!");
                }
                return -1; // Kembali ke menu utama
            }

            try {
                return Integer.parseInt(kunciStr);
            } catch (NumberFormatException e) {
                showErrorMessage("Kunci harus berupa angka!");
            }
        }
    }

    // Menampilkan hasil enkripsi atau dekripsi dan menyediakan opsi "Copy"
    private void showResult(String hasil) {
        int result = JOptionPane.showOptionDialog(null, "Hasil:\n" + hasil, "Caesar Cipher",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] { "Salin", "Kembali" },
                "Salin");

        if (result == 0) {
            copyToClipboard(hasil);
            showInfoMessage("Hasil disalin ke clipboard!");
        }
    }

    // Menyalin teks ke clipboard
    private void copyToClipboard(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    // Metode untuk menampilkan pesan informasi
    private void showInfoMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }

    // Metode untuk menampilkan pesan error
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Metode untuk enkripsi
    private String encrypt(String pesanOri, int kunci) {
        StringBuilder pesanAman = new StringBuilder();

        for (int i = 0; i < pesanOri.length(); ++i) {
            char pesanChar = pesanOri.charAt(i);

            if (Character.isLowerCase(pesanChar)) {
                pesanChar = (char) (pesanChar + kunci);
                if (pesanChar > 'z') {
                    pesanChar = (char) (pesanChar - 'z' + 'a' - 1);
                }
            } else if (Character.isUpperCase(pesanChar)) {
                pesanChar = (char) (pesanChar + kunci);
                if (pesanChar > 'Z') {
                    pesanChar = (char) (pesanChar - 'Z' + 'A' - 1);
                }
            }
            pesanAman.append(pesanChar);
        }

        return pesanAman.toString();
    }

    // Metode untuk dekripsi
    private String decrypt(String pesanAman, int kunci) {
        StringBuilder pesanOri = new StringBuilder();

        for (int i = 0; i < pesanAman.length(); ++i) {
            char pesanChar = pesanAman.charAt(i);

            if (Character.isLowerCase(pesanChar)) {
                pesanChar = (char) (pesanChar - kunci);
                if (pesanChar < 'a') {
                    pesanChar = (char) (pesanChar + 'z' - 'a' + 1);
                }
            } else if (Character.isUpperCase(pesanChar)) {
                pesanChar = (char) (pesanChar - kunci);
                if (pesanChar < 'A') {
                    pesanChar = (char) (pesanChar + 'Z' - 'A' + 1);
                }
            }
            pesanOri.append(pesanChar);
        }

        return pesanOri.toString();
    }
}
