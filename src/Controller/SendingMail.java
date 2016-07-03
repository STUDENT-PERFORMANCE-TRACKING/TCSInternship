package Controller;


import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

//import com.sendgrid.SendGrid;
//import com.sendgrid.SendGridException;



public class SendingMail {

	private static String[] ADMIN_EMAIL = {"gorakhpurhealthok@gmail.com" ,"healthok.in@gmail.com"};
	private static String[] ADMIN_PHONE = {"9794430208", "9971931767"};
	
	

/*	
	
    public  String sendMail(String[] recipient,  String message, String subject)
    
    {
    	
    	//return StatusCode.Success;
    	
        SendGrid sendgrid = null ;
         SendGrid.Email email = new SendGrid.Email();
        String str;


        
        StringBuilder recipientList = new StringBuilder();
        
int i = 0;
        for ( String emailId : recipient )
        {
        	if ( i> 1) recipientList.append(',');
        	recipientList.append(emailId);
        	i++;
        	
        }

        
        email.addTo(recipientList.toString());
        email.setFrom("shiva280295@gmail.com");
        email.setFromName("Shiva");
        email.setSubject(subject);
        email.setHtml(message);
        

        try {
            SendGrid.Response response = sendgrid.send(email);
            str=response.getMessage();
            return "success";
          }
          catch (SendGridException e) {

        	  new Model.Logging().exception("NOTIFICATION", e.getMessage());
              return "error";
          }
        

      }
    */
    
}