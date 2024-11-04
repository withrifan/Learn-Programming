import javax.swing.JOptionPane;

public class praktikum1 {
    public static void main(String[] args) {
        // Input nama dari pengguna menggunakan Input Dialog
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama Anda:", "Input Nama",
                JOptionPane.QUESTION_MESSAGE);

        // Validasi jika pengguna menekan Cancel atau tidak memasukkan nama
        if (nama == null || nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Input usia dari pengguna menggunakan Input Dialog
        String usiaStr = JOptionPane.showInputDialog(null, "Masukkan usia Anda:", "Input Usia",
                JOptionPane.QUESTION_MESSAGE);

        // Validasi input usia
        if (usiaStr == null || usiaStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usia tidak boleh kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int usia = 0;
        try {
            usia = Integer.parseInt(usiaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Usia harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Option dialog untuk memilih kota asal
        String[] cities = { "Sidoarjo", "Surabaya", "Gresik", "Lamongan" };
        int cityIndex = JOptionPane.showOptionDialog(null, "Pilih kota asal Anda:", "Pilih Kota",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, cities, cities[0]);

        // Validasi jika pengguna menekan Cancel
        if (cityIndex == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Tidak ada kota yang dipilih.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String kota = cities[cityIndex];

        // Menentukan status berdasarkan usia
        String status;
        if (usia >= 6 && usia <= 12) {
            status = "SD";
        } else if (usia >= 12 && usia <= 15) {
            status = "SMP";
        } else if (usia >= 15 && usia <= 18) {
            status = "SMA";
        } else {
            status = "bekerja";
        }

        // Konfirmasi untuk menampilkan hasil
        int confirm = JOptionPane.showConfirmDialog(null, "Tampilkan hasil informasi Anda?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Jika pengguna memilih "Yes", tampilkan hasil informasi
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Nama saya " + nama + ", berasal dari Kota " + kota +
                    ", dan saya sekarang sedang " + (status.equals("bekerja") ? "bekerja" : "studi di " + status)
                    + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Informasi dibatalkan.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
