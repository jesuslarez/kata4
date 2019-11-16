
package kata4.model;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    public String getDomain(){
        return this.mail.substring(this.mail.indexOf("@")+1);
    }
    public static boolean isMail(String lines){
        return lines.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
    
}
