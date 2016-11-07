package wl.hdzj.service;


/**
 * 反馈消息
 * @author lipengbiao
 */
public class MessageVO {
    private int status;
    private String message;
    private String detail;

    public MessageVO() {
        super();
    }

    public MessageVO(int s, String m, String d){
        this.status = s;
        this.message = m;
        this.detail = d;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
