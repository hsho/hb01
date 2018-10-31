package othertest;

import java.io.IOException;
import java.io.Reader;

public class LobCreatorTest {
	public void test() throws IOException {
		byte[] bytes = new byte[2];
		org.hibernate.Hibernate hb = null;
		//org.hibernate.Hibernate.createBlob(stream);
		//org.hibernate.Hibernate.getLobCreator(null);
		//org.hibernate.engine.jdbc.StreamUtils su = null;
		//int siz = org.hibernate.engine.jdbc.StreamUtils.DEFAULT_CHUNK_SIZE;
		Reader reader = null;
		reader = new Reader() {
			@Override
			public int read(char[] cbuf, int off, int len) throws IOException {
				return 0;
			}
			
			@Override
			public void close() throws IOException {
			}
		};
		reader.read(new char[0]);
		System.out.println(bytes.toString());
		System.out.println(hb);
//		System.out.println(siz);
//		System.out.println(su);
	}
}
