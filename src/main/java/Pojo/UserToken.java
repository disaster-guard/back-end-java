package Pojo;

public class UserToken {
    String access_token;

    String token_type;

    int expires_in;

    public UserToken(String access_token) {
        this.access_token = access_token;
        this.token_type = "*";
        this.expires_in = 1000;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }
}