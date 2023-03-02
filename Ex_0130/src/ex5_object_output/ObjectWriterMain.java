package ex5_object_output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterMain {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("ȫ�浿");
		p.setAge(20);
		
		String path = "C:\\embedded_kmz\\person.sav";
		
		// ��ü�� ��°�� ����ϴµ�����ϴ� ouput stream
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p); //Person��ü�� ����
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				
				oos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
	}//main
}
