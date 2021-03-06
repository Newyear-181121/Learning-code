package ny.base.net.tcp.talk;

import ny.base.常用类.myUtil.Out;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther: NewYear
 * @Date: 2020-12-04 13:36
 * @version: 0.0.1
 * @description: TalkReceive
 */
public class Service {


    private ServerSocket server;
    private Socket socket;

    private DataOutputStream dos;
    private DataInputStream dis;

    private boolean isRunning = true;

    public Service(int serverPort) {
        this(serverPort,false);
    }

    public Service(int serverPort,boolean isThread){
        try {
            server = new ServerSocket(serverPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isThread){
            while (isRunning){
                Socket csocket = getsocket();
                new Thread(new Channel(csocket)).start();
            }
        } else {
            try {
                getsocket();
                this.dos = new DataOutputStream(socket.getOutputStream());
                this.dis = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 从监听的端口获取 socket 连接。
     * @return socket 连接
     */
    public Socket getsocket(){
        try {
            Out.out("在没有客户端连接的情况下，下面的方法会阻塞主线程，直到有client端来建立连接生成了新的socket连接");
            socket  =  this.server.accept();
            Out.out("生成了新的socket连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;
    }

    //-------------------------------------------------------------------------------- socket & Console

    /**
     * 接收socket中的数据，输出到控制台
     */
    public void receiveOnConsole(){
        String data = null;
        try {
            while(true) {
                data = dis.readUTF();
                Out.out(data);          // 输出到控制台
                if (data.equals("quit") | data.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送控制台的字符串到 socket
     */
    public void sendOnConsole(){
        String data = null;
        try {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // 从控制台获取数据
                data = reader.readLine(); // 从缓冲流中读取一行数据。
                dos.writeUTF(data); // 把控制台获取到的数据输入到 套接字。
                dos.flush();        // 刷新输出流，把缓冲流中的字符强制输出到流中。
                if (data.equals("quit") | data.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送 字符串到套接字
     * @param str 需要发送的字符串
     */
    public void send(String str){
        try {
            dos.writeUTF(str); // 把控制台获取到的数据输入到 套接字。
            dos.flush();        // 刷新输出流，把缓冲流中的字符强制输出到流中。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取socket流中的字符串。
     * @return
     */
    public String receive(){
        String data = null;
        try {
            data = dis.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }


    //-------------------------------------------------------------------------------- socket & File

    /**
     * 发送文件到套接字
     * @param filename  要发送的文件的路径
     */
    public void sendFile(String filename){
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(filename));


            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                dos.write(flush, 0, len);    // 从文件输入流写到 socket 输出流。
                /**
                 *
                 * 流方向： 文件是对象，文件输入流，就是从文件输入到程序内存
                 *          socket是对象，socket输出流， 就是从程序内从输出到 socket。
                 */
            }
            dos.flush();

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从 socket 读取文件  到指定路径。
     * @param filename 文件要保存的路径。
     */
    public void receiveFile(String filename) {
        try {
            //InputStream is = new BufferedInputStream(socket.getInputStream());
            OutputStream os = new BufferedOutputStream(new FileOutputStream(filename));
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = dis.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();     // 这里要强制刷新下。
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关掉创建的连接
     */
    public void close(){
        try {
            if (dis != null) dis.close();
            if (dos != null) dos.close();
            if (socket != null ) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  数据 管道  一个
     */
    class Channel implements Runnable{

        private DataOutputStream cdos;
        private DataInputStream cdis;

        public Channel(Socket csocket) {
            try {
                cdos = new DataOutputStream(csocket.getOutputStream());
                cdis = new DataInputStream(csocket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /**
         * 接收socket中的数据，输出到控制台
         */
        public void receiveOnConsole(){
            String data = null;
            try {
                while(true) {
                    data = cdis.readUTF();
                    Out.out(data);          // 输出到控制台
                    if (data.equals("quit") | data.equals("exit")) {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * 发送控制台的字符串到 socket
         */
        public void sendOnConsole(){
            String data = null;
            try {
                while (true) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // 从控制台获取数据
                    data = reader.readLine(); // 从缓冲流中读取一行数据。
                    cdos.writeUTF(data); // 把控制台获取到的数据输入到 套接字。
                    cdos.flush();        // 刷新输出流，把缓冲流中的字符强制输出到流中。
                    if (data.equals("quit") | data.equals("exit")) {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * service 可以收到多个 client端的消息
         *  但是目前还不能往 client 发消息，控制台只有一个，但是可以程序自动处理收到的消息并返回处理的数据。
         *  只需要在 run方法中 编写逻辑代码即可。
         */
        @Override
        public void run() {
                this.receiveOnConsole();
        }
    }
}
