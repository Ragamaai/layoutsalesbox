package com.example.ramsraga.salesbox.model;


public class ModelLeadsCard  {


    private int line1;
    private String line2;
    private String line3;
    private  String line4;
    private String line5;
    private String line6;
    private int line7;



    public ModelLeadsCard(int line1, String line2,String line3, String line4,String line5,String line6,int line7) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.line5 = line5;
        this.line6 = line6;
        this.line7=line7;

    }


    public int getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {return line3;}

    public String getLine4() {return line4;}
    public String getLine5() {return line5;}
    public String getLine6() {
        return line6;
    }
    public int getLine7() {
        return line7;
    }


}





