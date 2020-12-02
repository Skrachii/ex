package L1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class KgToLBS {
    public static void main(String[] args) {

       double OnelbsIskg=0.45359237;
       double lbs= 300 / OnelbsIskg;
        System.out.println("The KG you enterd are equal to " + lbs + " pounds");
    }
}
