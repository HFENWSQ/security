package cn.qianyan.beans;

import org.springframework.stereotype.Component;

@Component
public class UserRight {
    private int uright;
    private int home;
    private int user;
    private int menu;
    private int area;
    private int device;

    public int getUright() {
        return uright;
    }

    public void setUright(int uright) {
        this.uright = uright;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getDevice() {
        return device;
    }

    public void setDevice(int device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "UserRight{" +
                "uright=" + uright +
                ", home=" + home +
                ", user=" + user +
                ", menu=" + menu +
                ", area=" + area +
                ", device=" + device +
                '}';
    }
}
