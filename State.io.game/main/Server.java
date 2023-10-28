package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
	public static ArrayList<String> entrantName = new ArrayList<>();
	private static ArrayList<PrintWriter> writers = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		System.out.println("Running :)");
		ServerSocket listener = new ServerSocket(9000);
		try {
			// waiting for clients to connect
			while (true) {
				new Handler(listener.accept()).start();
			}
		} finally {
			listener.close();
		}
	}

	// a handler thread class
	private static class Handler extends Thread {
    Scanner s = new Scanner(System.in);
		private String name;
		private Socket socket;
		private BufferedReader in;
		private PrintWriter out;

		// set socket
		public Handler(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				// set reader and writer
				in = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);

				// request name from client
				while (true) {
					out.println("SUBMIT-NAME");
					name = s.nextLine();
					break;
				}
				writers.add(out);
				broadcast("JOINED");

				// receive messages
				while (true) {
					String input = in.readLine();
					if (input == null)
						return;
					broadcast("MESSAGE" + name + ": " + input);
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			} finally {
				// connection lost
				System.out.println(name + " has left");
				broadcast("LEFT" + name);

				// remove name and writer of this client
				if (name != null)
					entrantName.remove(name);
				if (out != null)
					writers.remove(out);
				try {
					socket.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				}
			}
		}

		// write in all clients pages
		public void broadcast(String s) {
			for (PrintWriter myWriter : writers)
				myWriter.println(s);
		}
	}

  
}
