package menu;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.beans.*;
import java.util.ArrayList;

/**
 * The main menu panel
 * @author Ege Kaan Gürkan
 * @version 03/05/2019
 */

public class MainMenu extends Menu {

   private MenuTestClass m = new MenuTestClass(this);
   private ArrayList<Menu> menus;
   private ArrayList<JComponent> components;
   private boolean focused;
   private JLabel droneerLabel;
   DroneerMenuButton playButton;
   DroneerMenuButton designButton;
   DroneerMenuButton helpButton;
   DroneerMenuButton settingsButton;
   DroneerMenuButton creditsButton;
   DroneerMenuButton exitButton;
   
   public MainMenu() {
      
      this.menus = menus;
      
      components = new ArrayList<JComponent>();
      
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      
      // Block to set the label style
      droneerLabel = new JLabel("DRONEER");
      droneerLabel.setForeground(Color.WHITE);
      droneerLabel.setFont(new Font("Monospaced", Font.PLAIN, 50));
      droneerLabel.setBorder(new EmptyBorder(10,0,10,0));
      
      // Create the initialised buttons
      playButton = new DroneerMenuButton("Play");
      designButton = new DroneerMenuButton("Design");
      helpButton = new DroneerMenuButton("Help");
      settingsButton = new DroneerMenuButton("Settings");
      creditsButton = new DroneerMenuButton("Credits");
      exitButton = new DroneerMenuButton("Exit");
      
      // Add the components to an arraylist to quickly set the center alignment
      components.add(droneerLabel);
      components.add(playButton);
      components.add(designButton);
      components.add(helpButton);
      components.add(settingsButton);
      components.add(creditsButton);
      components.add(exitButton);
      
      exitButton.setMargin(new Insets(20,30,20,30));
      
      for(JComponent c: components) {
         c.setAlignmentX(Component.CENTER_ALIGNMENT);
      }
      
      focused = false;
      
      playButton.addActionListener(new ActionListener() {
         
         public void actionPerformed(ActionEvent e) {
            focused = true;
         }
         
      });
      add(droneerLabel);
      add(playButton);
      add(designButton);
      add(helpButton);
      add(settingsButton);
      add(creditsButton);
      add(exitButton);
   }
   
   /**
    * Sets the focused variable to a given value
    * @param a The boolean value to set focused to 
    */
   
   public void setFocused(boolean a) {
      focused = a;
   }
   
   /**
    * Returns whether the panel is focused or not
    */
   
   public boolean getFocused() {
      return focused;
   }
   
}

