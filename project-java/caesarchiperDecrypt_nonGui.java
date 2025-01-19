import java.util.Scanner;

public class caesarchiperDecrypt_nonGui {

    public static void main(String[] args) {
        String pesanAman, pesanOri = "";
        int kunci;
        char pesanChar;
        Scanner caesarIn = new Scanner(System.in);

        System.out.print("Masukkan pesan enkripsi : ");
        pesanAman = caesarIn.nextLine();

        System.out.print("Masukkan kunci : ");
        kunci = caesarIn.nextInt();

        for (int i = 0; i < pesanAman.length(); ++i) {
            pesanChar = pesanAman.charAt(i);
            if (pesanChar >= 'a' && pesanChar <= 'z') {
                pesanChar = (char) (pesanChar - kunci);

                if (pesanChar < 'a') {
                    pesanChar = (char) (pesanChar + 'z' - 'a' + 1);
                }
                pesanOri += pesanChar;
            } else if (pesanChar >= 'A' && pesanChar <= 'Z') {
                pesanChar = (char) (pesanChar - kunci);

                if (pesanChar < 'A') {
                    pesanChar = (char) (pesanChar + 'Z' - 'A' + 1);
                }

                pesanOri += pesanChar;
            } else {
                pesanOri += pesanOri;
            }
        }

        System.out.println("Pesan yang sudah decrypt : " + pesanOri);

    }
}