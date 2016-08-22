package com.example.ramsraga.salesbox.model;


public class ModelTimelineCard  {


    private int line1;
    private String line2;
    private int line3;
    private  String line4;
    private String line5;
    private int line6;




    public ModelTimelineCard(int line1, String line2,int line3, String line4,String line5,int line6) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.line5 = line5;
        this.line6 = line6;


    }


    public int getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public int getLine3() {return line3;}

    public String getLine4() {return line4;}
    public String getLine5() {return line5;}
    public int getLine6() {
        return line6;
    }



}

