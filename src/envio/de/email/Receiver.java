/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envio.de.email;

import javax.mail.*;  
import javax.mail.internet.*;  
import java.util.*;  
import java.io.*;  
  
public class Receiver {  
  
    public static void main(String args[]) {  
        try {  
            String popServer = "pop.gmail.com"; //conferir com seu host. Habilitar o encaminhamento pop antes, senao nao funciona.  
            String popUser = "marcos.acsj";  //O email.  
            String popPassword = "Marcos180686ACSJ";  //A senha de acesso  
            boolean ssl = false;  //Se a conexao usa ou nao ssl.  
            receive(popServer, popUser, popPassword, ssl);  
        } catch (Exception ex) {  
            System.out.println("Usage: java com.lotontech.mail.SimpleReceiver" + " popServer popUser popPassword");  
        }  
        System.exit(0);  
    }  
  
    public static void receive(String popServer, String popUser, String popPassword, boolean isSsl) {  
        Store store = null;  
        Folder folder = null;  
        try {  
            // -- Get hold of the default session --  
            Properties props = System.getProperties();  
            Session session = Session.getDefaultInstance(props, null);  
            //if (isSsl) {  
                session.getProperties().put("mail.smtp.auth", "true");  
                session.getProperties().put("mail.debug", "true");  
                session.getProperties().put("mail.smtp.port", "465");  
                session.getProperties().put("mail.smtp.socketFactory.port", "995");  
                session.getProperties().put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  
                session.getProperties().put("mail.smtp.socketFactory.fallback", "false");  
                session.getProperties().put("mail.smtp.starttls.enable", "true");  
           // }  
            session.setDebug(true);
            // -- Get hold of a POP3 message store, and connect to it --  
            store = session.getStore("pop3");  
            store.connect(popServer, popUser, popPassword);  
  
            // -- Try to get hold of the default folder --  
            folder = store.getDefaultFolder();  
            if (folder == null) {  
                throw new Exception("No default folder");  
            }  
            // -- ...and its INBOX --  
            folder = folder.getFolder("INBOX");  
            if (folder == null) {  
                throw new Exception("No POP3 INBOX");  
            }  
            // -- Open the folder for read only --  
            folder.open(Folder.READ_ONLY);  
            // -- Get the message wrappers and process them --  
            Message[] msgs = folder.getMessages();  
            for (int msgNum = 0; msgNum < msgs.length; msgNum++) {  
                printMessage(msgs[msgNum]);  
            }  
        } catch (Exception ex) {  
            ex.printStackTrace();  
        } finally {  
            // -- Close down nicely --  
            try {  
                if (folder != null) {  
                    folder.close(false);  
                }  
                if (store != null) {  
                    store.close();  
                }  
            } catch (Exception ex2) {  
                ex2.printStackTrace();  
            }  
        }  
    }  
  
    public static void printMessage(Message message) {  
        try {  
            // Get the header information  
            String from = ((InternetAddress) message.getFrom()[0]).getPersonal();  
            if (from == null) {  
                from = ((InternetAddress) message.getFrom()[0]).getAddress();  
            }  
            System.out.println("FROM: " + from);  
            String subject = message.getSubject();  
            System.out.println("SUBJECT: " + subject);  
            Date dataa = message.getReceivedDate();  
            System.out.println("Numero da MSG: " + message.getMessageNumber());  
            System.out.println("Recebido em: " + dataa);  
            // -- Get the message part (i.e. the message itself) --  
            Part messagePart = message;  
            Object content = messagePart.getContent();  
            // -- or its first body part if it is a multipart message --  
            if (content instanceof Multipart) {  
                messagePart = ((Multipart) content).getBodyPart(0);  
                System.out.println("[ Multipart Message ]");  
            }  
            // -- Get the content type --  
            String contentType = messagePart.getContentType();  
            // -- If the content is plain text, we can print it --  
            System.out.println("CONTENT:" + contentType);  
            if (contentType.startsWith("text/plain") || contentType.startsWith("text/html")) {  
                InputStream is = messagePart.getInputStream();  
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));  
                String thisLine = reader.readLine();  
                while (thisLine != null) {  
                    System.out.println(thisLine);  
                    thisLine = reader.readLine();  
                }  
            }  
            System.out.println("-----------------------------");  
        } catch (Exception ex) {  
            ex.printStackTrace();  
        }  
    }  
}  
