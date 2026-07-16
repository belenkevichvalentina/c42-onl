package homework_10;

import java.util.Objects;

public class User implements Cloneable{
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ID user " + this.id +
                " \n Login  " + this.login +
                " \n Password  " + this.password;

    }

    @Override
    public int hashCode() {

        int idHashCode = 31 * Integer.hashCode(this.id);
        int loginHashCode = 31 * login.hashCode();
        int passwordHashCode = 31 * password.hashCode();

        int result = idHashCode + loginHashCode + passwordHashCode;
        return result;
    }


    @Override
    public boolean equals(Object oject) {
        if (this == oject) return true;
        if (oject == null || getClass() != oject.getClass()) return false;
        User user = (User) oject;

        return id == user.id &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }


}
