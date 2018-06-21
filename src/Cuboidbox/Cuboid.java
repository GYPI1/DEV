package Cuboidbox;

import javax.media.opengl.GL;

import com.sun.opengl.util.texture.Texture;

public class Cuboid {
	
	public int mID; // Identify
	public int mCurStt; // Status of cube
	public int mNextStt;// Next status	
	public float mProgress; // progress when change status
	
	public float[] mPos;
	
	public CuboidDraw mCubeDraw; 
	public Cuboid (Texture _tex){
		mCubeDraw =new CuboidDraw(_tex); 
		mPos = new float [3];
	}
	public void Update (float deta){
		
	}
	public void Draw (GL gl){
		gl.glPushMatrix();//			
			gl.glScalef(1, 0.5f, 1);
			gl.glTranslatef(0, -1, 0);
			gl.glTranslatef(mPos[0], mPos[1], mPos[2]);
			mCubeDraw.Draw(gl);
		gl.glPopMatrix();
	}
}
