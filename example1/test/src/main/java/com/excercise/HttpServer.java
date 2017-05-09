package com.excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class HttpServer {

	ServerSocket serverSocket;

	public HttpServer() throws Exception {
		serverSocket = new ServerSocket(5000);

	}

	public void start() {
		try {
			while (true) {
				try {
					Socket socket;
					socket = serverSocket.accept();
					handleRequest(socket);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void handleRequest(final Socket socket) {
		new Thread(Math.random() * 100 + "") {
			public void run() {
				try {

					System.out.println("Thread serving this request ::" + this.getName());
					InputStream stream = socket.getInputStream();
					OutputStream outputstream = socket.getOutputStream();

					BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
					String output = new String();
					int count = 0;
					StringBuilder builder = new StringBuilder();

//					while (!(output).equals("")) {
//						output = reader.readLine();
//						builder.append(output);
//						builder.append("\n");
//					}
//					System.out.println("Input from client.."+builder);
//					
					byte[] array=new byte[stream.available()];
					int i=1;
					while ((i=stream.read(array))>0){
						output=new String(array);
						System.out.println(output);
						array=new byte[stream.available()];
					}
					
					String s[]=output.split("\n");

					System.out.println(Arrays.toString(s));

					outputstream.write(new String("welcome to port 5000").getBytes());
					reader.close();
					outputstream.flush();
					stream.close();
					// outputstream.close();
					// socket.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			};
		}.start();
	}

	public static void main(String[] args) throws Exception {

		new HttpServer().start();
	}

}
