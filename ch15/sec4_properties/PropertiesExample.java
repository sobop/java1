package ch15.sec4_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

/*
 * 설정 정보를 읽어오거나 저장할 때 : Properties
 * - load : 파일에서 정보를 읽어 올 때
 * - save : Properties 객체에 있는 정보를 파일에 저장
 */
public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		// getResource() : class 파일을 기준으로 파일의 경로를 읽어올 때
		String path = PropertiesExample.class.
				getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");	// 파일 경로에 대한 한글 처리
		properties.load(new FileReader(path));		// properties에 읽는다.
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}
