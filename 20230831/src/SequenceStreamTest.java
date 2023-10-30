import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		SequenceInputStream sis = null;
		Vector<InputStream> v = new Vector<>();
		try {
			v.add(new FileInputStream("news.txt"));
			v.add(new FileInputStream("test.txt"));
			sis = new SequenceInputStream(v.elements());
			fos = new FileOutputStream("total.txt");
			byte[] buff = new byte[1024];
			int len = 0;
			while ((len = sis.read(buff)) > 0) {
				fos.write(buff, 0, len);

			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (sis != null)
					sis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
