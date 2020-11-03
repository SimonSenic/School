package sk.kosickaacademic.simon.school;

public class Grades {
    private int pro;
    private int web;
    private int dsy;

    public Grades(int pro, int web, int dsy){
        this.pro=pro;
        this.web=web;
        this.dsy=dsy;
    }

    public int getPro(){
        return pro;
    }

    public int getWeb(){
        return web;
    }

    public int getDsy(){
        return dsy;
    }

    public double getAverage(){
        return (pro+web+dsy)/3.0;
    }

}
