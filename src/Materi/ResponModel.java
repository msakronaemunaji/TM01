package Materi;

public class ResponModel {

    String msg;
    String status;
    String comment;

    public ResponModel(String msg, String status, String comment) {
        this.msg = msg;
        this.status = status;
        this.comment = comment;
    }

    public ResponModel() {

    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }




}
