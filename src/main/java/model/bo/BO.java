package model.bo;

import java.util.ArrayList;
import model.bean.ThucDon;
import model.dao.DAO;

public class BO {
	DAO dao = new DAO();
	
	public ArrayList<ThucDon> getAllMon() {
		return dao.getAllMon();
	}
	
	public ThucDon getMon(String ID_Mon) {
		return dao.getID_Mon(ID_Mon);
	}
	
	public void addMon(String ID_Mon, String Ten, String DonGia, String Flag) {
		ThucDon td = null;
		dao.addMon(td);		
	}
	
	public void updateMon(ThucDon td) {
		dao.updateMon(td);
	}
	
	public ArrayList<ThucDon> searchMon(String col, String val) {
		return dao.searchMon(col, val);
	}
	
	public void deleteMon(String ID_Mon) {
		dao.deleteMon(ID_Mon);
	}

	
}
