
package ttto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Client extends JFrame_Start{
        private int Port;
        private Socket clientSocket;
        private ServerSocket serverSocket;
        private BufferedReader in;
        private PrintWriter out;

        private String nama;
        private String namaL = "null";
        private String temp;
        private String ip;

    public Client(String ip, String port, String nama){
        this.nama = nama;
        this.ip = ip;
        try{
            Port = Integer.parseInt(port);
      
        }catch(NumberFormatException e){}
            System.out.println("Port : " + port + "\nNama : " + nama + "\nIP : " + ip);
            connect();
         
    }
    private void back(){
        this.dispose();
        super.setVisible(true);
    }
    protected void connect(){
        try{
            clientSocket = new Socket(InetAddress.getByName(ip),Port);
            this.out = new PrintWriter(clientSocket.getOutputStream(), true);
            this.in =  new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }catch(SocketException e){
            System.out.println("Error : " + e);
            back();
        }catch(IOException u){
            JFrame_Board Board = new JFrame_Board(in, out, nama, namaL);
            Board.waiting(false);
            Board.setPanel();
            Board.setInput(in, out, nama, namaL, "O");
            Board.setScore();
            InputL(Board);
            sendNama();
            RNama();
        }
    }
    private void InputL(JFrame_Board Board){
       new Thread(){ 
            public void run(){
                Board.accept = true;
                while(true){
                try{
                    temp = in.readLine();
                }catch(IOException e){}
                System.out.println("Terima : " + temp);
                    if(      temp.equalsIgnoreCase("1_1")){
                        Board.satu = false;
                        Board.waiting(true);
                        Board.jButtonB_1_1.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("1_2")){
                        Board.dua = false;
                        Board.waiting(true);
                        Board.jButtonB_1_2.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("1_3")){
                        Board.tiga = false;
                        Board.waiting(true);
                        Board.jButtonB_1_3.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("2_1")){
                        Board.empat = false;
                        Board.waiting(true);
                        Board.jButtonB_2_1.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("2_2")){
                        Board.lima = false;
                        Board.waiting(true);
                        Board.jButtonB_2_2.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("2_3")){
                        Board.enam = false;
                        Board.waiting(true);
                        Board.jButtonB_2_3.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("3_1")){
                        Board.tuju = false;
                        Board.waiting(true);
                        Board.jButtonB_3_1.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("3_2")){
                        Board.delapan = false;
                        Board.waiting(true);
                        Board.jButtonB_3_2.setText("X");
                        Board.setTrun("Kamu");
                        Board.MenentukanPemenang();
                        Board.tieGame();
                    }else if(temp.equalsIgnoreCase("3_3")){
                        Board.sembilan = false;
                        Board.waiting(true);
                        Board.jButtonB_3_3.setText("X");
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
