package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.bean.ThucDon;

public class DAO {
	public ArrayList<ThucDon> getAllMon(){
		ArrayList<ThucDon> result = new ArrayList<ThucDon>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnw_nhom", "root", "");
			Statement sm = conn.createStatement();
			String sql = "SELECT * FROM thucdon";
			ResultSet rs = sm.executeQuery(sql);
			while (rs.next()) {
				ThucDon td = new ThucDon();
				td.setID(rs.getString(1));
				td.setTen(rs.getString(2));
				td.setDonGia(rs.getString(3));
				td.setFlag(rs.getString(4));
				result.add(td);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public ThucDon getID_Mon(String ID) {
		ThucDon result = null;
		ArrayList<ThucDon> allMon = getAllMon();
		for (ThucDon td : allMon) {
			if (td.getID().equals(ID)) {
				result = td;
				break;
			}
		}
		return result;
	}
	
	public void addMon(ThucDon td) {
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnw_nhom", "root", "");
			String insertQuery = "INSERT INTO thucdon VALUES (?, ?, ?, ?)";

            preparedStatement = conn.prepareStatement(insertQuery);

            preparedStatement.setString(1, td.getID());
            preparedStatement.setString(2, td.getTen());
            preparedStatement.setString(3, td.getDonGia());
            preparedStatement.setString(3, td.getFlag());

            // Execute the insertion
            preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void updateMon(ThucDon sv) {
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnw_nhom", "root", "");
			String updateQuery = "UPDATE thucdon SET Ten = ?, DonGia = ?, Flag = ? WHERE ID_Mon = ?";

            preparedStatement = conn.prepareStatement(updateQuery);
            
            preparedStatement.setString(1, sv.getID());
            preparedStatement.setString(2, sv.getTen());
            preparedStatement.setString(3, (sv.getDonGia()));
            preparedStatement.setString(4, sv.getFlag());

            // Execute the insertion
            preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<ThucDon> searchMon(String col, String val) {
		ArrayList<ThucDon> result = new ArrayList<ThucDon>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnw_nhom", "root", "");
			Statement sm = conn.createStatement();
			String sql = null;
			if (col == "Ten") {
				sql = "SELECT * FROM thucdon where " + col + " = " + val;
			}
			else {
				sql = "SELECT * FROM thucdon where " + col + " like '%" + val + "%'";
			}
			ResultSet rs = sm.executeQuery(sql);
			while (rs.next()) {
				ThucDon td = new ThucDon();
				td.setID(rs.getString(1));
				td.setTen(rs.getString(2));
				td.setDonGia(rs.getString(3));
				td.setFlag(rs.getString(4));
				result.add(td);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public void deleteMon(String Flag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnw_nhom", "root", "");
			String delQuery = "DELETE FROM thucdon WHERE Flag = 0'";
			Statement statement = conn.createStatement();
			statement.executeUpdate(delQuery);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
