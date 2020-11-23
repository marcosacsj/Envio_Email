/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envio.de.email;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author marcos.junior
 */
public class EnvioEmail {
    public static void EnvioEmailSimples(String UsuarioEmail,String SenhaEmail,String ServidorSMTP,boolean SSL,boolean TSL,
                                  String Remetente,String[] destinatario,String Assunto,String Mensagem){
         
        int numDescinatarios = destinatario.length;
        int i=0;
        while(i<numDescinatarios){
            System.out.println(destinatario[i]);    
            SimpleEmail  email = new SimpleEmail  (); 
            try {  
                email.setDebug(true); 
                email.setSmtpPort(587);
                email.setHostName(ServidorSMTP); 
                email.setAuthentication(UsuarioEmail,SenhaEmail);  
                email.setSSL(SSL);
                email.setTLS(TSL);
                //while(i<=numDescinatarios){
                    email.addTo(destinatario[i]); //pode ser qualquer um email  
                    email.setFrom(Remetente); //aqui necessita ser o email que voce fara a autenticacao  
                    email.setSubject(Assunto);  
                    email.setMsg(Mensagem); 
                    email.send();  
                //}
            } catch (EmailException e) {  
            System.out.println(e.getMessage());  
            }
            i++;
        }
    }
    public static void EnvioEmailComAnexo(String UsuarioEmail,String SenhaEmail,String ServidorSMTP,boolean SSL,boolean TSL,
                                  String Remetente,String[] destinatario,String Assunto,String Mensagem,String[] Anexo,String[] DescAnexo){
        
    }
}
