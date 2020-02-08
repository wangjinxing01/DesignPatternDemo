package com.pattern.strategy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkCalculation {
    List<String> devicesType = new LinkedList<>();
    List<Formula> portFormulas = new LinkedList<>();
    List<String> formulas = new LinkedList<>();
    public LinkCalculation(String devicesType) {
        if (devicesType != null) {
            this.devicesType = Arrays.asList(devicesType.split(":"));
        }
        init();
    }

    private void init() {
        for (int i = 0; i < devicesType.size(); ++i) {
            if ("FibrePort".equals(devicesType.get(i))) {
                portFormulas.add(new FilbrePortFormula());
            } else if ("Ethernet".equals(devicesType.get(i))) {
                portFormulas.add(new EthernetFormula());
            } else {
              System.out.println("error");
            }
        }
    }

    public void getLinkCalculation() {
        for (Formula formula:portFormulas) {
            formulas.add(formula.getFormula());
        }
        for (String formula:formulas) {
            System.out.print(formula + "; ");
        }
        System.out.println();
    }
}
