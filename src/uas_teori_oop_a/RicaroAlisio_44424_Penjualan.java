package uas_teori_oop_a;
import java.util.ArrayList;

public class RicaroAlisio_44424_Penjualan implements RicaroAlisio_44424_Mobil2, RicaroAlisio_44424_Mobil1{
	
	protected int LamaPinjam;
	ArrayList<RicaroAlisio_44424_Mobil1> listMobil1 = new ArrayList<RicaroAlisio_44424_Mobil1>();
	
	ArrayList<RicaroAlisio_44424_Mobil2> listMobil2 = new ArrayList<RicaroAlisio_44424_Mobil2>();
	
	
	public int harga_otr(String merk, String metodeByr) {
		int hrg = 0;
		if(merk.equalsIgnoreCase("agya")) {
			hrg = 120000;
			hrg = hrg- diskon_dealer(metodeByr, hrg);
		}
		else if(merk.equalsIgnoreCase("avanza")) {
			hrg = 200000;
			hrg = hrg- diskon_dealer(metodeByr, hrg);
		}
		return hrg;
	}
	public int diskon_dealer(String metodeByr, int hargaMobil) {
		if(metodeByr.equals("Cash")) {
			hargaMobil = (int)hargaMobil*15/100;
		}
		else if(metodeByr.equals("Kredit")) {
			hargaMobil = (int)hargaMobil*10/100;
		}
		return hargaMobil;
	}
	
	public  int cicilan(int jmlbln, int hargaMobil) {
		int cicil = 0;
        cicil = hargaMobil/jmlbln;
        return cicil;
        
	}
}
