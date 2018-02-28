package samplejdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sample.Message;

public class sampleJDBC {

	private Statement dataSource;

	public List<Message> findAll(){
		List<Message> messages = new ArrayList<>();

		try (Connection connection = dataSource.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT id , message FROM message")){
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()){
						messages.add(new Message(rs.getLong("id") , rs.getString("message")));
					}
				}
		}catch (SQLException e) {
			//例外ハンドリング
		}
		return messages;
	}
}
