package perfect;

import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.context.FacesContext;

public class Component {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		UIComponent lbl = FacesContext.getCurrentInstance().getViewRoot().findComponent("lbl");
		if( lbl  != null && lbl instanceof HtmlOutputLabel){
			System.out.println(((HtmlOutputLabel)lbl).getValue());
		}
	}

}
