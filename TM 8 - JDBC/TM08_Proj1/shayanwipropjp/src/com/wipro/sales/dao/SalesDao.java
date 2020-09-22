package com.wipro.sales.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.util.DBUtil;

public class SalesDao {

	public int insertSales(Sales sales) {
		Connection conn = null;
		PreparedStatement statement = null;
		String sql = "INSERT INTO TBL_SALES VALUES(?, ?, ?, ?, ?)";
		

		java.sql.Date sqlDate = new java.sql.Date(sales.getSalesDate().getTime());
		
		try {
			conn = DBUtil.getDBConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, sales.getSalesID());
			statement.setDate(2, sqlDate);
			statement.setString(3, sales.getProductID());
			statement.setInt(4, sales.getQuantitySold());
			statement.setDouble(5, sales.getSalesPricePerUnit());
			
			if (statement.executeUpdate() == 1) return 1;
			else return 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public String generateSalesID(Date salesDate) {		
		Connection conn = null;
		PreparedStatement statement = null;
		String sql = "SELECT SEQ_SALES_ID.NEXTVAL FROM DUAL";
		
		int SEQ_SALES_ID = 0;
		String out = salesDate.toString().substring(salesDate.toString().length()-2, salesDate.toString().length());
		
		try {
			conn = DBUtil.getDBConnection();
			statement = conn.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			rs.next();
			SEQ_SALES_ID = rs.getInt(1);
			
			out += SEQ_SALES_ID;
			return out;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}

	public ArrayList<SalesReport> getSalesReport() {
		Connection conn = null;
		PreparedStatement statement = null;
		String sql = "SELECT * FROM V_SALES_REPORT";
		
		ArrayList<SalesReport> list = new ArrayList<SalesReport>();
		
		try {
			conn = DBUtil.getDBConnection();
			statement = conn.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				SalesReport salesReport = new SalesReport();
				salesReport.setSalesID(rs.getString(1));
				salesReport.setSalesDate(rs.getDate(2));
				salesReport.setProductID(rs.getString(3));
				salesReport.setProductName(rs.getString(4));
				salesReport.setQuantitySold(rs.getInt(5));
				salesReport.setProductUnitPrice(rs.getDouble(6));
				salesReport.setSalesPricePerUnit(rs.getDouble(7));
				salesReport.setProfitAmount(rs.getDouble(8));
				list.add(salesReport);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
}
