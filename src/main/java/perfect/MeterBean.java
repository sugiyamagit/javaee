package perfect;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("meterBean")
@ViewScoped
public class MeterBean implements Serializable {

	public MeterBean() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private int val;

	@PostConstruct
	public void init(){
		val = 50;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}


}
