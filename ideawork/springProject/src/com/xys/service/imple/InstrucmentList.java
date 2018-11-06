package com.xys.service.imple;

import com.xys.model.Instrument;
import com.xys.service.Poem;

/**
 * Created by Administrator on 2018/2/9.
 */
public class InstrucmentList implements Poem {

    private Instrument piano;

    public void setPiano(Instrument piano) {
        this.piano = piano;
    }

    @Override
    public void play() {
        System.out.println("Jone 表演");
        piano.play();
    }
}
