package assignments.data;

public class UserCreationResponseDetails {
    private int code;
    private String type;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //overide tostring method to print object in string format
    @Override
    public String toString() {
        return
                "code: " + code + "\n" +
                        "type: " + type + "\n" +
                        "message: " + message + "\n" ;
    }

}
