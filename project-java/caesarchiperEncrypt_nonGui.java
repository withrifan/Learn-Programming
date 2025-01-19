import java.util.Scanner;

public class caesarchiperEncrypt_nonGui {
    public static void main(String[] args) {

        String pesanOri, pesanAman = "";
        int kunci;
        char pesanChar;
        Scanner caesarIn = new Scanner(System.in);

        System.out.print("Masukkan pesan Anda : ");
        pesanOri = caesarIn.nextLine();

        System.out.print("Masukkan key : ");
        kunci = caesarIn.nextInt();

        for (int i = 0; i < pesanOri.length(); ++i) {
            pesanChar = pesanOri.charAt(i);

            if (pesanChar >= 'a' && pesanChar <= 'z') {
                pesanChar = (char) (pesanChar + kunci);

                if (pesanChar > 'z') {
                    pesanChar = (char) (pesanChar - 'z' + 'a' - 1);
                }

                pesanAman += pesanChar;
            } else if (pesanChar >= 'A' && pesanChar <= 'Z') {
                pesanChar = (char) (pesanChar + kunci);

                if (pesanChar > 'Z') {
                    pesanChar = (char) (pesanChar - 'Z' + 'A' - 1);
                }
                pesanAman += pesanChar;
            } else {
                pesanAman += pesanChar;
            }
        }

        System.out.println("Pesan yang sudah terenkripsi : " + pesanAman);
    }

}