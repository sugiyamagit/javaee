package perfect;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Files;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named("uploadBean")
@RequestScoped
public class UploadBean implements Serializable {
	//アップロードされたファイルデータを格納
	private Part part;

	//アップロードデータをファイルへ格納
	public void upload(){
		try(InputStream is = part.getInputStream()){
			try {
				Files.copy(is,FileSystems.getDefault().getPath(part.getSubmittedFileName()));
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
	}

	public UploadBean() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}


}
