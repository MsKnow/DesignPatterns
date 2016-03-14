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
		File file = new File("D:\\helloworld.txt");// 要写入的文本文件  
        if (!file.exists()) {// 如果文件不存在，则创建该文件  
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
			writer.write(str);// 写内容  
			writer.flush();// 清空缓冲区，立即将输出流里的内容写到文件里  
			writer.close();// 关闭输出流，施放资源
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 获取该文件的输出流  
		this.data = str;
	}
}
