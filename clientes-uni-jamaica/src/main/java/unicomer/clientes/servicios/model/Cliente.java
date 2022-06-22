package unicomer.clientes.servicios.model;

import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
*
* @author DIEGO_CELERY@MIMAIL.COM
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente {

	@JsonProperty("id")
	private Long id = null;
	
	@JsonProperty("firstName")
	private String firstName = null;
	
	@JsonProperty("lastName")
	private String lastName = null;

	@JsonProperty("birthday")
	private LocalDate birthday = null;
	
	@JsonProperty("gender")
	private String gender = null;
	
	@JsonProperty("cellphone")
	private Integer cellphone = null;
	
	@JsonProperty("homephone")
	private Integer homephone = null;
	
	@JsonProperty("addressHome")
	private String addressHome = null;
	
	@JsonProperty("profession")
	private String profession = null;
	
	@JsonProperty("incomes")
	private Integer incomes = null;
	
	
	@JsonProperty("success")
	private String success = null;
	
	@JsonProperty("failmessage")
	private String failmessage = null;
		
	
	public Cliente(){		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getCellphone() {
		return cellphone;
	}

	public void setCellphone(Integer cellphone) {
		this.cellphone = cellphone;
	}

	public Integer getHomephone() {
		return homephone;
	}

	public void setHomephone(Integer homephone) {
		this.homephone = homephone;
	}

	public String getAddressHome() {
		return addressHome;
	}

	public void setAddressHome(String addressHome) {
		this.addressHome = addressHome;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Integer getIncomes() {
		return incomes;
	}

	public void setIncomes(Integer incomes) {
		this.incomes = incomes;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getFailmessage() {
		return failmessage;
	}

	public void setFailmessage(String failmessage) {
		this.failmessage = failmessage;
	}
	
	
	
	
}
