import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		FileReader fis = null;
		BufferedReader br = null;
		try {
			fis = new FileReader("news.txt");
			br = new BufferedReader(fis);
			int data;
			while ((data = br.read()) != -1) {
				System.out.print((char) data);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
//안깨진다