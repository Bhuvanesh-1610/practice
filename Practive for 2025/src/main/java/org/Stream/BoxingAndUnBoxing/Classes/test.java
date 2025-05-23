package org.Stream.BoxingAndUnBoxing.Classes;

import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        String size = size(Runtime.getRuntime().totalMemory());
        System.out.println(size);
    }

    public static String size(Long size){
        String hrSize = "";
        Long k = size;
        double m = size/1024;
        double g = size/1048576;
        double t = size/1073741824;

        DecimalFormat dec = new DecimalFormat("0.00");


        if (k>0)
        {

            hrSize = dec.format(k).concat("KB");

        }
        if (m>0)
        {

            hrSize = dec.format(m).concat("MB");
        }
        if (g>0)
        {

            hrSize = dec.format(g).concat("GB");
        }
        if (t>0)
        {

            hrSize = dec.format(t).concat("TB");
        }

        return hrSize;
    }
}
