package imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbcon.dbcon;

import bean.clientformbean;
import bean.clientregbean;
import bean.deliverybean;
import bean.uploadbean;
import inter.inter;

public class imple implements inter{
	Connection con;
	@Override
	public int reg(clientregbean cb) {
		int u=0;
		try{
			con=dbcon.create();	
			PreparedStatement ps = con.prepareStatement("INSERT INTO transport.clientreg VALUES(?,?,?,?)");
			ps.setString(1, cb.getName());
			ps.setString(2, cb.getEmail());
			ps.setString(3, cb.getPass());
			ps.setString(4, cb.getCpass());
            u=ps.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return u;
	}
	@Override
	public boolean log(clientregbean lb) {
		boolean b=false;
		try
		{
		
			con=dbcon.create();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM transport.clientreg where email=? and pass=?");
			ps.setString(1, lb.getEmail());
			ps.setString(2, lb.getPass());
			
			ResultSet rs=ps.executeQuery();
			b=rs.next();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
		
	}
	@Override
	public int form(clientformbean cb) {
		int u=0;
		try{
			con=dbcon.create();	
			PreparedStatement ps = con.prepareStatement("INSERT INTO transport.clientform VALUES(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, cb.getName());
			ps.setString(2, cb.getEmail());
			ps.setString(3, cb.getCnumber());
			ps.setString(4, cb.getFaddress());
			ps.setString(5, cb.getFdistrict());
			ps.setString(6, cb.getFstate());
			ps.setString(7, cb.getTaddress());
			ps.setString(8, cb.getTdistrict());
			ps.setString(9, cb.getTstate());
			ps.setString(10, cb.getWeight());
			ps.setString(11, cb.getDate());
			ps.setString(12, " ");
			ps.setString(13, "packed");
			ps.setString(14, " ");
			
			u=ps.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return u;
	}
	@Override
	public int dreg(deliverybean db) {
		int u=0;
		try{
			con=dbcon.create();	
			PreparedStatement ps = con.prepareStatement("INSERT INTO transport.delivery VALUES(?,?,?,?)");
			ps.setString(1, db.getName());
			ps.setString(2, db.getTaddress());
			ps.setString(3, db.getPass());
			ps.setString(4, db.getCpass());
            u=ps.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return u;
	}
	@Override
	public boolean dlog(deliverybean lb) {
		boolean b=false;
		try
		{
		
			con=dbcon.create();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM transport.delivery where taddress=? and pass=?");
			ps.setString(1, lb.getTaddress());
			ps.setString(2, lb.getPass());
			
			ResultSet rs=ps.executeQuery();
			b=rs.next();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
		
	}
	@Override
	public int upload(uploadbean ub) {
		int u=0;
		try{
			con=dbcon.create();	
			PreparedStatement ps = con.prepareStatement("INSERT INTO transport.upload VALUES(id,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, ub.getEmail());
			ps.setString(2, ub.getFilename());
			ps.setString(3, ub.getFiletype());
			ps.setString(4, ub.getFilesize());
			ps.setString(5, ub.getFilecontent());
			ps.setString(6, ub.getEncrypt());
			ps.setString(7, ub.getDecrypt());
			ps.setString(8, ub.getDetail());
			ps.setString(9, ub.getFkey());
            u=ps.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return u;
	}
}
	

