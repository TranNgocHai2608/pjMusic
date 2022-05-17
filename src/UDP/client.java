package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class client {
        public static int buffsize = 512 ;
        public static int desPort = 1234;
        public static String hostname = "localhost";
        public static void main (String [] args) {
                DatagramSocket socket;
                DatagramPacket dpreceive, dpsend;
                InetAddress add;
                Scanner stdIn;
                try{
                        add = InetAddress.getByName(hostname);
                        socket = new DatagramSocket();
                        stdIn = new Scanner(System.in);
                        while (true){
                                System.out.println("Client input: ");
                                String tmp = stdIn.nextLine();
                                boolean checkinput = true;
                                        while (true){
                                                if(checkinput==true){
                                                      Pattern p = Pattern.compile("^[A-Za-z0-9ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]+$");
                                                      Matcher m = p.matcher(tmp);
                                                      checkinput = m.find();
                                                       if(checkinput == true){
                                                               System.out.println("hợp lệ");
                                                       }
                                                       else{
                                                               System.out.println("vui lòng không nhập ký tự đặc biệt");
                                                       }
                                                }
                                                break;
                                        }

                                        byte[] data = tmp.getBytes();
                                        dpsend = new DatagramPacket(data, data.length, add, desPort);
//                                        System.out.println("Client sent " + tmp + "to" + add.getHostAddress() + "form port" + socket.getLocalPort());
                                        socket.send(dpsend);
                                        if(tmp.equals("bye")){
                                                System.out.println("Client socket closed");
                                                stdIn.close();
                                                socket.close();
                                                break;
                                        }
                                        // nhận từ server
                                        dpreceive = new DatagramPacket(new byte[512],512);
                                        socket.receive(dpreceive);
                                        tmp = new String(dpreceive.getData(), 0, dpreceive.getLength());
                                        System.out.println("Client get: " + tmp +" form server");
                                }
                }
                catch(IOException e) {
                        System.err.println(e);
                }
        }
}
