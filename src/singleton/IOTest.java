package singleton;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOTest {
	private static IOTest ioTest = null;	
	public static IOTest getInstance(){	
		if(ioTest == null){
			ioTest = new IOTest();
		}
		return ioTest;
	}
	private String data = "";
	private IOTest(){
		File file = new File("D:\\helloworld.txt");
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try {
			FileReader reader = new FileReader(file);
			
			char[] bb = new char[1024];
			String str = "";
			int n;
			while((n = reader.read(bb)) != -1){
				str += new String(bb,0,n);
			}
			reader.close();
			data = str;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getData(){
		return data;
	}
	public void setData(String str){
		File file = new File("D:\\helloworld.txt");// Ҫд����ı��ļ�  
        if (!file.exists()) {// ����ļ������ڣ��򴴽����ļ�  
            try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
        }  
        FileWriter writer;
		try {
			writer = new FileWriter(file);
			writer.write(str);// д����  
			writer.flush();// ��ջ�������������������������д���ļ���  
			writer.close();// �ر��������ʩ����Դ
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// ��ȡ���ļ��������  
		this.data = str;
	}
}
