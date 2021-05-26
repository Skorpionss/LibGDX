package ru.skorpionss;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGames extends ApplicationAdapter {
	SpriteBatch batch;
	Texture corabl, fonimg;
	private float w,h;
	
	@Override
	public void create () {
		w = Gdx.graphics.getWidth();
		h = Gdx.graphics.getHeight();
		batch = new SpriteBatch();
		corabl = new Texture("corabl.png");
		fonimg = new Texture("fon.jpg");
	}

	@Override
	public void render () {

		ScreenUtils.clear(0,0,0,0);
		batch.begin();
		batch.draw(fonimg, 0, 0,w,h);
		batch.draw(corabl, 20, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		corabl.dispose();
		fonimg.dispose();
	}
}
