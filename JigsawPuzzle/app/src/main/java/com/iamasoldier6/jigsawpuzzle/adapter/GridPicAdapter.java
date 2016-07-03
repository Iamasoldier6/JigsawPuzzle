package com.iamasoldier6.jigsawpuzzle.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.iamasoldier6.jigsawpuzzle.util.ScreenUtil;

import java.util.List;

/**
 * 程序主界面数据适配器
 * <p>
 * Created by Iamasoldier6 on 7/2/16.
 */
public class GridPicAdapter extends BaseAdapter {

    // 映射List
    private List<Bitmap> picList;
    private Context context;

    public GridPicAdapter(Context context, List<Bitmap> picList) {
        this.context = context;
        this.picList = picList;
    }

    @Override
    public int getCount() {
        return picList.size();
    }

    @Override
    public Object getItem(int position) {
        return picList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = null;
        int density = (int) ScreenUtil.getDeviceDensity(context);
        if (convertView == null) {
            imageView = new ImageView(context);
            // 设置布局图片
            imageView.setLayoutParams(new GridView.LayoutParams(
                    80 * density,
                    100 * density));
            // 设置显示比例类型
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setBackgroundColor(Color.BLACK);
        imageView.setImageBitmap(picList.get(position));
        return imageView;
    }
}
