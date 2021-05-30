package ru.skorpionss.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.skorpionss.base.BaseScreen;

public class MenuScreen extends BaseScreen {

    Texture corabl, fonimg;
    private float w, h;
    private Vector2 pos,pos2;
    private Vector2 v;

    @Override
    public void show() {
        super.show();
        w = Gdx.graphics.getWidth();
        h = Gdx.graphics.getHeight();
        corabl = new Texture("corabl.png");
        fonimg = new Texture("fon.jpg");
        pos = new Vector2();
        v = new Vector2();
        pos2 = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        ScreenUtils.clear(0, 0, 0, 0);
        batch.begin();
        batch.draw(fonimg, 0, 0, w, h);
        batch.draw(corabl, pos.x, pos.y);
        batch.end();
        if (pos2.cpy().sub(pos).len() < v.len()){
            pos.set(pos2);
        } else {pos.add(v);
        }
    }

    @Override
    public void dispose() {
        super.dispose();
        corabl.dispose();
        fonimg.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        pos2.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(pos2.cpy().sub(pos).setLength(2f));
        return super.touchDown(screenX, screenY, pointer, button);
    }
}
