package tn.spring.pispring.dto;


import org.springframework.web.multipart.MultipartFile;

public class EmailDto {
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private  String to;
    private String subject;
    private String text;

}
