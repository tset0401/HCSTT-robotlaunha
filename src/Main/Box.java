/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Graphics;

/**
 *
 * @author 8TITTIT8
 */
public class Box extends FixedObstacle {
    
    public Box(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void updateRotation() {
        
    }
    
    public void updateRunning() {
        
    }
    
    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.box, super.getX(), super.getY(), null);
    }

}
