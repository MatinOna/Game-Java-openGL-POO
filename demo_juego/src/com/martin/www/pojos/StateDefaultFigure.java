/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.pojos;

import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class StateDefaultFigure extends ColorObject{
    
    public boolean mode;
    
    public StateDefaultFigure(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b,boolean mode) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b);
        this.mode=mode;
    }
    
}
