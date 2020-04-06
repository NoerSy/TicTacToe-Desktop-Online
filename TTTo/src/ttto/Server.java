
package ttto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends JFrame_Start{
        private int Port;
        private Socket clientSocket;
        private ServerSocket serverSocket;
        private BufferedReader in;
        private PrintWriter out;
        private String temp;

        private String nama;
        private String namaL = "null";
        private String ip;
        
    public Server(String port, String nama,String ip){
        this.nama = nama;
        this.ip = ip;
        System.out.println("Port : " + port + "\nNama : " + nama);
        try{
            this.Port = Integer.parseInt(port);
        }catch(NumberFormatException e){
            System.out.println("Exception Port : " + e);
        }
        initializeServer();
        JFrame_Board Board = new JFrame_Board(in, out, nama, namaL);
        setS(Board);
    }
    private void back(){
        try{
            serverSocket.close();
            in.close();
            out.close();
        }catch(IOException e) {
            e.printStackTrace(); 
        }
        this.dispose();
        super.setVisible(true);
    }
    private void backL(){
        try{
            serverSocket.close();
        }catch(IOException e) {
            e.printStackTrace(); 
        }
        this.dispose();
        super.setVisible(true);  
    }
    private void initializeServer(){
            try{
		this.serverSocket = new ServerSocket(Port, 1, InetAddress.getByName(ip));

                System.out.println("Listen at port " + Port + ".");
            }catch(IOException e){
                
            }
	}
    private void WaitingClient(){
        try{
            this.clientSocket = this.serverSocket.accept();
            this.out = new PrintWriter(clientSocket.getOutputStream(), true);
            this.in =  new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Accept clinet");
        }catch(IOException e){}
            sendNama();
            RNama();
    }
    private void setS(JFrame_Board Board){
       new Thread(){
           public void run(){
               while(true){
                    if(Board.exit()){
                        Board.dispose();
                        backL();
                        break;
                    }
               }
           }}.start();  
       new Thread(){ 
            public void run(){
                WaitingClient();
                Board.accept = true;
                Board.setPanel();
                Board.setInput(in, out, nama, namaL, "X");
                Board.setScore();
                while(true){
                try{
                    if(Board.exit()){
                        backL();
                        break;
                    }
                    temp = in.readLine();
                }catch(IOException e){}
                System.out.println("Terima : " + temp);
                    if(      temp.equalsIgnoreCase("1_1")){
                        Board.satu = false;
                        Board.waiting(true);
                        Board.setTrun("Kamu");
                        Board.jButtonB_1_1.setText("O");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("1_2")){
                        Board.dua = false;
                        Board.waiting(true);
                        Board.setTrun("Kamu");
                        Board.jButtonB_1_2.setText("O");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("1_3")){
                        Board.tiga = false;
                        Board.waiting(true);
                        Board.jButtonB_1_3.setText("O");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("2_1")){
                        Board.empat = false;
                        Board.waiting(true);
                        Board.jButtonB_2_1.setText("O");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("2_2")){
                        Board.lima = false;
                        Board.waiting(true);
                        Board.jButtonB_2_2.setText("O");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("2_3")){
                        Board.enam = false;
                        Board.waiting(true);
                        Board.jButtonB_2_3.setText("O");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("3_1")){
                        Board.tuju = false;
                        Board.waiting(true);
                        Board.jButtonB_3_1.setText("O");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("3_2")){
                        Board.delapan = false;
                        Board.waiting(true);
                        Board.jButtonB_3_2.setText("O");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("3_3")){
                        Board.sembilan = false;
                        Board.waiting(true);
                        Board.jButtonB_3_3.setText("O");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }
                    else if(temp.equalsIgnoreCase("Exit!")){
                        out.println("Exit!");
                        Board.dispose();
                        back();
                        break;
                    }
                }
            }}.start();  
    }
    private void sendNama(){
        try{
            this.out.println(nama);
            System.out.println("Kirim nama : " + nama);
        }catch(Exception e){
            
        }
    }
    private void RNama(){
        try{
            this.namaL = this.in.readLine();
            System.out.println("terima nama : " + this.namaL);            
        }catch(Exception e){
            
        }
    }
}

