/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envio.de.email;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author marcos.junior
 */
public class EnvioDeEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        TelaTeste abrir = new TelaTeste();
        abrir.setVisible(true);
        


//        int porta=25;
//        SimpleEmail email = new SimpleEmail();  
//        email.setHostName("smtp.mail.yahoo.com"); // o servidor SMTP para envio do e-mail  
//        email.setDebug(true);
//        email.addTo("marcosacsj@yahoo.com.br"); //destinatário  
//        email.setFrom("marcos.acsj@gmail.com"); // remetente  
//        email.setSubject("Teste -> Email simples"); // assunto do e-mail  
//        email.setMsg("Teste de Email utilizando commons-email"); //conteudo do e-mail  
//        email.setAuthentication("marcosacsj@yahoo.com.br", "060958");  
//        
//       // email.setSmtpPort(porta);  
//       // email.setSSL(true);  
//        email.setTLS(true);  
//        email.send();
        EmailAttachment[] attachment ;
//        attachment.setPath("E:\\Desenvolvimento Java\\Bibliotecas\\1349977296_iReport-4.7.1-plugin.zip"); //caminho da imagem 
//        attachment.setDisposition(EmailAttachment.ATTACHMENT); 
//        attachment.setDescription("Ativacao Java"); attachment.setName("1349977296_iReport-4.7.1-plugin.zip");
//        EmailAttachment attachment1 = new EmailAttachment();
//        attachment1.setPath("E:\\Desenvolvimento Java\\Bibliotecas\\Email\\activation.jar"); //caminho da imagem 
//        attachment1.setDisposition(EmailAttachment.ATTACHMENT); 
//        attachment1.setDescription("Ativacao Java"); attachment1.setName("activation.jar");   
//
//        
//        MultiPartEmail email = new MultiPartEmail ();  
//  
//        try {  
//        email.setDebug(true); 
//        email.setSmtpPort(587);
//        email.setHostName("smtp.mail.yahoo.com"); 
//        
//        email.setAuthentication("marcosacsj@yahoo.com.br","060958");  
//        email.setSSL(false);
//        email.setTLS(true);
//        email.addTo("marcos.acsj@gmail.com","Teste"); //pode ser qualquer um email  
//        email.setFrom("marcosacsj@yahoo.com.br","MJ Tecnologia"); //aqui necessita ser o email que voce fara a autenticacao  
//        email.setSubject("Teste");  
//        email.setMsg("Mensagem Testando"); 
//        //email.attach(attachment);
//        //email.attach(attachment1);
//        email.send();  
//  
//        } catch (EmailException e) {  
//  
//        System.out.println(e.getMessage());  
//  
//        }   
//        
//       HtmlEmail email = new HtmlEmail(); 
//       email.setDebug(true); 
//       email.setSmtpPort(587);
//       email.setHostName("smtp.mail.yahoo.com"); 
//        
//       email.setAuthentication("marcosacsj@yahoo.com.br","060958"); 
//       email.addTo("marcos_acsj@live.com", "John Doe"); 
//       email.setFrom("marcosacsj@yahoo.com.br", "Me"); 
//       email.setSubject("Teste de e-mail em formato HTML");   
//// adiciona uma imagem ao corpo da mensagem e retorna seu id 
//       URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif"); 
//       String cid = email.embed(url, "Apache logo");  
//       // configura a mensagem para o formato HTML 
//       email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");   
//               // configure uma mensagem alternativa caso o servidor não suporte HTML 
//       email.setTextMsg("Seu servidor de e-mail não suporta mensagem HTML");   
//// envia o e-mail 
//       email.send();


        
//        Properties props = new Properties();
//            /** Parâmetros de conexão com servidor Yahoo */
//            props.put("mail.smtp.host", "smtp.mail.yahoo.com");
//            props.put("mail.smtp.socketFactory.port", "465");
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.port", "25");
//
//            Session session = Session.getDefaultInstance(props,
//                        new javax.mail.Authenticator() {
//                             protected PasswordAuthentication getPasswordAuthentication() 
//                             {
//                                   return new PasswordAuthentication("marcosacsj@yahoo.com.br", "060958");
//                             }
//                        });
//
//            /** Ativa Debug para sessão */
//            session.setDebug(true);
//
//            try {
//
//                  Message message = new MimeMessage(session);
//                  message.setFrom(new InternetAddress("marcosacsj@yahoo.com.br")); //Remetente
//
//                  message.setRecipients(Message.RecipientType.TO, 
//                                    InternetAddress.parse("marcosacsj@yahoo.com.br")); //Destinatário(s)
//                  message.setSubject("Enviando email com JavaMail");//Assunto
//                  message.setText("Enviei este email utilizando JavaMail com minha conta Yahoo!");
//                  /**Método para enviar a mensagem criada*/
//                  Transport.send(message);
//
//                  System.out.println("Feito!!!");
//
//             } catch (MessagingException e) {
//                  throw new RuntimeException(e);
//            }
      }




    
    
}
