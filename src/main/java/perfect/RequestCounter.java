package perfect;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named("requestCounter")
@ViewScoped
public class RequestCounter implements Serializable{

	public RequestCounter() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private int count;

	@PostConstruct
	private void init(){
		System.out.println("CDI管理Beanの初期化");
		count = 0;
	}

	@PreDestroy
	private void fin(){
		System.out.println("CDI管理Beanの破棄");
	}

	public void increment(){
		count++;
	}

	public int getCount(){
		return count;
	}
}
