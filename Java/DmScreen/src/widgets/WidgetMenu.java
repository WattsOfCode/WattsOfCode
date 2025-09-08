package widgets;

import gui.DMScreen;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class WidgetMenu extends JPopupMenu {
 
    public WidgetMenu(DMScreen dmScreen) {

        // Create menu items for different widget types

        JMenuItem textWidget = new JMenuItem("Text Widget");
        JMenuItem imageWidget = new JMenuItem("Image Widget");
        JMenuItem buttonWidget = new JMenuItem("Button Widget");

        // Add the menu items to the pop-up menu

        add(textWidget);
        add(imageWidget);
        add(buttonWidget);

        textWidget.addActionListener(e -> {
            WidgetFrame newTextWidget = new WidgetFrame("Text Widget");
            newTextWidget.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameIconified(InternalFrameEvent e) {
                    dmScreen.getTaskbar().addMinimizedWidget(newTextWidget);
                }

                @Override
                public void internalFrameDeiconified(InternalFrameEvent e) {
                    dmScreen.getTaskbar().removeMinimizedWidget(newTextWidget);
                }

                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    dmScreen.getTaskbar().removeMinimizedWidget(newTextWidget);
                }
            });
            dmScreen.addWidget(newTextWidget);
        });

        // Add action listeners to each item (we'll implement the logic later)
        
        imageWidget.addActionListener(e -> System.out.println("Image Widget selected"));
        buttonWidget.addActionListener(e -> System.out.println("Button Widget selected"));       
    }
}