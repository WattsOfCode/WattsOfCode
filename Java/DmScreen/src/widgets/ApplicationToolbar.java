package widgets;

import gui.DMScreen;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.border.AbstractBorder;

public class ApplicationToolbar extends JToolBar {
    private static final Dimension BUTTON_SIZE = new Dimension(50, 50);

    public ApplicationToolbar(DMScreen dmScreen) {
        
        setFloatable(false);
        setOrientation(JToolBar.VERTICAL);

        // locational above this line and presentation below
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));
        setBorder(null);

        // loading in images here
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("icons/plus50.png"));
        ImageIcon loadIcon = new ImageIcon(getClass().getResource("icons/upload50.png"));
        ImageIcon addWidgetIcon = new ImageIcon(getClass().getResource("icons/forward50.png"));
        ImageIcon helpIcon = new ImageIcon(getClass().getResource("icons/question50.png"));

        WidgetMenu addMenu = new WidgetMenu(dmScreen);

        JButton saveButton = createToolbarButton(saveIcon);
        saveButton.setToolTipText("Save Window Configuration.");
        saveButton.addActionListener(e -> System.out.println("Save clicked"));

        JButton loadButton = createToolbarButton(loadIcon);
        loadButton.setToolTipText("Load Window Configuration.");
        loadButton.addActionListener(e -> System.out.println("Load clicked"));

        JButton addWidgetButton = createToolbarButton(addWidgetIcon);
        addWidgetButton.setToolTipText("Add Widget Configuration.");
        addWidgetButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                addMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        JButton helpButton = new HelpButton("", helpIcon, "https://docs.oracle.com/javase/tutorial/uiswing/components/internalframe.html");
        helpButton.setToolTipText("Help clicked.");

        add(loadButton);
        add(new JToolBar.Separator(new Dimension(10, 10)));
        add(saveButton);
        add(new JToolBar.Separator(new Dimension(10, 10)));
        add(addWidgetButton);
        add(new JToolBar.Separator(new Dimension(10, 10)));
        add(helpButton);
    }

    private JButton createToolbarButton(ImageIcon icon) {
        JButton button = new JButton(icon);
        button.setPreferredSize(BUTTON_SIZE);
        button.setOpaque(true);
        button.setContentAreaFilled(false);
        button.setBorder(new RoundedBorder(10));
        button.setBackground(new Color(220, 220, 220));
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        return button;
    }

    /* A private static inner class to create a rounded border for buttons. */

    private static class RoundedBorder extends AbstractBorder {
        private final int radius;

        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Set the color to draw the border.
            g2.setColor(c.getForeground());

            // draw the outline, don't fill the rectangle
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            g2.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius, this.radius, this.radius, this.radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.right = insets.top = insets.bottom = this.radius;
            return insets;
        }
    }

}