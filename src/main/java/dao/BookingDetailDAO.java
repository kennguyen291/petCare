package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.AppointmentNew;

import util.MySqlDBConnector;


//enum PetType {
//	DOG,
//	CAT,
//	OTHER
//}
//
//enum AppointmentType {
//	VAX,
//	CHECK,
//	SICK,
//	BOARDING
//}

public class BookingDetailDAO {
	public List<AppointmentNew> getAll(){
		List<AppointmentNew> appointmentList = new ArrayList<AppointmentNew>();
		Connection connection = MySqlDBConnector.makeConnection();
		System.out.println(connection);
		ResultSet rs = null;
		PreparedStatement ps = null;

		String sqlQuery = "SELECT * FROM `Appointment`";
		System.out.println(sqlQuery);
		try {
			ps = connection.prepareStatement(sqlQuery);
			rs = ps.executeQuery();
			
			while(rs.next() == true) {
				int id = rs.getInt("id");
				int customerId = rs.getInt("customerId");
				int doctorId = rs.getInt("doctorId");
				
				String petType = rs.getString("petType");
				String appointmentType = rs.getString("appointmentType");
				String startTime = rs.getString("startTime");
				System.out.println(customerId);
							
				AppointmentNew appointment = new AppointmentNew(id, customerId, doctorId, petType, appointmentType, startTime);
				appointmentList.add(appointment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return appointmentList;

	}

}
