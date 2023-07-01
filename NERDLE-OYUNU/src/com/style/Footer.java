package com.style;

import javax.swing.*;

public class Footer {

    public static JPanel getFooter() {
        String footerText = "21 – 18011103 Talha BAYSAN";

        JPanel mainWrapper = new JPanel();
        mainWrapper.setLayout(new BoxLayout(mainWrapper, BoxLayout.X_AXIS));
        mainWrapper.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JLabel footerLabel = new JLabel(footerText);
        mainWrapper.add(footerLabel);
        mainWrapper.add(Box.createHorizontalGlue());

        return mainWrapper;
    }

}

