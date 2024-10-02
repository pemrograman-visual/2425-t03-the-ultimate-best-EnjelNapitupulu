// 12S24056-ENJEL AYUTI NAPITUPULU
// 12S24033-DOY SIMANJUNTAK

import java.util.*;
import java.lang.Math;

public class  T03{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format, ket, tUB, diskon;
        int stok, tahun;
        double harga, margin, rating, katDiskon;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahun = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                format = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    ket = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        ket = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            ket = "Recomended";
                        } else {
                            if (rating >= 3.0) {
                                ket = "Average";
                            } else {
                                ket = "Low";
                            }
                        }
                    }
                }
            }
            katDiskon = margin / harga * -1;
            if (katDiskon >= 0.4) {
                diskon = "Once in a lifetime";
            } else {
                if (katDiskon > 0.2) {
                    diskon = "Never come twice";
                } else {
                    if (katDiskon > 0) {
                        diskon = "No regret";
                    } else {
                        diskon = "---";
                    }
                }
            }
            if (ket.equals("Best Pick") && diskon.equals("Once in a lifetime")) {
                tUB = "The Ultimate Best";
            } else {
                tUB = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + toFixed(rating,1) + "|" + ket + "|" + diskon + "|" + tUB);
        } while (!iSBN.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

