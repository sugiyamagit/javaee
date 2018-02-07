package perfect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("employeeBean")
@ViewScoped
public class EmployeeBeen implements Serializable{

	public EmployeeBeen() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private List<Employee> listEmp;

	@PostConstruct
	public void init(){
		listEmp = Arrays.asList(
				new Employee(1,"山田太郎"),
				new Employee(2,"山田花子")
		);

	}

	public List<Employee> getListEmp() {
		return listEmp;
	}

	public void setListEmp(List<Employee> listEmp) {
		this.listEmp = listEmp;
	}



}
