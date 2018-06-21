package Cuboidbox;

import javax.media.opengl.GL;

import com.sun.opengl.util.texture.Texture;

public class CuboidNormal extends Cuboid {

	public boolean miActive;
	public CuboidNormal mCubeLink=null;
	public CuboidNormal(Texture _tex) {
		super(_tex);
		miActive = true;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Update(float deta) {
		// TODO Auto-generated method stub
		super.Update(deta);
	}
	
	@Override
	public void Draw(GL gl) {
		// TODO Auto-generated method stub
		if(miActive){
			gl.glPushMatrix();
//				gl.glEnable(GL.GL_BLEND);
//				gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
//				gl.glDepthMask(false);
//				gl.glTranslatef(mX, 0, mZ);
				super.Draw(gl);
			gl.glPopMatrix();
		}
		
	}
	public void SetCubeLink (CuboidNormal _CubeLink){
		mCubeLink = _CubeLink;
		if(mCubeLink == null){
			System.out.println("Set cube link fail");
		}else{
			System.out.println("Set cube link complete");
		}
	}
	public void ActionLink (){
		
	}

	
	public int LinkST (){
		if(mCubeLink != null){
			mCubeLink.ActionLink();
		}
		return 0;
	}
	
	public int Link (){
		if(mCubeLink != null){
			mCubeLink.ActionLink();
		}
		return 0;
	}
}
