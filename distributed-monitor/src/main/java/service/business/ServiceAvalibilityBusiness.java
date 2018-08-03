package service.business;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.model.Serviceprovider;

public class ServiceAvalibilityBusiness{
	public static List<Serviceprovider> getAviliableService() {
		// TODO Auto-generated method stub
		String sql="SELECT  * from serviceprovider";
		DBHelper dbhelper = new DBHelper(sql);
		List<Serviceprovider> list = new ArrayList<Serviceprovider>();
		Serviceprovider sp;
		try {
			ResultSet rs = dbhelper.pst.executeQuery();
			while(rs.next()){
				sp = new Serviceprovider();
				sp.setCluster(rs.getString("cluster"));
				sp.setServicename(rs.getString("servivename"));
				sp.setNumberofavaliable(rs.getInt("numberofavaliable"));
				sp.setState(rs.getString("state"));
				list.add(sp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbhelper.close();
		}
		return list;
	}

}
