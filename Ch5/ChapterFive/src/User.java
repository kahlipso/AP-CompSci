public class User
{
    private int passwordChange;
    private String uid, password;
    public User()
    {
        passwordChange = 0;
        this.uid = "xddff15@gmail.com";
        this.password = "123abc";
    }
    public User(String uid, String password)
    {
        passwordChange = 0;
        this.uid = uid;
        this.password = password;
    }

    public void advanceDay()
    {
        passwordChange++;
    }


    public String getPassword() {
        return password;
    }

    public boolean isValidUsername()
    {
        if(uid.indexOf('@') > 0 && uid.indexOf('@') < uid.length()-4)
        {
            if(uid.substring(uid.length()-4, uid.length()).equals(".com"))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isValidPassword()
    {
        if(password.length() >= 8)
        {
            if(password.substring(0, 1).equals(password.substring(0,1).toUpperCase()))
            {
                if(password.charAt(password.length()-1) >= 48 && password.charAt(password.length()-1) <= 57)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkPassword()
    {
        if(passwordChange <= 180)
        {
            return false;
        }
        return false;
    }
    public void setPassword(String password) {
        this.password = password;
        this.passwordChange = 0;
    }

    public String getUsername() {
        return uid;
    }

    public void setUsername(String uid) {
        this.uid = uid;
    }

    public int getPasswordChange() {
        return passwordChange;
    }

    public void setPasswordChange(int passwordChange) {
        this.passwordChange = passwordChange;
    }
}
