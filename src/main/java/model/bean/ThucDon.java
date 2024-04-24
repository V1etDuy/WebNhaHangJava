package model.bean;

public class ThucDon {
	String ID_Mon;
	String Ten;
	String DonGia;
	String Flag;
	public ThucDon(String ID_Mon, String Ten, String DonGia,String Flag) {
		this.ID_Mon = ID_Mon;
		this.Ten = Ten;
		this.DonGia = DonGia;
		this.Flag = Flag;
	}
	public ThucDon() {
		
	}
	public String getID() {
		return this.ID_Mon;
	}
	public String getTen() {
		return this.Ten;
	}
	public String getDonGia() {
		return this.DonGia;
	}
	public String getFlag() {
		return this.Flag;
	}
	
	public void setID(String ID_Mon) {
		this.ID_Mon = ID_Mon;
	}
	public void setTen(String Ten) {
		this.Ten = Ten;
	}
	public void setDonGia(String DonGia) {
		this.DonGia = DonGia;
	}
	public void setFlag(String Flag) {
		this.Flag = Flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

