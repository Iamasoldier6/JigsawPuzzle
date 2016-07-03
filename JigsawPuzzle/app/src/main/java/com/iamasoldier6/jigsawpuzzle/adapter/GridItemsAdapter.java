package com.iamasoldier6.jigsawpuzzle.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

/**
 * 拼图主界面数据适配器
 * <p>
 * Created by Iamasoldier6 on 7/3/16.
 */
public class GridItemsAdapter extends BaseAdapter {

    // 映射List
    private List<Bitmap> mBitmapItemLists;
    private Context mContext;

    public GridItemsAdapter(Context mContext, List<Bitmap> picList) {
        this.mContext = mContext;
        this.mBitmapItemLists = picList;
    }

    @Override
    public int getCount() {
        return mBitmapItemLists.size();
    }

    @Override
    public Object getItem(int position) {
        return mBitmapItemLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = null;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            // 设置布局图片
            imageView.setLayoutParams(new GridView.LayoutParams(
                    mBitmapItemLists.get(position).getWidth(),
                    mBitmapItemLists.get(position).getHeight()));
            // 设置显示比例类型
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageBitmap(mBitmapItemLists.get(position));
        return imageView;
    }
}
