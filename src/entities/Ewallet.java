package entities;

public class Ewallet {
    private String phno;
    private String name;

    public Ewallet() {

    }

    public Ewallet(String phno, String name) {
        this.phno = phno;
        this.name = name;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String display = phno + " " + name;
        return display;
    }

    public boolean equals(Object obj) {
        if (obj.equals(this)) {
            return true;
        }
        if (obj == null || !(obj instanceof Ewallet)) {
            return false;
        }
        Ewallet e = (Ewallet) obj;
        return e.phno == this.phno;
    }

    @Override
    public int hashCode() {
        return phno.hashCode();
    }


}
