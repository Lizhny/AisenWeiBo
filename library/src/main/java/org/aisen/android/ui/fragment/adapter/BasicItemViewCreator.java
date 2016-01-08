package org.aisen.android.ui.fragment.adapter;

import java.io.Serializable;

/**
 * Created by wangdan on 16/1/9.
 */
public abstract class BasicItemViewCreator<T extends Serializable> implements IItemViewCreator<T> {

    private int layoutRes;

    public BasicItemViewCreator(int layoutRes) {
        this.layoutRes = layoutRes;
    }

    @Override
    public int[][] setLayoutRes() {
        return new int[][]{ { layoutRes, IPagingAdapter.TYPE_NORMAL } };
    }

}
