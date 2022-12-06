package uas_teori_oop_a;

public interface RicaroAlisio_44424_Mobil1 {
	public String merk = "Avanza";
	public int harga = 200000;
	//public RicaroAlisio_44424_Mobil1(String merk, int harga);
	public abstract int harga_otr(String merk, String metodeByr);
	public abstract int diskon_dealer(String metodeByr, int hargaMobil);
}