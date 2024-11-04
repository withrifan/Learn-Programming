import javax.swing.JOptionPane;
import java.util.Arrays;

public class praktikum2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        // Loop untuk menerima 5 input dari pengguna
        for (int i = 0; i < 5; i++) {
            boolean validInput = false;
            while (!validInput) {
                String inputStr = JOptionPane.showInputDialog(null,
                        "Masukkan bilangan ke-" + (i + 1) + " (maksimal 100):",
                        "Input Bilangan", JOptionPane.QUESTION_MESSAGE);

                // Validasi input kosong atau cancel
                if (inputStr == null || inputStr.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Input tidak boleh kosong.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                try {
                    int number = Integer.parseInt(inputStr);

                    // Validasi agar bilangan tidak lebih dari 100
                    if (number > 100) {
                        JOptionPane.showMessageDialog(null, "Bilangan tidak boleh lebih dari 100!", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        numbers[i] = number;
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Mengurutkan array bilangan
        Arrays.sort(numbers);

        // Menampilkan bilangan dalam urutan dari terkecil ke terbesar
        StringBuilder sortedNumbers = new StringBuilder();
        for (int number : numbers) {
            sortedNumbers.append(number).append(" ");
        }

        // Konfirmasi untuk menampilkan hasil
        int confirm = JOptionPane.showConfirmDialog(null, "Tampilkan bilangan yang diurutkan?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Jika pengguna memilih "Yes", tampilkan hasil bilangan yang diurutkan
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Bilangan yang diurutkan dari terkecil hingga terbesar:\n" + sortedNumbers.toString(),
                    "Hasil", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Proses dibatalkan.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
