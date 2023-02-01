package entity;


public class AppointmentNew {

	private int id;
	private int customerId;
	private int doctorId;
	private String petType;
	private String appointmentType;
	private String startTime;
	
	
	public AppointmentNew() {
		super();
	
	}
	

	
	public AppointmentNew(int id, int customerId, int doctorId, String petType, String appointmentType,
			String startTime) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.doctorId = doctorId;
		this.petType = petType;
		this.appointmentType = appointmentType;
		this.startTime = startTime;
	}
	
	public AppointmentNew(int id) {
		super();
		this.id = id;

	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
	    return "AppointmentNew [id=" + id + ", customerId=" + customerId + ", doctorId=" + doctorId + ", petType=" + petType + ", appointmentType=" + appointmentType + ", startTime=" + startTime + "]";
	}
	

}
