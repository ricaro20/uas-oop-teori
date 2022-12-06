package uas_teori_oop_a;
import java.util.*;
public class RicaroAlisio_44424_PenjualanApp {
	
	public static void main(String[] args) {
		RicaroAlisio_44424_Penjualan penjualan = new RicaroAlisio_44424_Penjualan();
		Scanner scan = new Scanner(System.in);
		int harga;
		System.out.print("Pilih Mobil (Agya, Avanza) : ");
		String mobil = scan.nextLine();
		System.out.print("Pembayaran (Cash - Kredit) : ");
		String metode = scan.nextLine();
		
		if(mobil.equals("Avanza")) {
			harga = RicaroAlisio_44424_Mobil1.harga;
		}
		
		else{
			harga = RicaroAlisio_44424_Mobil2.harga;
		}
		
		if (metode.equalsIgnoreCase("kredit")) {
            System.out.print("Cicil Berapa bulan? (12-36) : ");
            int bln = scan.nextInt();
            try {
            	 if (bln < 12 || bln > 36) {
                     throw new RicaroAlisio_44424_CekCicilan();
            	 }
            } catch (RicaroAlisio_44424_CekCicilan ex) {
                System.out.println(ex.getMessage());
                System.exit(0);
            }
            
            System.out.println("Harga sebelum Diskon: " + harga);
            System.out.println("Diskon Dealer: " + penjualan.diskon_dealer(metode, harga));
            System.out.println("Harga OTR: " + penjualan.harga_otr(mobil, metode));
            int harga1= penjualan.harga_otr(mobil, metode);
            System.out.print("Cicilan per bulan: " + penjualan.cicilan(bln, harga1));
            
        } 
		else {
            System.out.println("Harga sebelum Diskon: " + harga);
            System.out.println("Diskon Dealer: " + penjualan.diskon_dealer(metode, harga));
            System.out.println("Harga OTR: " + penjualan.harga_otr(mobil, metode));
            
        }
		
	}

}