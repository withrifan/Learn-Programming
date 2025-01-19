import javax.swing.JOptionPane;

public class dataDiri {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama Anda:", "Input Nama",
                JOptionPane.QUESTION_MESSAGE);

        if (nama == null || nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String usiaStr = JOptionPane.showInputDialog(null, "Masukkan usia Anda:", "Input Usia",
                JOptionPane.QUESTION_MESSAGE);

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

        String[] listKota = { "Sidoarjo", "Surabaya", "Gresik", "Lamongan" };
        int pilihKota = JOptionPane.showOptionDialog(null, "Pilih kota asal Anda:", "Pilih Kota",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, listKota, listKota[0]);

        if (pilihKota == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Tidak ada kota yang dipilih.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String kota = listKota[pilihKota];

        String status;
        if (usia >= 6 && usia <= 12) {
            status = "belajar di SD";
        } else if (usia >= 12 && usia <= 15) {
            status = "belajar di SMP";
        } else if (usia >= 15 && usia <= 18) {
            status = "belajar di SMA";
        } else if (usia >= 19 && usia <= 22) {
            status = "berkuliah";
        } else {
            status = "bekerja";
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Tampilkan hasil informasi Anda?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Nama saya " + nama + ", berasal dari Kota " + kota +
                    ", dan saya sekarang sedang " + status + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Informasi dibatalkan.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
