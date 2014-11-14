package TCP;

import java.net.*;
import java.io.*;
public class TcpClient {

	public static void main(String[] args) throws Exception {
		try{
			Socket s = new  Socket("127.0.0.1", 6666); 		//127.0.0.1�Ǳ���IP��ַ
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF("hello server");
			dos.flush();
			dos.close();
			s.close();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("�������г���" + e);
		}
	}
}
